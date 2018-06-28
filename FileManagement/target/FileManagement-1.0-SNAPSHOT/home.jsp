<%-- 
    Document   : home
    Created on : Jun 21, 2018, 7:54:29 AM
    Author     : root
--%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java" %>
<%@ page import="java.io.*, java.util.*, java.sql.*" %>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<sql:setDataSource var = "snapshot" driver = "com.mysql.jdbc.Driver"
            url = "jdbc:mysql://localhost:3306/filemanagement?useUnicode=yes&characterEncoding=UTF-8"
            user = "root"  password = ""/>
<sql:query dataSource="${snapshot}" var="result">
        select * from file;
</sql:query>
<jsp:include page="header.jsp"/>

<head>
    <title>File Management</title>
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>

<body>

<div style="height: 50px"></div>
    
<div class="container">
    <link rel='stylesheet prefetch' href='http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css'>
    <div class="mail-box">   
        <div class="row">
            <div class="panel panel-success">
                <div class="panel-heading">
                        <button class="btn btn-default" data-toggle="modal" data-target="#exampleModal">Setting <span class="glyphicon glyphicon-cog"></span></button>
                
                        <div class="pull-right">
                            <button class="btn btn-info float-right">Upload</button>
                        </div>
                        <div class="pull-right ">
                            <label class="form-control">
                            <input type="file"/>
                            </label>
                        </div>
                </div>
                <div class="panel-body">
                    <table class="table table-striped table-bordered table-hover table-condensed">
                        <thead>
                            <tr>
                                <th>Index</th>
                                <th>File Name</th>
                                <th>Version</th>
                                <th>File size</th>
                                <th>Created Time</th>
                                <th>Download</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="row" items="${result.rows}">
                            <tr>
                                    <td><c:out value="${row.id}"/></td>
                                    <td><c:out value="${row.name}"/></td>
                                    <td><c:out value="${row.version}"/></td>
                                    <td><c:out value="${row.filesize }"/></td>
                                    <td><c:out value="${row.createddatetime}"/></td>
                                    <td><c:out value="${row.numberofdownload}"/></td>
                                    <td>
                                    <button class="btn btn-default"><span class="glyphicon glyphicon-download-alt"></span></button>
                                    <button class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span></button>
                                    </td>
                                    
                            </tr>
                            </c:forEach>
                            
                        </tbody>
                    </table>
                </div>
            </div>
        
        <div class="shadow-lg p-4 mb-4 bg-white">                
            <div class="text-center">
                <ul class="pagination">
                    <li class="active"><span>1</span></li>
                    <li><a href="http://bootsnipp.com/search?q=page&page=2">2</a></li>
                    <li><a href="http://bootsnipp.com/search?q=page&page=3">3</a></li>
                    <li><a href="http://bootsnipp.com/search?q=page&page=4">4</a></li>
                    <li class="disabled"><span>...</span></li>
                    <li><a href="http://bootsnipp.com/search?q=page&page=22">5</a></li>
                    <li><a href="http://bootsnipp.com/search?q=page&page=2" rel="next">></a></li>
                </ul>
            </div>
        </div>
                        
        </div>
    </div>
</div>    
    
                        
    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">Setting</h5>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <a class="panel-close close" data-dismiss="alert" aria-hidden="true">×</a>
            </button>
          </div>
          <div class="modal-body">
            <div class="form-group" id="carform">
                <label class="control-label" for="inputWarning">Max file size (MB)</label>
                <input class="form-control" id="inputWarning" type="text">
                <label class="control-label" for="inputWarning">Item per page</label>
                <input class="form-control" id="inputWarning" type="text">
                <label class="control-label" for="inputWarning">Allow upload type</label>
                <select class="form-control" form="carform">
                  <option value="global">GLobal</option>
                  <option value="week">This Week</option>
                  <option value="month">This Month</option>
                  <option value="year">This Year</option>
                </select>
            </div>
          </div>
          <div class="modal-footer">
            <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
            <button type="button" class="btn btn-success">Save changes</button>
          </div>
        </div>
      </div>
    </div>  
    <!-- End Modal -->
    
</body>

<div style="height: 50px"></div>
<jsp:include page="footer.jsp"/>