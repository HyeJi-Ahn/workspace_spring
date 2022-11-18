<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
<form action="insertName.do" method="post">
	<input name="firstName">
	<input name="lastName">
	<input name="job">
	<input name="age">

	<button>DB 저장</button>
</form>
<p>${hello }</p>
<c:forEach var="num" items="${list}" varStatus="status">
	<p>${num}, ${status.index }, ${status.count }</p>
</c:forEach>
<a href="getNameList.do">리스트</a>
<!-- a tag는 get 방식 -->
</body>
</html>
