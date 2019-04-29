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


</script>
<style type="text/css">
.leaveWord{
padding-bottom: -10px;
}


</style>
</head>
<body class="user-select">

<!-- 引入头部 -->
<%@ include file="head.jsp"%>
<div style="width:1000px;height:auto;position:relative;left:50px">

<section class="container container-page">
  <div class="pageside">
    <div class="pagemenus">
      <ul class="pagemenu">
        <li><a href="readers.html">读者墙</a></li>
        <li><a data-toggle="modal" data-target="#areDeveloping" rel="nofollow">友情链接</a></li>
        <li><a href="about.html">关于小飞</a></li>
      </ul>
    </div>
  </div>
  <div class="content" style="width:1000px">
    <header class="article-header">
      <h1 class="article-title">读者墙</h1>
    </header>
    <div class="readers">    <img style="width:900px;height:400px" alt="" src="/blog/static/images/s.jpeg">  </div><br>
      <p style="font-size: 18px"><a href="<%=request.getContextPath()%>/goleaveword.html">我要留言</a></p><br><br>
      <div><p>精选留言：</p>
      <div class="leaveWord">
     
      	<c:forEach items="${leaveWordList}" var="leaveWordList">
      	<p style="font-weight:900;">${leaveWordList.wordPeople} </p><p style="position:relative;top:-20px;left:100px">
      	&nbsp;&nbsp;&nbsp;&nbsp;${leaveWordList.wordTime}&nbsp;&nbsp;#${leaveWordList.wordId }</p>
      	<p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;${leaveWordList.wordContent }
      	</p>
      	<hr>
      	</c:forEach>
     
      <div class="quotes" id="courseList">
 		<a href="<%=request.getContextPath()%>/readers.html?currentPages=${blogLeaveWord.page.currentPage-1}">上一页</a>
 		
 		<c:if test="${blogLeaveWord.page.currentPage+4<blogLeaveWord.page.totalPage }">
 		<c:forEach  begin="${blogLeaveWord.page.currentPage}"  end="${blogLeaveWord.page.currentPage+4}"  varStatus="i">
        <a   href="<%=request.getContextPath()%>/readers.html?currentPages=${i.index}">${i.index}</a>
        </c:forEach>
        </c:if>
        
        <c:if test="${blogLeaveWord.page.currentPage+4>=blogLeaveWord.page.totalPage }">
 		<c:forEach  begin="${blogLeaveWord.page.currentPage}"  end="${blogLeaveWord.page.totalPage}"  varStatus="i">
        <a   href="<%=request.getContextPath()%>/readers.html?currentPages=${i.index}">${i.index}</a>
        </c:forEach>
        </c:if>
        <a href="<%=request.getContextPath()%>/readers.html?currentPages=${blogLeaveWord.page.currentPage+1}">下一页</a>
        	共${blogLeaveWord.page.totalCount}条留言/共${blogLeaveWord.page.totalPage}页&nbsp;&nbsp;&nbsp;
        </div>
      </div>
  </div>
  </div>
</section>

	<div>
		
		
	</div>
	
</div>
<!-- 引入底部 -->
<%@ include file="footer.jsp" %>

</body>
</html>