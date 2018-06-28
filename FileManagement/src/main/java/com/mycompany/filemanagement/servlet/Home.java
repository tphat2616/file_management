/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.filemanagement.servlet;


import com.mycompany.filemanagement.dao.FileDao;
import com.mycompany.filemanagement.entity.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/home")
public class Home extends HttpServlet {

    private static final long serialVersionUID = 1L;
    private FileDao fileDao = new FileDao();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try {
            //getServletContext().getAttribute("dc");
            
            List<File> listFile;
            listFile = fileDao.findAll();
            request.setAttribute("listBook", listFile);
            request.setAttribute("name", "test");
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/home.jsp");
            rd.forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
