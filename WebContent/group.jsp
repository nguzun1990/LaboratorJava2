<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import="java.util.*" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Laboratorul 2</title>
<link rel="stylesheet" href="main.css">
<script type="text/javascript" src="main.js"></script>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
	reloadGroupUrl = "<%= request.getContextPath() %>/pages/group/list.jsp";
</script>
</head>

<body>
	<div id="message"></div>
	<a href="index.jsp">Go to users</a>
	<div class="left">
		<jsp:include page="pages/group/list.jsp"/>
	</div>
	<div class="right">
		<jsp:include page="pages/group/form.jsp"/>
	</div>
	
</body>
</html>