<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "net.board.db.*" %>
<%
	BoardBean board = (BoardBean)request.getAttribute("boarddata");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>MVC �Խ���</title>
</head>
<body>
<table cellpadding="0" cellspacing="0">
	<tr align="center" valign="middle">
		<td colspan="5"> MVC �Խ��� </td>
	</tr>
	<tr>
		<td style="font-family:����; font-size:12" height="16">
			<div align="center">����&nbsp;&nbsp;</div>
		</td>
		<td style="font-family:����; font-size:12">
		<%=board.getBOARD_SUBJECT() %>
		</td>
	</tr>
		
	<tr bgcolor="cccccc">
		<td colspan="2" style="height:1px;">
			<div align="center">����</div>
		</td>
		<td style="font-family:����; font-size:12">
			<table border=0 width=490 heigth=250 style="table-layout:fixed">
				<tr>
					<td valign=top style="font-family:����; font-size:12">
					<%=board.getBOARD_CONTENT() %>
					</td>
				</tr>
			</table>
		</td>
	</tr>
	<tr>
		<td style="font-family:����; font-size:12">
			<div align="center">÷������</div>
		</td>
		<td style="font-family:����; font-size:12">
		<%if(!(board.getBOARD_FILE()==null)){ %>
		<a href="./boarduplaod/"<%=board.getBOARD_FILE() %>">
			<%=board.getBOARD_FILE() %>
		</a>
		<%} %>
		</td>
	</tr>
	<tr bgcolor="cccccc">
		<td colspan="2" style="height:1px;"></td>
	</tr>
	<tr> 
		<td colspan="2">&nbsp;</td>
	</tr>
	
	<tr align="center" valign="middle">
		<td colspan="5">
			<font size=2>
			<a href="./BoardReplyAction.bo?num=<%=board.getBOARD_NUM() %>">
			[�亯]
			</a>&nbsp;&nbsp;
			<a href="./BoardModify.bo?num=<%=board.getBOARD_NUM() %>">
			[����]
			</a>&nbsp;&nbsp;
			<a href="./BoardDelete.bo?num=<%=board.getBOARD_NUM() %>">
			[����]
			</a>&nbsp;&nbsp;
			<a href="./BoardList.bo?">[���]</a>&nbsp;&nbsp;
			</font>
		</td>		
	</tr>
</table>

</body>
</html>