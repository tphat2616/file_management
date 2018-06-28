/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package com.mycompany.filemanagement.dao;
//
//import com.mycompany.filemanagement.entity.File;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//
///**
// *
// * @author root
// */
//
//public class Uploading extends HttpServlet{
//    private static final long serialVersionUID = 1L;
//    private ServletFileUpload uploader = null;
//    
//    public void init() throws ServletException{
//        DiskFileItemFactory fileFactory = new DiskFileItemFactory();
//        File fileDir = (File)getServletContext().getAttribute("FILES_DIR_FILE");
//        fileFactory.setRepository(fileDir);
//        this.uploader = new ServletFileUpload(fileFactory);        
//    }
//    
//}
