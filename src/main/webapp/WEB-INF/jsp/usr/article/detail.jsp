<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.example.demo.vo.Article"%>
<%@ page import="com.example.demo.service.ArticleService"%>
<!DOCTYPE html>
<%

%>
<html>
<head>
<meta charset="UTF-8">
<title>DETAIL</title>
</head>
<body>
	<h1>${article.id}번게시물</h1>

	<hr />

	<ul>
		<li>번호 : ${article.id }</li>
		<li>날짜 : ${article.regDate.substring(0,10) }</li>
		<li>수정 날짜 : ${article.updateDate.substring(0,10) }</li>
		<li>제목 : ${article.title }</li>
		<li>내용 : ${article.body }</li>
		<li>작성자 : ${article.memberId }</li>
		<div>
			<a class="hover:underline" href="../article/modify?id=" ${article.id }>수정</a>
		</div>
		<div>
			<a class="hover:underline" href="../article/delete?id="${article.id }">삭제</a>
		</div>
	</ul>


</body>
</html>