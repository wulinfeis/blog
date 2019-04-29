<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>代码君博客</title>
<link rel="stylesheet" type="text/css" href="/blog/static/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/blog/static/css/nprogress.css">
<link rel="stylesheet" type="text/css" href="/blog/static/css/style.css">
<link rel="stylesheet" type="text/css" href="/blog/static/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="/blog/static/images/icon/icon.png">
<link rel="shortcut icon" href="/blog/static/images/icon/favicon.ico">
<script src="/blog/static/js/jquery-2.1.4.min.js"></script>
<script src="/blog/static/js/nprogress.js"></script>
<script src="/blog/static/js/jquery.lazyload.min.js"></script>

</head>
<body class="user-select">
<header class="header">
  <nav class="navbar navbar-default" id="navbar">
    <div class="container">
      <div class="header-topbar hidden-xs link-border">
        <ul class="site-nav topmenu">
        <li><a href="about.html">关于小飞</a></li>
          <li><a href="<%=request.getContextPath()%>/readers.html">读者墙</a></li>
          <li><a data-toggle="modal" data-target="#areDeveloping"  rel="nofollow">友情链接</a></li>
          <c:if test="${userName ne null}">
          <li><a href="<%=request.getContextPath()%>/edit.html" rel="nofollow">写博客</a></li>
          </c:if>
          <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" rel="nofollow">关注本站 <span class="caret"></span></a>
            <ul class="dropdown-menu header-topbar-dropdown-menu">
              <li><a data-toggle="modal" data-target="#WeChat" rel="nofollow"><i class="fa fa-weixin"></i> 微信</a></li>
              <li><a data-toggle="modal" data-target="#areDeveloping" rel="nofollow"></i> 微博</a></li>
              <li><a data-toggle="modal" data-target="#areDeveloping" rel="nofollow"><i class="fa fa-rss"></i> RSS</a></li>
            </ul>
          </li>
        </ul>
        <!-- 原本的登录方式 -->
        <!-- <a data-toggle="modal" data-target="#loginModal" class="login" rel="nofollow">Hi,请登录</a>&nbsp;&nbsp;
          <a href="javascript:;" class="register" rel="nofollow">我要注册</a>&nbsp;&nbsp;<a href="" rel="nofollow">找回密码</a> </div> -->
        <c:if test="${userName eq null}">
        <a href="<%=request.getContextPath()%>/login.html" class="login" rel="nofollow">Hi,请登录</a>&nbsp;&nbsp;
      	<a href="register.html" class="register" rel="nofollow">我要注册</a> &nbsp;&nbsp;
      	<a data-toggle="modal" data-target="#areDeveloping" rel="nofollow">找回密码</a>
      	</c:if>
      	<c:if test="${userName ne null}">
      	<a href="javascript:(0)">Hi,欢迎你,${userName}</a>
      	</c:if>
      	</div>
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#header-navbar" aria-expanded="false"> <span class="sr-only"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
        <h1 class="logo hvr-bounce-in"><a href="" title=""><img src="/blog/static/images/logos.png" alt=""></a></h1>
      </div>
      <div class="collapse navbar-collapse" id="header-navbar">
        <ul class="nav navbar-nav navbar-right">
        <li class="hidden-index active"><a data-cont="代码君首页" href="<%=request.getContextPath()%>/index.html">代码君首页</a></li>
        <li><a class="cat" href="<%=request.getContextPath()%>/index.html?blogType=1">java</a> </li>
        <li><a class="cat" href="<%=request.getContextPath()%>/index.html?blogType=2">linux</a></li>
        <li><a class="cat" href="<%=request.getContextPath()%>/index.html?blogType=3">前端</a></li>
        <li><a class="cat" href="<%=request.getContextPath()%>/index.html?blogType=4">程序人生 </a></li>
        <li><a class="cat" href="<%=request.getContextPath()%>/index.html?blogType=5">其他乱七八糟 </a></li>
        <li><a class="cat" href="<%=request.getContextPath()%>/index.html?blogType=6">框架</a></li>
        </ul>
        <form class="navbar-form visible-xs" action="/Search" method="post">
          <div class="input-group">
            <input type="text" name="keyword" class="form-control" placeholder="请输入关键字" maxlength="20" autocomplete="off">
            <span class="input-group-btn">
            <button class="btn btn-default btn-search" name="search" type="submit">搜索</button>
            </span> </div>
        </form>
      </div>
    </div>
  </nav>
</header>

</body>
</html>