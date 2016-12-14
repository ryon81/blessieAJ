<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<% 
	Connection conn = null;
	String sql ="select * from emp01";
	
	try
	{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		conn=ds.getConnection();
		
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		
		ResultSetMetaData rsmd = rs.getMetaData();
		
		out.println("�÷� ��: " + rsmd.getColumnCount() + "<br>");
		
		
		for(int i=1; i<=rsmd.getColumnCount(); i++)
		{
			out.print(rsmd.getColumnName(i) + " / ");			
		}		
		
		while(rs.next())
		{
			out.println("<br>" + rs.getInt(1) + " / " + rs.getString(2) + " / " + rs.getString(3) + " / " + rs.getInt(4) + " / " + rs.getDate(5) + " / " + rs.getInt(6) + " / " + rs.getInt(7) + " / " + rs.getInt(8) + "<br>");			
		}
		
		rs.close();
		
	} catch (Exception e)
	{	
		out.println("<h3> ������ �������⿡ �����Ͽ����ϴ�. </h3>");
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