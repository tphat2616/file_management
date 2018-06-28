/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filemanagement.dao;

import com.mycompany.filemanagement.entity.File;
import com.mycompany.filemanagement.entity.Setting;
import com.mycompany.filemanagement.servlet.DatabaseConnect;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
/**
 *
 * @author root
 */
public class SettingDao extends HttpServlet{
    public List<Setting> findAll() throws SQLException, ClassNotFoundException {
        List<Setting> list = new ArrayList<>();
        DatabaseConnect dc = (DatabaseConnect) getServletContext().getAttribute("dc");

        try {
            Statement st;
            st = dc.getConnection().createStatement();
            String sql;
            sql = "SELECT * FROM setting";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Setting setting = new Setting();
                setting.setId(rs.getInt("id"));
                setting.setMaxFileSize(rs.getDouble("maxFileSize"));
                setting.setItemPerPage(rs.getInt("itemPerPage"));
                setting.setMimeTypeAllowed(rs.getString("mimeTypeAllowed"));
                setting.setLastUpdateTime(rs.getDate("lastUpdateTime"));
                list.add(setting);
            }
        } catch (SQLException ex) {
            Logger.getLogger(File.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            dc.getConnection().close();
        }
        return list;
    }
}
