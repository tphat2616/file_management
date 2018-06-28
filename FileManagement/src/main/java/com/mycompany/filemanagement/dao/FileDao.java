/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filemanagement.dao;

import com.mycompany.filemanagement.entity.File;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;

public class FileDao extends HttpServlet {

    public List<File> findAll() throws SQLException, ClassNotFoundException {
        List<File> list = new ArrayList<>();
        InitConnection cc = new InitConnection();
        

        try {
            cc.init();
            Statement st;
            st = cc.getConn().createStatement();
            String sql;
            sql = "SELECT * FROM file";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                File file = new File();
                file.setId(rs.getInt("id"));
                file.setName(rs.getString("name"));
                file.setPath(rs.getString("path"));
                file.setCreatedDate(rs.getDate("created_date_time"));
                file.setFileSize(rs.getDouble("file_size"));
                file.setMime(rs.getString("mime"));
                file.setNumOfDownload(rs.getInt("num_of_download"));
                file.setVersion(rs.getInt("version"));
                file.setStatus(rs.getBoolean("status"));
                file.setVersionlds(rs.getString("versionlds"));
                list.add(file);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(FileDao.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            cc.getConn().close();
        }
        return list;
    }
}