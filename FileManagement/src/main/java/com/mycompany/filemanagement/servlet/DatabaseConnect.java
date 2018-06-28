/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filemanagement.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class DatabaseConnect {
     private Connection conn=null;

    public DatabaseConnect(String url, String user, String password) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        this.conn = DriverManager.getConnection(url, user, password);
    }
    
    public Connection getConnection(){
        return conn;
    }
   
    
    public void closeConnection(){
        try{
            if(conn!=null)
                conn.close();
        }catch(SQLException e){}
    }
}
