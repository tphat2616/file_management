<%-- 
    Document   : test
    Created on : Jun 22, 2018, 1:27:35 PM
    Author     : root
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head></head>
<body>
<form action="UploadDownloadFileServlet" method="post" enctype="multipart/form-data">
Select File to Upload:<input type="file" name="fileName">
<br>
<input type="submit" value="Upload">
</form>
</body>
</html>
