<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String id = null;

	if(session.getAttribute("id") != null)
	{
		id = (String)session.getAttribute("id");
	} else 
	{
		out.println("<script>");
		out.println("location.href='loginForm.jsp'");
		out.println("</script>");
	}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>회원관리 시스템 메인 페이지</title>
</head>
<body>
<h3> <%=id %>로 로그인하셨습니다.</h3>
<%if(id.equals("admin")) 
{%>
<a href="member_list.jsp"> 관리자모드로 접속(회원목록 보기)</a> 
<%} %>

</body>
</html>