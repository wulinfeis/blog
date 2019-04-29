<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>404错误！很抱歉，您要找的页面不存在</title>

 <script src="/blog/static/js/jquery.min.js"></script>

</head>
<body class="user-select">

<!-- 引入头部 -->
<%@ include file="head.jsp"%>
<div>

<style type="text/css">
.panel{
	padding:80px 20px 0px;
	min-height:500px;
	cursor:default;
}
.text-center {
	margin:0 auto;
    text-align: center;
	border-radius:10px;
	max-width:900px;
	-moz-box-shadow: 0px 0px 5px rgba(0,0,0,.3);
	-webkit-box-shadow: 0px 0px 5px rgba(0,0,0,.3);
	box-shadow: 0px 0px 5px rgba(0,0,0,.1);
	
}
.float-left {
    float: left !important;
}
.float-right {
    float: right !important;
}
img {
    border: 0;
    vertical-align: bottom;
}
h2 {
    padding-top: 20px;
	font-size: 20px;
}
.padding-big {
    padding: 20px;
}
.alert {
    border-radius: 5px;
    padding: 15px;
    border: solid 1px #ddd;
    background-color: #f5f5f5;
}
</style>
</head>
<section class="container">
  <div class="panel">
    <div class="text-center">
      <h2><stong>404错误！很抱歉，您要找的页面不存在</stong></h2>
      <div>
        <div class="float-left"> <img src="/blog/static/images/404/left.gif" alt="" />
          <div class="alert"> 卧槽！页面不见了！ </div>
        </div>
        <div class="float-right"> <img src="/blog/static/images/404/right.png" width="260" class="hidden-xs" alt="" /> </div>
      </div>
      <div class="padding-big"> <a href="<%=request.getContextPath()%>/index.html" class="btn btn-primary">返回首页</a> <a href="feedback" class="btn btn-default">保证不打死管理员</a> </div>
    </div>
  </div>
</section>

</div>
<!-- 引入底部 -->
<%@ include file="footer.jsp" %>

</body>
</html>