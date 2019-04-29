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
 
<script type="text/javascript">     
function countDown(secs,surl){         
 var jumpTo = document.getElementById('jumpTo');
 jumpTo.innerHTML=secs;  
 if(--secs>0){     
     setTimeout("countDown("+secs+",'"+surl+"')",1000);     
     }     
 else{       
     location.href=surl;     
	 -ma
     }     
 }     
</script> 

</head>
<body class="user-select">


<!-- 引入头部 -->
<%@ include file="head.jsp"%>



<h1>提交成功</h1>  
<a href="<%=request.getContextPath()%>/index.html"><span id="jumpTo">5</span>秒后系统会自动跳转，也可点击本处直接跳</a> 
<script type="text/javascript">
	countDown(5,'<%=request.getContextPath()%>/index.html');
</script> 

<!-- 引入底部 -->
<%@ include file="footer.jsp" %>

</body>
</html>