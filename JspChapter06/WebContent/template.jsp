<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String pagefile=request.getParameter("page");
	if(pagefile == null){pagefile="newitem";}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Template Test</title>
</head>
<body>
<table width="960" border="1" bgcolor="gray" align="center">
<tr>
<td height="43" colspan=3 align=left>
<jsp:include page="top.jsp"/>
</td>
</tr>
<tr>
<td weight="15%" align=right valign=top><br>
<jsp:include page="left.jsp"/>
</td>
<td colspan=2 align=center>
<jsp:include page='<%=pagefile +".jsp" %>'/>
</td>
</tr>
<tr>
<td height="100%" height="40" colspan="3">
<jsp:include page="bottom.jsp"/>
</td>
</tr>

</table>
</body>
</html>