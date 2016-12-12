<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String language="korea";
	String cookie = request.getHeader("Cookie");
	
	if(cookie != null)
	{
		Cookie cookies[] = request.getCookies();
		
		for(int i = 0; i < cookies.length; i++)
		{
			if(cookies[i].getName().equals("language"))
			{
				language = cookies[i].getValue();
			}
		}
	}
%> 


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>��Ű�� �̿��� ȭ�� ���� ����</title>
</head>
<body>
	<%if(language.equals("korea")) {%>
		<h3> �ȳ��ϼ��� �̰��� ��Ű �����Դϴ�.</h3>
	<%}else{ %>
		<h3>Hello. This is Cookie example.</h3>
	<%} %>
	
	<form action = "cookieExample2.jsp" method="post">
		<input type="radio" name="language" value="korea" <%if(language.equals("korea")){ %>check<%} %>> �ѱ��� ������ ����
		<input type="radio" name="language" value="english" <%if(language.equals("english")){ %>check<%} %>> ���� ������ ����
		<input type="submit" value="����">
	</form>

</body>
</html>