/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filemanagement.listener;

import com.mycompany.filemanagement.servlet.DatabaseConnect;
import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
/**
 *
 * @author root
 */
public class FileLocationContextListener implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
    	String rootPath = System.getProperty("catalina.home");
    	ServletContext ctx = servletContextEvent.getServletContext();
    	String relativePath = ctx.getInitParameter("tempfile.dir");
    	File file = new File(rootPath + File.separator + relativePath);
    	if(!file.exists()) file.mkdirs();
    	System.out.println("File Directory created to be used for storing files");
    	ctx.setAttribute("FILES_DIR_FILE", file);
    	ctx.setAttribute("FILES_DIR", rootPath + File.separator + relativePath);
    }

    @Override
	public void contextDestroyed(ServletContextEvent servletContextEvent) {
		ServletContext sc = servletContextEvent.getServletContext();
                DatabaseConnect dc = (DatabaseConnect)sc.getAttribute("dc");
                dc.closeConnection();
                System.out.println("Database Disconnected!!!");
	}
}