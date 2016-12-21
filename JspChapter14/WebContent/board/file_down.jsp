<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "net.board.db.*" %>
<%@ page import="java.io.File" %>
<%@ page import="java.io.*" %>
<%
	BoardBean board = (BoardBean)request.getAttribute("boarddata");
		
	String fileName = request.getParameter("filename"); 	
	
	String savePath = "boardupload";
	ServletContext context = getServletContext();
	String sDownloadPath = context.getRealPath(savePath);
	String sFilePath = sDownloadPath + "\\" + fileName;
	
	byte b[] = new byte[4096];
	File oFile = new File(sFilePath);
	
	FileInputStream in = new FileInputStream(sFilePath);
	
	String sMimeType = getServletContext().getMimeType(sFilePath);
	System.out.println("sMimeType >>>" + sMimeType);
	
	if(sMimeType==null)sMimeType = "application/octet-stream";
response.setContentType(sMimeType);
	
	String sEncoding = new String(fileName.getBytes("euc-kr"),"8859_1");
	response.setHeader("Content-Disposition", "attachment; filename=" + sEncoding);
	
	ServletOutputStream out2 = response.getOutputStream();
	int numRead;
	
	while((numRead = in.read(b,0,b.length)) != -1) 
	{
		out2.write(b,0,numRead);
	}
	out2.flush();
	out2.close();
	in.close();
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