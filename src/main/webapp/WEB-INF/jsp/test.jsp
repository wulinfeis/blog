<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>代码君博客</title>

 <script src="/static/js/jquery.min.js"></script>
 <script>
 function heh(){

	 var x1 = document.getElementById("testid").innerText;
	 alert(x1);
 }
 </script>

</head>
<body class="user-select">

<!-- 引入头部 -->
<%@ include file="head.jsp"%>
<div>
<span id="testid">aaaa</span>
<a href="javascript:void(0)" onclick="heh()">aaa</a>
</div>
<!-- 引入底部 -->
<%@ include file="footer.jsp" %>

</body>
</html>