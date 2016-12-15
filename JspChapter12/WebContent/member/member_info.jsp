<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%
	String id= null;
	if ((session.getAttribute("id") == null) || (!((String) session.getAttribute("id")).equals("admin"))) 
	{
		out.println("<script>");
		out.println("location.href='loginForm.jsp'");
		out.println("</script>");
	}
	
	String info_id = request.getParameter("id");
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	try
	{
		Context init = new InitialContext();
		DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/OracleDB");
		conn = ds.getConnection();
		
		pstmt = conn.prepareStatement("select * from member where id = ?");
		pstmt.setString(1,info_id);
		rs=pstmt.executeQuery();
		rs.next();
	} catch(Exception e)
	{
		e.printStackTrace();
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ȸ������ �ý��� ������ ���</title>
</head>
<body>
<center>
<table border=1 width=300>
	<tr align = center>
		<td> ���̵�: </td>
		<td><%=rs.getString("id") %></td>
	</tr>
	<tr align = center>
		<td> ��й�ȣ: </td>
		<td><%=rs.getString("password") %></td>
	</tr>
	<tr align = center>
		<td> �̸�: </td>
		<td><%=rs.getString("name") %></td>
	</tr>
	<tr align = center>
		<td> ����: </td>
		<td><%=rs.getString("age") %></td>
	</tr>
	<tr align = center>
		<td> ����: </td>
		<td><%=rs.getString("gender") %></td>
	</tr>
	<tr align = center>
		<td> �̸��� �ּ�: </td>
		<td><%=rs.getString("email") %></td>
	</tr>
	<tr align = center>
		<td> ȸ��������: </td>
		<td><%=rs.getString("regdate") %></td>
	</tr>
	<tr align = center>
		<td colspan = 2> 
		<a href = "member_list.jsp">����Ʈ�� ���ư���</a>
		</td>		
	</tr>

</table>
</center>

</body>
</html>