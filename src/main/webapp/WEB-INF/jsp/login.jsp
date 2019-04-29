<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>代码君博客登录</title>

<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<meta name="description" content="秒聘网，中国最大的产品经理招聘平台，人人都是产品经理社区旗下招聘平台。">
<meta name="keywords"
	content="秒聘、秒聘网、产品经理招聘、招聘产品经理、产品经理求职、产品经理、百度产品经理、腾讯产品经理、阿里产品经理">
<link type="text/css" rel="stylesheet" href="/blog/static/moke8/login.css">
<link rel="shortcut icon"
	href="http://www.zhaopins.com/assets/images/favicon.ico">
<link rel="icon" type="image/png"
	href="http://www.zhaopins.com/assets/images/favicon.ico">
<link type="text/css" rel="stylesheet" href="/blog/static/moke8/global.css">
<link type="text/css" rel="stylesheet" href="/blog/static/moke8/asyncbox.css">
<link type="text/css" rel="stylesheet" href="/blog/static/moke8/front.css">
<link type="text/css" rel="stylesheet" href="/blog/static/moke8/main_2.css">
<script type="text/javascript" src="/blog/static/moke8/jquery-1.js"></script>
<script type="text/javascript" src="/blog/static/moke8/utils.js"></script>
<script type="text/javascript" src="/blog/static/moke8/AsyncBox.js"></script>
<script type="text/javascript" src="/blog/static/moke8/common.js"></script>
<script type="text/javascript">

var ctx = "${result}";
if(ctx==""){
	
}else if(ctx!=""){
	alert(ctx);
}


</script>
</head>
<body class="body-login">
	<div class="loginbj">
		<div class="wrapper">
			<div class="m-login is-login">
				<div class="formArea">
					<form method="post" action="${pageContext.request.contextPath}/login" name="aform"
						id="aform">
						<input name="furl" value="" type="hidden">
						<div class="m-from">
							<div style="position:absolute;left:100px"><img src="/blog/static/images/logo2.png"></div>
							<div class="item item-custips">
								<span class="form-tips form-tips-error"></span>
							</div>
							<div class="item">
								<div class="m-ipt-txt">
									<input class="ipt-txt ipt-txt-mail" id="account"
										onKeyDown="javaScript:if(event.keyCode == 13){signUp();}"
										placeholder="用户名" name="userName" maxlength="10"  type="text">
								</div>
							</div>
							<div class="item">
								<div class="m-ipt-txt">
									<input class="ipt-txt ipt-txt-pwd" id="pwd"
										onKeyDown="javaScript:if(event.keyCode == 13){signUp();}"
										placeholder="密码" name="password"  maxlength="30" type="password">
								</div>
							</div>
							<div class="item">
								<input value="1" name="overtime" id="overtimeInput"
									type="hidden"> <span class="m-ckbox m-ckbox-checked"
									id="overtimeDiv">记住密码</span> <a
									href="###">忘记密码了？</a>
							</div>
							<div class="item item-submit">
								<a class="btn_blueA" href="javascript:;" onClick="signUp();">立即登录</a>
							</div>
						</div>
					</form>
				</div>
				<div class="logoArea">
					<a class="logo" href="###"></a>
				</div>
			</div>
		</div>
	</div>
	<!--云滚动-->
	<div id="demo" class="cloud-pic">
		<table cellspace="0" align="left" border="0" cellpadding="0">
			<tbody>
				<tr>	
					<!-- 浮动的云 -->
					<td id="demo1" valign="top"><img src="/blog/static/moke8/cloud-bj.png"><img
						src="/blog/static/moke8/cloud-bj.png"></td>
					<td id="demo2" valign="top"><img src="/blog/static/moke8/cloud-bj.png"><img
						src="/blog/static/moke8/cloud-bj.png"></td>
				</tr>
			</tbody>
		</table>
	</div>
	<script>
		var speed = 60
		demo2.innerHTML = demo1.innerHTML
		function Marquee() {
			if (demo2.offsetWidth - demo.scrollLeft <= 0)
				demo.scrollLeft -= demo1.offsetWidth
			else {
				demo.scrollLeft++
			}
		}
		var MyMar = setInterval(Marquee, speed)
		demo.onmouseover = function() {
			clearInterval(MyMar)
		}
		demo.onmouseout = function() {
			MyMar = setInterval(Marquee, speed)
		}
	</script>
	<!--云滚动-->
	<script>
		//交互demo
		$(".m-ipt-txt")
				.bind(
						{
							click : function() {
								var _this = $(this), ipt_txt = _this
										.find(".ipt-txt"), ipt_tips = _this
										.find(".ipt-tips");
								$(".form-tips-error").html("");

								ipt_tips.hide();
								ipt_txt.focus();
								ipt_txt.bind({
									blur : function(w) {
										if ($(this).val() == "") {
											ipt_tips.show();
										}
										$(this).unbind("blur");
									}
								});
							}
						});

		//7天免验证
		$("#overtimeDiv").click(function() {
			if ($(this).hasClass("m-ckbox-checked")) {
				$(this).removeClass("m-ckbox-checked");
				$("#overtimeInput").val(0);
			} else {
				$(this).addClass("m-ckbox-checked");
				$("#overtimeInput").val(1);
			}
		});

		function signUp() {
			/* var userName = trim($("#userName").val()); */
			var pwd = trim($("#pwd").val());
			/* if (!isEmail(userName)) {
				$(".form-tips-error").html("请填写有效的用户名");
				return;
			} */
			if ((pwd.length<6||pwd.length>30)) {
				$(".form-tips-error").html("密码长度请控制在6-30位字符以内");
				return;
			}
			$("#aform").submit();
		}
	</script>

	<div id="asyncbox_cover" unselectable="on"
		style="opacity: 0.9; filter: alpha(opacity = 90); background: #333">
		<!--[if IE 6]><div><iframe></iframe></div><div></div><![endif]-->
	</div>
	<div id="asyncbox_clone"></div>
	<div id="asyncbox_focus"></div>
	<div id="asyncbox_load">
		<div>
			<span></span>
		</div>
	</div>
</body>
</html>