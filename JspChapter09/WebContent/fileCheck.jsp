<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%
	request.setCharacterEncoding("euc-kr");
	String name = request.getParameter("name");
	String subject = request.getParameter("subject");
	String filename1 = request.getParameter("filename1");
	String filename2 = request.getParameter("filename2");
	
	String origfilename1 = request.getParameter("origfilename1");
	String origfilename2 = request.getParameter("origfilename2");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>���� ���α� Ȯ�� �� �ٿ�ε�</title>
</head>
<body>
�ø����: <%=name%><br>
����: <%=subject%><br>

���ϸ�1 : <a href="file_down.jsp?file_name=<%=filename1 %>"><%=origfilename1 %></a><br>
���ϸ�2 : <a href="file_down.jsp?file_name=<%=filename2 %>"><%=origfilename2 %></a><br>


</body>
</html>