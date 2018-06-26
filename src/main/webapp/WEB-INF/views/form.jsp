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
	 <h1>회원가입</h1>
	 <form class="well" method="post" action="register.do">
	 	<div class="form-group">
	 		<label>이름</label>
	 		<input type="text" class="form-control" name="username" />
	 	</div>
	 	<div class="form-group">
	 		<label>이메일</label>
	 		<input type="email" class="form-control" name="email" />
	 	</div>
	 	<div class="form-group">
	 		<label>비밀번호</label>
	 		<input type="password" class="form-control" name="pwd" />
	 	</div>
	 	<div class="text-right">
	 		<button class="btn btn-primary">등록</button>
	 	</div>
	 </form>
</div>
</body>
</html>