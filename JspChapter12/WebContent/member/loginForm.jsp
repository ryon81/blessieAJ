<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>ȸ������ �ý��� �α��� ������</title>
</head>
<body>
<form name="loginform" action="loginProcess.jsp" method="post">
<center> 
<table border=1>
	<tr>
		<td colspan="2" align = center>
			<b><font size = 5> �α��� ������</font></b>
		</td>
	</tr>
	<tr>
		<td>���̵�:</td>
		<td><input type="text" name="id"/></td>
	</tr>
	<tr>
		<td>��й�ȣ:</td>
		<td><input type="password" name="pass"/></td>
	</tr>
	<tr> 
		<td colspan ="2" align = center>
			<a href="javascript:loginform.submit()">�α���</a>&nbsp;&nbsp;
			<a href="joinForm.jsp">ȸ������</a>
		</td>
	</tr>		
</table>
</center>
</form>
</body>
</html>