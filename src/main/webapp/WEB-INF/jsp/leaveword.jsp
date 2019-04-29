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
<style type="text/css">
.input{
width:100px;
height:24px;
border:none;
border-bottom: 2px solid #FFFFFF;
background:rgba(0, 0, 0, 0);
padding:2px 0 0 2px;
}
.inputd{
width:230px;
height:24px;
border:none;
border-bottom: 2px solid #FFFFFF;
background:rgba(0, 0, 0, 0);
padding:2px 0 0 2px;
}
.inputs{
width:350px;
height:200px;
line-height:33px;
font-size:17px;
font-family:Arial, Helvetica, sans-serif;
background:url() no-repeat center bottom;
border:none;
padding:2px 0 0 2px;
}
#div1{
    margin-top: 100px;
    width: 350px;
    border-bottom: 2px solid #FFFFFF;
    position:relative;
    top:-269px
    }
#div2{
margin-top: 100px;
width: 350px;
border-bottom: 2px solid #FFFFFF;
position:relative;
top:-336px
}
#div3{
margin-top: 100px;
width: 350px;
border-bottom: 2px solid #FFFFFF;
position:relative;
top:-405px
}
#div4{
margin-top: 100px;
width: 350px;
border-bottom: 2px solid #FFFFFF;
position:relative;
top:-474px
}
.font_title{
color:white;
position:relative;
left:370px;
font-size:30px;
}
#login_click{ margin-top:32px; height:70px;width:200px;}
#login_click input 
{
    
 
    text-decoration:none;
	background:#2f435e;
	color:#f2f2f2;
	
	padding: 10px 30px 10px 30px;
	font-size:16px;
	font-family: 微软雅黑,宋体,Arial,Helvetica,Verdana,sans-serif;
	font-weight:bold;
	border-radius:3px;
	
	-webkit-transition:all linear 0.30s;
	-moz-transition:all linear 0.30s;
	transition:all linear 0.30s;
	
	}
   #login_click input:hover { background:#385f9e; }
 

</style>
</head>
<body class="user-select">

<!-- 引入头部 -->
<%@ include file="head.jsp"%>
<div style="background-image:url(/blog/static/image/heiban.jpg);width:1024px;height:500px;position:relative;left:240px;">
	<form action="<%=request.getContextPath()%>/leaveWord" method="post">
	
	<div class="font_title">
	
	<p >留言板</p><div id="login_click" style="position:relative;left:300px;cursor:hand"><input type="submit" value="确认留言"></div>
	
	</div>
	<div style="position:relative;left:260px;top:-10px">
	<p style="color:white;font-size:16px;position:relative;top:-27px">尊姓大名：<input name="wordPeople"  type="text" class="input"></p>
	<p style="color:white;font-size:16px;position:relative;top:-15px;left:-2px">邮&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;箱：<input name="email" type="text" class="inputd"></p>
	<p style="color:white;font-size:16px;position:relative;top:10px">想对小飞说什么？</p><br>
	<p style="color:white"><textarea name="wordContent" class="inputs"></textarea></p>
	<div id="div1">
	</div>
	<div id="div2">
	</div>
	<div id="div3">
	</div>
	<div id="div4">
	</div>
	</div>
	
	</form>
</div>

<!-- 引入底部 -->
<%@ include file="footer.jsp" %>

</body>
</html>