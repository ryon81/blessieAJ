<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="com.oreilly.servlet.MultipartRequest" %>
<%@ page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy" %>
<%@ page import="java.util.*" %>
<%
	String uploadPath=request.getRealPath("upload");;
	
	int size = 10*1024*1024;
	String name = "";
	String subject = "";
	String filename1 = "";
	String filename2 = "";
	String origfilename1 = ""; 
	String origfilename2 = "";  
	
	try
	{
		MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "euc-kr", new DefaultFileRenamePolicy());
		
		name=multi.getParameter("name");
		subject=multi.getParameter("subject");
		
		Enumeration files = multi.getFileNames();
		
		String file1 = (String)files.nextElement();
		filename1 = multi.getFilesystemName(file1);
		origfilename1 = multi.getOriginalFileName(file1);
		
		String file2 = (String)files.nextElement();
		filename2 = multi.getFilesystemName(file2);
		origfilename2 = multi.getOriginalFileName(file2);
		
	} catch(Exception e)
	{
		e.printStackTrace();
	}
	%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>File Upload</title>
</head>
<body>
<form name="filecheck" action = "fileCheck.jsp" method="post"> 
	<input type="hidden" name = "name" value = "<%=name%>">
	<input type="hidden" name = "subject" value = "<%=subject%>">
	<input type="hidden" name = "filename1" value = "<%=filename1%>">
	<input type="hidden" name = "filename2" value = "<%=filename2%>">
	<input type="hidden" name = "origfilename1" value = "<%=origfilename1%>">
	<input type="hidden" name = "origfilename2" value = "<%=origfilename2%>">
</form>
<a href = "#" onclick="javascript:filecheck.submit()">업로드 확인 및 다운로드 페이지 이동</a>

</body>
</html>