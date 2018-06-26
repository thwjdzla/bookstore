<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar navbar-default">
	<div class="container">
		<div class="navbar-header">
	    	<a class="navbar-brand" href="#">우리 회사</a>
	    </div>
	    <ul class="nav navbar-nav">
	    	<li class="active"><a href="#">홈</a></li>
	    </ul>
	    <ul class="nav navbar-nav navbar-right">
	    	<li><a href="/mail/login.do">로그인</a></li>
	    	<li><a href="/mail/register.do">회원가입</a></li>
	    </ul>
	</div>
</nav>
<div class="container">
	<div class="jumbotron">
    	<h1>메일 보내기 연습</h1> 
    	<p>회원 가입 후 메일 발송 연습</p> 
  	</div>
</div>
</body>
</html>