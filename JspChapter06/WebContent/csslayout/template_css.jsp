<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String pagefile=request.getParameter("page");
	if(pagefile == null){pagefile="newitemcss";}	
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Template Test</title>
<link type="text/css" rel="stylesheet" href="css/mystyle.css">
</head>

<body>

<header id ="header">
<jsp:include page="topcss.jsp"/>
</header>

<nav id ="nav">
<jsp:include page="leftcss.jsp"/>
</nav>

<section id ="content">
<jsp:include page='<%=pagefile+".jsp" %>'/>
</section>

<footer id ="footer">
<jsp:include page="bottomcss.jsp"/>
</footer>

</body>
</html>