/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filemanagement.listener;

import com.mycompany.filemanagement.servlet.DatabaseConnect;
import java.io.File;

import java.io.OutputStream;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 *
 * @author root
 */
public class Listener implements ServletContextListener{
     @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            //for connect database on start server
            ServletContext sc = sce.getServletContext();
            String url = "jdbc:mysql://localhost:3306/file_management_system";
            String user = "root";
            String password="";            
            DatabaseConnect dc = new DatabaseConnect(url, user, password);
            sc.setAttribute("dc", dc);
            System.out.println(user+": Database Connected!!!");
            
            
            //for file upload location
            String rootPath = System.getProperty("catalina.home");
            ServletContext ctx = sce.getServletContext();
            String relativePath = ctx.getInitParameter("template.dir");
            File file = new File(rootPath+File.separator+relativePath);
            if(!file.exists()) file.mkdirs();
            System.out.println("File Directory created to be used for storing files");
            System.out.println("Path: "+rootPath);
            ctx.setAttribute("FILES_DIR_FILE", file);
            ctx.setAttribute("FILES_DIR", rootPath+File.separator+relativePath);
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Listener.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        DatabaseConnect dc = (DatabaseConnect)sc.getAttribute("dc");
        dc.closeConnection();
        System.out.println("Database Disconnected!!!");
    }
}
