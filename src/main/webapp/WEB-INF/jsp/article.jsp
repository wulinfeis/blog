<%@page import="com.fasterxml.jackson.annotation.JsonInclude.Include"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>异清轩博客文章页面</title>
<link rel="stylesheet" type="text/css" href="/blog/static/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/blog/static/css/nprogress.css">
<link rel="stylesheet" type="text/css" href="/blog/static/css/style.css">
<link rel="stylesheet" type="text/css" href="/blog/static/css/font-awesome.min.css">
<link rel="apple-touch-icon-precomposed" href="/blog/static/images/icon/icon.png">
<link rel="shortcut icon" href="/blog/static/images/icon/favicon.ico">
<script src="/blog/static/js/jquery-2.1.4.min.js"></script>
<script src="/blog/static/js/nprogress.js"></script>
<script src="/blog/static/js/jquery.lazyload.min.js"></script>
<style type="text/css">
#button1 {

    width: 100px;

    height: 30px;

    font-size: 18px;

    font-family: 微软雅黑;

    letter-spacing: 8px;

    padding-left: 12px;

    border-radius: 5px;

    background: -webkit-linear-gradient(top, #66B5E6, #2e88c0);

    background: -moz-linear-gradient(top, #66B5E6, #2e88c0);

    background: linear-gradient(top, #66B5E6, #2e88c0);

    background: -ms-linear-gradient(top, #66B5E6, #2e88c0);

    border: 1px solid #2576A8;

    box-shadow: 0 1px 2px #B8DCF1 inset, 0 -1px 0 #316F96 inset;

    color: #fff;

    text-shadow: 1px 1px 0.5px #22629B;

}

#button1:hover {

    background: -webkit-linear-gradient(top, #8DC9EF, #4E9FD1);

    background: -moz-linear-gradient(top, #8DC9EF, #4E9FD1);

    background: linear-gradient(top, #8DC9EF, #4E9FD1);

    background: -ms-linear-gradient(top, #8DC9EF, #4E9FD1);

}
</style>
<script type="text/javascript">
function submits(){
	 var form = document.getElementById('comment-form');
		var userName= $("#userName").val();
		var email= $("#email").val();
		var content = $("#comment-textarea").val();
		alert(content)
		if(userName==null||userName==""||userName==undefined){
			alert("请输入你的名称");
			return;
		}
		if(email==""||email==null||email==undifined){
			alert("请输入你的邮箱");
			return;
		}
		if(content==""||content==null||content==undifined){
			alert("请输入你评论的内容");
			return;
		}
		alert("111")
		form.submit();
}


</script>
</head>

<body class="user-select single">
<%@ include file="head.jsp" %>
<section class="container">
  <div class="content-wrap">
    <div class="content">
      <header class="article-header">
        <h1 class="article-title">${blogArticle.blogTitle}</h1>
        <div class="article-meta"> <span class="item article-meta-time">
          <time class="time" data-toggle="tooltip" data-placement="bottom" title="时间：${blogArticle.blogCreateTime}">
          <i class="glyphicon glyphicon-time"></i> ${blogArticle.blogCreateTime}</time>
          </span> <span class="item article-meta-source" data-toggle="tooltip" data-placement="bottom" title="来源：第一PHP社区"><i class="glyphicon glyphicon-globe"></i>
           <c:if test="${blogArticle.blogArticleType eq '1' }">原创</c:if>
            <c:if test="${blogArticle.blogArticleType eq '2' }">转载</c:if>
            <c:if test="${blogArticle.blogArticleType eq '3' }">翻译</c:if>
          </span>
           <span class="item article-meta-category" data-toggle="tooltip" data-placement="bottom" title="栏目：后端程序"><i class="glyphicon glyphicon-list"></i>
            <c:if test="${blogArticle.blogType eq '1' }">前端技术</c:if>
            <c:if test="${blogArticle.blogType eq '2' }">linux</c:if>
            <c:if test="${blogArticle.blogType eq '3' }">服务器</c:if>
            <c:if test="${blogArticle.blogType eq '4' }">程序人生</c:if>
            <c:if test="${blogArticle.blogType eq '5' }">其他乱七八糟</c:if>
            <c:if test="${blogArticle.blogType eq '6' }">框架</c:if>
            </span> 
            
           <span class="item article-meta-views" data-toggle="tooltip" data-placement="bottom" title="查看：${blogArticle.blogArticleNum }">
           <i class="glyphicon glyphicon-eye-open"></i> 共${blogArticle.blogArticleNum }人围观</span>
            <span class="item article-meta-comment" data-toggle="tooltip" data-placement="bottom" title="评论：0">
            <i class="glyphicon glyphicon-comment"></i> ${blogArticle.blogComment.commentNum}个不明物体</span> </div>
      </header>
      <article class="article-content">
        <p><img data-original="/blog/static/images/banner/banner_03.jpg" src="/blog/static/images/banner/banner_03.jpg" alt="" /></p>
        <p> 
        引用服务器上面图片的案列：
        <img alt="" src="http://www.wulinfei.cn:8080/images/1.png">
        ${blogArticle.blogContext}
        
         </p>
        <p class="article-copyright hidden-xs">未经允许不得转载：<a href="">异清轩博客</a> » <a href="article.html">php如何判断一个日期的格式是否正确</a></p>
      </article>
      <div class="article-tags">标签：<a href="" rel="tag">PHP</a></div>
      <div class="relates">
        <div class="title">
          <h3>相关推荐</h3>
        </div>
        <ul>
          <li><a href="article.html">php如何判断一个日期的格式是否正确</a></li>
          <li><a href="article.html">php如何判断一个日期的格式是否正确</a></li>
          <li><a href="article.html">php如何判断一个日期的格式是否正确</a></li>
          <li><a href="article.html">php如何判断一个日期的格式是否正确</a></li>
          <li><a href="article.html">php如何判断一个日期的格式是否正确</a></li>
          <li><a href="article.html">php如何判断一个日期的格式是否正确</a></li>
          <li><a href="article.html">php如何判断一个日期的格式是否正确</a></li>
          <li><a href="article.html">php如何判断一个日期的格式是否正确</a></li>
        </ul>
      </div>
      <div class="title" id="comment">
        <h3>评论</h3>
      </div>
     
     
      <div id="postcomments">
        <ol class="commentlist">
      <c:forEach items="${blogCommentList}" var="blogCommentList">
          <li class="comment-content"><span class="comment-f">#1</span>
            <div class="comment-avatar"><img class="avatar" src="/blog/static/images/icon/icon.png" alt="" /></div>
            <div class="comment-main">
              <p><span class="address">${blogCommentList.userName}</span><span class="time">${blogCommentList.time }</span><br />
               ${blogCommentList.content}</p>
            </div>
          </li>
        </c:forEach> 
        </ol>
        <div id="respond">
       <form action="<%=request.getContextPath()%>/insertBlogComment" method="post" id="comment-form">
        <div style="width:auto;height:auto">
        <textarea cols="105%" rows="5" placeholder="您的评论可以一针见血" name="content" ></textarea><br>
        
        <div style="width:100%;height:auto"><br>
        <p style="position:relative;left:240px"> 名称： <input name="userName" type="text" ><br><br></p>		
		<p style="position:relative;left:240px"> 邮箱： <input name="email" type="text" ></p>
		<button onclick="submits()" id="button1" style="position:relative;left:290px;top:20px">评论</button>
		<input name="blogId" type="hidden" value="${blogArticle.blogId}">
        </div>
        </div>
        </form>
      </div>
						    
       <div class="quotes" id="courseList">
 		<a href="<%=request.getContextPath()%>/article.html?currentPages=${blogComment.page.currentPage-1}&blogId=${blogComment.blogId}">上一页</a>
 		
 		<c:if test="${blogComment.page.currentPage+4<blogComment.page.totalPage }">
 		<c:forEach  begin="${blogComment.page.currentPage}"  end="${blogComment.page.currentPage+3}"  varStatus="i">
        <a   href="<%=request.getContextPath()%>/article.html?currentPages=${i.index}&blogId=${blogComment.blogId}">${i.index}</a>
        </c:forEach>
        </c:if>
        
        <c:if test="${blogComment.page.currentPage+4>=blogComment.page.totalPage }">
 		<c:forEach  begin="${blogComment.page.currentPage}"  end="${blogComment.page.totalPage}"  varStatus="i">
        <a   href="<%=request.getContextPath()%>/article.html?currentPages=${i.index}&blogId=${blogComment.blogId}">${i.index}</a>
        </c:forEach>
        </c:if>
        <a href="<%=request.getContextPath()%>/article.html?currentPages=${blogComment.page.currentPage+1}&blogId=${blogComment.blogId}">下一页</a>
        	共${blogComment.page.totalCount}条留言/共${blogComment.page.totalPage}页&nbsp;&nbsp;&nbsp;
        </div>
        
      </div>
      
    </div>
  </div>
 <%@ include file="sidebars.jsp" %>
</section>
<%@ include file="footer.jsp" %>
<script type="text/javascript">
$(function(){
	$('.emotion').qqFace({
		id : 'facebox', 
		assign:'comment-textarea', 
		path:'/blog/static/images/arclist/'	//表情存放的路径
	});
 });   
</script>
</body>
</html>