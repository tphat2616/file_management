/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filemanagement.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author root
 */
public class InitConnection {
     public static final String DB_URL = "dbc:mysql://localhost:3306/filemanagement";
        public static final String USER_NAME = "root";
        public static final String PASSWORD = "";
        
        public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        
        private Connection conn = null;
        
        public Connection getConn(){
            return conn;
        }
        
        public void setconn(Connection conn){
            this.conn = conn;
        }
        
        public void init() throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.jdbc.Driver");
            
            System.out.println("connecting to database ...");
            conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
        }
         public void closeConn() {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
        }
         }
    }
