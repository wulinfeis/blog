<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>代码君博客</title>
<link rel="shortcut icon" href="img/LOGO.png" />
<link href="/blog/static/css/Location.css" type="text/css" rel="stylesheet">
<embed src="/blog/static/music.mp3" loop="11" autostar="true"  width="0" height="0" />
</head>
<body class="body--ready" data-pinterest-extension-installed="cr1.39.1">
<canvas height="100%" width="100%" style="position: fixed; top: 0px; left: 0px; opacity: 1;"  id="canvas" class="canvas"></canvas>
<div id="willerce">
<audio src="/blog/static/music.mp3" id="audio1" hidden="true" autoplay="autoplay" loop="loop">
      </audio>
	<div>
		<img src="/blog/static/images/timgs.jpg" id="logo" title="waylee"/>
		<h1>代码君小飞</h1>
		<a>脑洞技术宅!</a><br>
		<a>欢迎进入，代码的世界</a>
	</div>	
	<div class="menu">
		<a class="anniu" href="<%=request.getContextPath()%>/index.html" >个人博客</a>
		<!-- <a class="anniu" href="" >小伙伴们</a> -->
		<a class="anniu" href="<%=request.getContextPath()%>/resume.html" >动画简历</a>	 
	</div>
</div>
<div id="shiping">

	<video id="bfq"   autoplay="autoplay"  loop="loop">
		<source src="/blog/static/hua39.mp4" type="video/mp4" id="mp4_sp">
	</video>
</div>
<span id="jb" class="copyright">&copy; 2018-2020<a href="https://waylee.net/"> 湘ICP备18012007号</a></span>

<script src="/blog/static/js/Seffects.js" type="text/javascript"></script>
</body>
</html>
