/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filemanagement.servlet;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
//import java.util.logging.Logger;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.apache.commons.fileupload.FileItem;
//import org.apache.commons.fileupload.FileUploadException;
//import org.apache.commons.fileupload.disk.DiskFileItemFactory;
//import org.apache.commons.fileupload.servlet.ServletFileUpload;
//
//
///**
// *
// * @author root
// */
//@WebServlet(urlPatterns="/upload")
////public class FileUpload extends HttpServlet{
//    /*private static final long serialVersionUID = 1L;
//    private ServletFileUpload uploader = null;
//    
//    @Override
//    public void init() throws ServletException{
//        DiskFileItemFactory fileFactory = new DiskFileItemFactory();
//        File fileDir = (File)getServletContext().getAttribute("FILES_DIR_FILE");
//        fileFactory.setRepository(fileDir);
//        this.uploader = new ServletFileUpload(fileFactory);        
//    }
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
//            throws ServletException, IOException{
//        if(!ServletFileUpload.isMultipartContent(req)){
//            throw new ServletException("Content type is not multipart/form-data");
//        }
//        
//        res.setContentType("text/html");
//        PrintWriter out = res.getWriter();
//        out.write("<html><head></head><body>");
//        try{
//            List<FileItem> fileItemList = uploader.parseRequest(req);
//            for(FileItem fileItem:fileItemList){
//                System.out.println("FieldName="+fileItem.getFieldName());
//                System.out.println("FileName="+fileItem.getName());
//                System.out.println("ContentType="+fileItem.getContentType());
//                System.out.println("Size in Bytes="+fileItem.getSize());
//                
//                File file = new File(req.getServletContext().getAttribute("FILES_DIR")
//                        +File.separator+fileItem.getName());
//                System.out.println("Absolute Path at Server: "+file.getAbsolutePath());
//                fileItem.write(file);
//                out.write("File "+fileItem.getName()+ " uploaded successfully.");
//		out.write("<br>");
//		out.write("<a href=\"download?fileName="+fileItem.getName()
//                        +"\">Download "+fileItem.getName()+"</a>");
//            }
//            
//        } catch (FileUploadException ex) {
//            Logger.getLogger(FileUpload.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}*/
