<%-- 
    Document   : upload
    Created on : Jun 21, 2018, 8:28:10 AM
    Author     : root
--%>

<jsp:include page="header.jsp"/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form class="form-inline" action="upload" method="post" enctype="multipart/form-data">
		<div>
		    <input type="file" class="form-control" name="fileName" multiple>
		    <button class="btn btn-info float-right" type="submit">click me</button>
		</div>
	</form>
</body>
<jsp:include page="footer.jsp"/>"
