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
function hehe(){
	alert("准备发送ajax请求")
	$.ajax({
		url:"index",
		type:"post",
		// 传到sevlet的数据信息
		data:{
			dressId:"1"
		},
		success : function(data, textStatus, jqXHR) {
			// 成功后将“正在登陆中。。。”进度条语句删除
			$('#courseList').html(data);
		}
	});
}
</script>

</head>
<body class="user-select">
 <div class="quotes" id="courseList"><span class="disabled">首页</span>
 		<span class="disabled">上一页</span>
        <a class="current">1</a><a href="javascript:void(0);" onclick="hehe()">2</a>
        <span class="disabled">下一页</span>
        <span class="disabled">尾页</span>
        </div>
</body>
</html>