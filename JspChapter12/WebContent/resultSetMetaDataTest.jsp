<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<% 
	Connection conn = null;
	String sql ="select * from dept01";
	
	try
	{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		conn=ds.getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		ResultSetMetaData rsmd = rs.getMetaData();
		
		out.println("컬럼 수: " + rsmd.getColumnCount() + "<br>");
		for(int i=1; i<=rsmd.getColumnCount(); i++)
		{
			out.println(i + "번째 컬럼의 이름: "+rsmd.getColumnName(i)+"<br>");
			out.println(i + "번째 컬럼의 타입이름: " + rsmd.getColumnTypeName(i)+"<br>");
		} 
	} catch (Exception e)
	{			
		e.printStackTrace();
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ResultSet</title>
</head>
<body>

</body>
</html>