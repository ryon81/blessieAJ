<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	session.setMaxInactiveInterval(10);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Session Test</title>
</head>
<body>
<h2>�����׽�Ʈ
</h2>

isNew(); <%=session.isNew()%><br>
�����ð�: <%=session.getCreationTime()%><br>
�������ӽð�: <%=session.getLastAccessedTime()%><br>
����IG: <%=session.getId()%>

</body>
</html>