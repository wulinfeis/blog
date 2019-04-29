<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>代码君博客</title>

</head>
<body class="user-select">
<aside class="sidebar">
    <div class="fixed">
      <div class="widget widget-tabs">
        <ul class="nav nav-tabs" role="tablist">
          <li role="presentation" class="active"><a href="#notice" aria-controls="notice" role="tab" data-toggle="tab">网站公告</a></li>
          <li role="presentation"><a href="#centre" aria-controls="centre" role="tab" data-toggle="tab">会员中心</a></li>
          <li role="presentation"><a href="#contact" aria-controls="contact" role="tab" data-toggle="tab">联系站长</a></li>
        </ul>
        <div class="tab-content">
          <div role="tabpanel" class="tab-pane notice active" id="notice">
            <ul>
            <c:forEach   items="${hotBlogArticle}" var="hotBlogArticle">
        <c:if test="${hotBlogArticle.blogStatus eq 2}">
              <li>
                <time datetime="2016-01-04">${hotBlogArticle.blogCreateTime}</time>
                <a href="<%=request.getContextPath()%>/article.html?blogId=${hotBlogArticle.blogId}" target="_blank">${hotBlogArticle.blogTitle}</a>
                </li>
                </c:if> 
            </c:forEach>
            </ul>
          </div>
          <div role="tabpanel" class="tab-pane centre" id="centre">
            <h4>需要登录才能进入会员中心</h4>
            <p> <a data-toggle="modal" data-target="#loginModal" class="btn btn-primary">立即登录</a> <a href="javascript:;" class="btn btn-default">现在注册</a> </p>
          </div>
          <div role="tabpanel" class="tab-pane contact" id="contact">
            <h2>Email:<br />
              <a href="#" data-toggle="tooltip" data-placement="bottom" title="hunanwulinfei@qq.com">hunanwulinfei@qq.com</a></h2>
          </div>
        </div>
      </div>
      <!-- <div class="widget widget_search">
        <form class="navbar-form" action="/Search" method="post">
          <div class="input-group">
            <input type="text" name="keyword" class="form-control" size="35" placeholder="请输入关键字" maxlength="15" autocomplete="off">
            <span class="input-group-btn">
            <button class="btn btn-default btn-search" name="search" type="submit">搜索</button>
            </span> </div>
        </form>
      </div> -->
    </div>
    <div class="widget widget_sentence">
      <h3>英文美句</h3>
      <div class="widget-sentence-content">
        <h4>${blogEnglishSentence.time}</h4>
        <p>${blogEnglishSentence.english}<br />
          ${blogEnglishSentence.chinese}</p><br />
          <p>小编寄语：${blogEnglishSentence.comments}</p>
          
      </div>
    </div>
    <div class="widget widget_hot">
      <h3>热门文章</h3>
      <ul>
      <c:forEach  items="${hotBlogArticle}" var="hotBlogArticle" begin="1" end="5">
        <li><a href="<%=request.getContextPath()%>/article.html?blogId=${hotBlogArticle.blogId}" title=""><span class="thumbnail">
        <img class="thumb" data-original="/blog/static/images/excerpt.jpg" src="/blog/static/images/excerpt.jpg" alt=""></span>
        <span class="text">${hotBlogArticle.blogTitle}</span><span class="muted">
        <i class="glyphicon glyphicon-time"></i> ${hotBlogArticle.blogCreateTime } </span><span class="muted">
        <i class="glyphicon glyphicon-eye-open"></i> ${hotBlogArticle.blogArticleNum }</span></a></li>
      </c:forEach>
      </ul>
    </div>
  </aside>

</body>
</html>