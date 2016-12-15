<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>

<%
	request.setCharacterEncoding("euc-kr");
	String id = request.getParameter("id");
	String pass = request.getParameter("pass");
	String name = request.getParameter("name");
	int age = Integer.parseInt(request.getParameter("age"));
	String gender = request.getParameter("gender");
	String email = request.getParameter("email");
	Date regDate = new SimpleDataFormat(System.currentTimeMillis());	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try
	{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		conn = ds.getConnection();
		
		pstmt = conn.prepareStatement("insert into member values(?,?,?,?,?,?,?)");
		pstmt.setString(1,id);
		pstmt.setString(2,pass);
		pstmt.setString(3,name);
		pstmt.setInt(4,age);
		pstmt.setString(5,gender);
		pstmt.setString(6,email);
		pstmt.setTime(7,regDate);
		int result = pstmt.executeUpdate();
		
		if(result != 0)
		{
			out.println("<script>");
			out.println("location.href='loginForm.jsp'");
			out.println("</script>");
		} else
		{
			out.println("<script>");
			out.println("location.href='joinForm.jsp'");
			out.println("</script>");
		}
		
	} catch(Exception e)
	{
		e.printStackTrace();
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

</body>
</html>