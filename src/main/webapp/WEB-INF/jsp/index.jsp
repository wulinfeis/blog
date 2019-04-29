<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script>

	function goPage(){
		var rootPath="<%=request.getContextPath()%>";
		//alert(rootPath)
		var pageNum = $("#currentPage").val();
		if(pageNum==''){
			alert("请输入你要跳转的页码");
			
			return
		}
		window.location.href=rootPath+'/index.html?currentPages='+pageNum;
	}
	
</script>
<!-- 引入头部 -->
<%@ include file="head.jsp"%>
<section class="container">
  <div class="content-wrap">
    <div class="content">
      <div class="jumbotron">
        <h1>欢迎访问代码君小飞的博客</h1>
        <p>在这里可以看到前端技术，后端程序，网站内容管理系统等文章，还有我的程序人生！</p>
      </div>
      <div id="focusslide" class="carousel slide" data-ride="carousel">
        <ol class="carousel-indicators">
          <li data-target="#focusslide" data-slide-to="0" class="active"></li>
          <li data-target="#focusslide" data-slide-to="1"></li>
          <li data-target="#focusslide" data-slide-to="2"></li>
        </ol>
        <div class="carousel-inner" role="listbox">
          <div class="item active"> <a href="" target="_blank"><img src="/blog/static/images/banner/2.jpg" alt="" class="img-responsive"></a> 
            <!--<div class="carousel-caption"> </div>--> 
          </div>
          <div class="item"> <a href="" target="_blank"><img src="/blog/static/images/banner/1.jpg" alt="" class="img-responsive"></a> 
            <!--<div class="carousel-caption"> </div>--> 
          </div>
          <div class="item"> <a href="" target="_blank"><img src="/blog/static/images/banner/3.png" alt="" class="img-responsive"></a> 
            <!--<div class="carousel-caption"> </div>--> 
          </div>
        </div>
        <a class="left carousel-control" href="#focusslide" role="button" data-slide="prev" rel="nofollow"> <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span> <span class="sr-only">上一个</span> </a> <a class="right carousel-control" href="#focusslide" role="button" data-slide="next" rel="nofollow"> <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span> <span class="sr-only">下一个</span> </a> </div>
      <article class="excerpt-minic excerpt-minic-index">
        <h2><span class="red">【今日推荐】</span><a href="<%=request.getContextPath()%>/article.html?blogId=${blogArticless.blogId}" title="">${blogArticless.blogTitle}</a></h2>
        <p class="note">
        	${blogArticless.blogContext}...
        </p>
      </article>
      
      
      
      <div class="title">
        <h3>最新发布</h3>
      </div>
      
      <c:forEach items="${blogArticleList}" var="blogArticleList">
      <article class="excerpts excerpt-1"><a class="focus" href="article.html" title=""><img class="thumb" data-original="/blog/static/images/excerpt.jpg" src="/blog/static/images/excerpt.jpg" alt=""></a>
        <header><a class="cat" href="program">
        	<c:if test="${blogArticleList.blogType eq '1' }">前端技术</c:if>
            <c:if test="${blogArticleList.blogType eq '2' }">linux</c:if>
            <c:if test="${blogArticleList.blogType eq '3' }">服务器</c:if>
            <c:if test="${blogArticleList.blogType eq '4' }">程序人生</c:if>
            <c:if test="${blogArticleList.blogType eq '5' }">其他乱七八糟</c:if>
            <c:if test="${blogArticleList.blogType eq '6' }">框架</c:if>
            <i></i></a>
          <h2><a href="<%=request.getContextPath()%>/article.html?blogId=${blogArticleList.blogId}" title="">${blogArticleList.blogTitle }</a></h2>
        </header>
        <p class="meta">
          <time class="time"><i class="glyphicon glyphicon-time"></i> ${blogArticleList.blogCreateTime }</time>
          <span class="views"><i class="glyphicon glyphicon-eye-open">
          </i> 共${blogArticleList.blogArticleNum}人围观</span> <a class="comment" href="article.html#comment">
          <i class="glyphicon glyphicon-comment"></i> ${blogArticleList.blogComment.commentNum}个不明物体</a></p>
        <p class="note">${blogArticleList.blogContext}... </p>
      </article>
      </c:forEach>
   
       <!-- 分页 -->
        <div class="quotes" id="courseList"> <a href="<%=request.getContextPath()%>/index.html?currentPages=1">
     	 首&nbsp;&nbsp;&nbsp;页</a>
 		<a href="<%=request.getContextPath()%>/index.html?currentPages=${blogArticles.page.currentPage-1}">上一页</a>
 		
 		<c:if test="${blogArticles.page.currentPage+4<blogArticles.page.totalPage }">
 		<c:forEach  begin="${blogArticles.page.currentPage}"  end="${blogArticles.page.currentPage+4}"  varStatus="i">
       <c:if test="${blogType ne null}">
        <a   href="<%=request.getContextPath()%>/index.html?currentPages=${i.index}&blogType=${blogType}">${i.index}</a>
        </c:if>
        <c:if test="${blogType eq null}">
        <a   href="<%=request.getContextPath()%>/index.html?currentPages=${i.index}">${i.index}</a>
        </c:if>
        </c:forEach>
        </c:if>
        
        <c:if test="${blogArticles.page.currentPage+4>=blogArticles.page.totalPage }">
 		<c:forEach  begin="${blogArticles.page.currentPage}"  end="${blogArticles.page.totalPage}"  varStatus="i">
 		<c:if test="${blogType ne null}">
        <a   href="<%=request.getContextPath()%>/index.html?currentPages=${i.index}&blogType=${blogType}">${i.index}</a>
        </c:if>
        <c:if test="${blogType eq null}">
        <a   href="<%=request.getContextPath()%>/index.html?currentPages=${i.index}">${i.index}</a>
        </c:if>
        </c:forEach>
        </c:if>
        <a href="<%=request.getContextPath()%>/index.html?currentPages=${blogArticles.page.currentPage+1}">下一页</a>
        <a href="<%=request.getContextPath()%>/index.html?currentPages=${blogArticles.page.totalPage}">尾页</a>
        	共${blogArticles.page.totalCount}篇文章/共${blogArticles.page.totalPage}页&nbsp;&nbsp;&nbsp;跳转至&nbsp;&nbsp;<input id="currentPage" style="width:40px"/>
        	&nbsp;&nbsp;
        	<a href="javascript:(0)" onclick="goPage()">点击跳转</a>
        	<!-- <input type="submit" onclick="goPage()" value="点击跳转"/> -->
        </div>
    </div>
  </div>
  <%@ include file="sidebars.jsp" %>
</section>
<!-- 引入底部 -->
<%@ include file="footer.jsp"%>


</body>
</html>