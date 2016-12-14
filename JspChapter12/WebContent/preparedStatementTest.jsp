<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<% 
	Connection conn = null;
	String sql ="insert into dept01 values(?,?,?)";
	
	try
	{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		conn=ds.getConnection();
		PreparedStatement stmt = conn.prepareStatement(sql);
		
		stmt.setInt(1, 50);
		stmt.setString(2, "IT");
		stmt.setString(3, "SEOUL");
		
		stmt.executeUpdate();
		
		out.println("<h3> 레코드를 등록하였습니다. </h3>");
	} catch (Exception e)
	{	
		out.println("<h3> 레코드 등록에 실패하였습니다. </h3>");
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