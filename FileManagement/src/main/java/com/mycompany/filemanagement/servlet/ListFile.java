///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.mycompany.filemanagement.servlet;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author root
// */
//public class ListFile {
//    public List<Book> findAll() throws SQLException {
//        List<Book> list = new ArrayList<>();
//        InitConnection init = new InitConnection();
//        try{
//            init.init();
//            Statement stmt = null;
//            stmt = init.getConn().createStatement();
//            String sql;
//            sql = "select * from Book";
//            ResultSet rs = stmt.executeQuery(sql);
//            while(rs.next()){
//                int id = rs.getInt("id");
//                String title = rs.getString("title");
//                String author = rs.getString("author");
//                String description = rs.getString("description");
//                Book b = new Book(id, title, author, description);
//                list.add(b);
//            }
//        }catch(ClassNotFoundException | SQLException ex){
//            Logger.getLogger(BookDao.class.getName()).log(Level.SEVERE, null, ex);           
//        } finally{
//            init.getConn().close();
//        }
//        return list;
//    }
//}
