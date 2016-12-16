<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSTL core 라이브러리 사용 예제 2</title>
</head>
<body>
<c:forEach var="test" begin="1" end="10" step="2">
	<b>${test}</b>&nbsp;
</c:forEach>

<br>

<select name="searchValue">
<c:set value="2009" var="num2" />
<c:forEach var="num" begin="2000" end="2009" step="1">
<option value="${num2}">${num2}</option>
<c:set value="${num2-1}" var="num2" />
</c:forEach>
</select>

<br>
<c:forTokens var="alphabet" items="a,b,c,d,e,f,g,h,i,j,k,l,m,n" delims=",">
	<b>${alphabet}</b>&nbsp;
</c:forTokens>


</body>
</html>