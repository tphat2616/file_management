/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filemanagement.servlet;

import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

public class UpLoadServerlet {

    private static final long serialVersionUID = 1L;

    public UpLoadServerlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, FileUploadException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, FileUploadException {
        // xử lý upload file khi người dùng nhấn nút thực hiện
        DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
        
        try {
            List<FileItem> fileItems = upload.parseRequest(request);
            for (FileItem fileItem : fileItems) {
                if (!fileItem.isFormField()) {
                    // xử lý file
                    String nameimg = fileItem.getName();
                    if (!nameimg.equals("")) {
                        String dirUrl = request.getServletContext().getRealPath("") + File.separator + "files";
                        File dir = new File(dirUrl);
                        if (!dir.exists()) {
                            dir.mkdir();
                        }
                        String fileImg = dirUrl + File.separator + nameimg;
                        File file = new File(fileImg);
                        try {
                            fileItem.write(file);
                            System.out.println("UPLOADing ...!");

                        } catch (Exception e) {
                            System.out.println("error!");
                        }
                    }
                }
            }
        } catch (FileUploadException e) {
        }
        
    }
}