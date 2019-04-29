package com.bjsxt.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bjsxt.pojo.BlogArticle;
import com.bjsxt.pojo.BlogComment;
import com.bjsxt.pojo.BlogEnglishSentence;
import com.bjsxt.pojo.BlogLeaveWord;
import com.bjsxt.pojo.BlogUser;
import com.bjsxt.pojo.Page;
import com.bjsxt.service.BlogLeaveWordService;
import com.bjsxt.service.BlogUserService;
import com.bjsxt.service.EveryDayEnglishService;
import com.bjsxt.service.TestService;
import com.bjsxt.service.UsersService;
import com.bjsxt.util.DateUtil;
/**
 * 控制层，
 * Title:
 * @author: 代码君小飞
 * @date: 2018年6月25日 上午9:48:11
 * Description:
 */
@Controller
public class UsersController {
	/**
	 * 自动注入
	 */
	@Autowired
	private UsersService usersService;
	@Autowired
	private EveryDayEnglishService everyDayEnglishService;
	@Autowired
	private BlogUserService blogUserService;
	@Autowired
	private BlogLeaveWordService blogLeaveWordService;
	
	private int beginIndex =0;
	private int everyPage=5;
	/**
	 * 跳转首页的方法
	 * @param request 
	 * @return 对应的页面
	 */
	@RequestMapping("/index")
	public String addUser(HttpServletRequest request,BlogArticle blogArticlePage){
		System.out.println("获取登录页面参数"+blogArticlePage.getBlogType());
		System.err.println("进了首页");
		
		Page page = new Page();
		BlogArticle blogArticles = new BlogArticle();
		String blogType = blogArticlePage.getBlogType();
		if(blogType!=null){
			blogArticles.setBlogType(blogType);
			request.getSession().setAttribute("blogType",blogArticles.getBlogType());
		}
		
		//获取今日推荐文章
		BlogArticle blogArticle = usersService.getTodateArticle();
		//获取跳转页数
		String currentPages = request.getParameter("currentPages");
		if(currentPages==null||currentPages.equals("")){
			page.setCurrentPage(1);
			beginIndex=0;
			System.out.println(beginIndex+"首页");
		}else {
			page.setCurrentPage(Integer.parseInt(currentPages));
			beginIndex =(Integer.parseInt(currentPages)-1)*5;
			System.out.println(beginIndex+"-------"+"第"+currentPages+"页");
		}
		page.setBeginIndex(beginIndex);
		page.setEveryPage(everyPage);
		
		
		//将page分页参数设置到对象中
		blogArticles.setPage(page);
		
		
		
		//获取文章列表
		List<BlogArticle> blogArticleList = usersService.getBlogArticle(blogArticles);
		//获取文章总数量
		int totalCount =usersService.getAllArticle(blogArticles);
		//计算总共有几页
		int totalPage =totalCount/everyPage;
		System.out.println("页数"+totalPage);
		if(totalCount%everyPage!=0){
			totalPage=totalPage+1;
		}
		System.out.println("页数"+totalPage);
		//截取今日推荐文章部分字符串作为显示
		if(blogArticle.getBlogContext().length()>140){
		String context = blogArticle.getBlogContext().substring(0, 140);
		blogArticle.setBlogContext(context);
		}
		//截取文章列表中，文章内容部分字符串作为显示
		for (int i = 0; i < blogArticleList.size(); i++) {
			if(blogArticleList.get(i).getBlogStatus() ==2){
				System.out.println("网站公告："+blogArticleList.get(i).getBlogTitle());
				String time = blogArticleList.get(i).getBlogCreateTime().substring(5, 10);
				blogArticleList.get(i).setBlogCreateTime(time);
			}
			
			if(blogArticleList.get(i).getBlogContext().length()>100){
			String articleContext = blogArticleList.get(i).getBlogContext().substring(0, 100);
			blogArticleList.get(i).setBlogContext(articleContext);
			}
		}
		page.setTotalCount(totalCount);
		page.setTotalPage(totalPage);
		
		BlogEnglishSentence blogEnglishSentence = everyDayEnglishService.getAll();
		
		
		List<BlogArticle> hotBlogArticle = usersService.getBlogHotArticle();
		
		for (int i = 0; i < hotBlogArticle.size(); i++) {
			if(hotBlogArticle.get(i).getBlogStatus() ==2){
				System.out.println("网站公告："+hotBlogArticle.get(i).getBlogTitle());
				String time = hotBlogArticle.get(i).getBlogCreateTime().substring(5, 10);
				hotBlogArticle.get(i).setBlogCreateTime(time);
			}
		}
		
		hotBlogArticle.get(1).getBlogTitle();
		System.err.println("热梦文章"+hotBlogArticle);
		
		request.getSession().setAttribute("hotBlogArticle",hotBlogArticle);
		request.getSession().setAttribute("blogEnglishSentence",blogEnglishSentence);
		request.getSession().setAttribute("blogArticles",blogArticles);
		request.getSession().setAttribute("blogArticless", blogArticle);
		request.getSession().setAttribute("blogArticleList", blogArticleList);
		System.out.println("跳转首页成功");
		return "index";
	}

	/**
	 * 查看文章内容
	 * @param request
	 * @return 对应的页面
	 */
	@RequestMapping("/article.html")
	public String viewArticle(HttpServletRequest request) {
		String articleId = request.getParameter("blogId");
		int blogId = Integer.parseInt(articleId);
		
		BlogArticle blogArticle = usersService.viewAritcle(blogId);
		
		BlogComment blogComment = new BlogComment();
		
		
		Page page = new Page();
		String currentPages = request.getParameter("currentPages");
		if(currentPages==null||currentPages.equals("")){
			page.setCurrentPage(1);
			beginIndex=0;
			System.out.println(beginIndex+"首页");
		}else {
			page.setCurrentPage(Integer.parseInt(currentPages));
			beginIndex =(Integer.parseInt(currentPages)-1)*5;
			System.out.println(beginIndex+"-------"+"第"+currentPages+"页");
		}
		page.setBeginIndex(beginIndex);
		page.setEveryPage(everyPage);
		blogComment.setPage(page);
		blogComment.setBlogId(blogId);
		List<BlogComment> blogCommentList = usersService.viewArticleComment(blogComment);
		
		System.out.println("总数量"+blogArticle.getBlogComment().getCommentNum());
		int totalCount =blogArticle.getBlogComment().getCommentNum();
		int totalPage =totalCount/everyPage;
		
		if(totalCount%everyPage!=0){
			totalPage=totalPage+1;
		}
		page.setTotalCount(totalCount);
		page.setTotalPage(totalPage);
		blogComment.setPage(page);
		System.out.println("当前页："+blogComment.getPage().getCurrentPage());
		request.getSession().setAttribute("blogComment", blogComment);
		request.getSession().setAttribute("blogCommentList", blogCommentList);
		request.getSession().setAttribute("blogArticle", blogArticle);
		
		return "article";
	}
	/**
	 * 新增文章评论
	 */
	@RequestMapping("insertBlogComment")
	public String insertBlogComment(HttpServletRequest request){
		String content = request.getParameter("content");
		BlogComment blogComment = new BlogComment();
		String userNames =(String) request.getSession().getAttribute("userName");
		String emails = (String) request.getSession().getAttribute("email");
		System.out.println(userNames+emails);
		String userName = null;
		String email  =null;
		if(userNames==null&&emails==null){
			userName = request.getParameter("userName");
			email = request.getParameter("email");
		blogComment.setUserName(userName);
		blogComment.setEmail(email);
		request.getSession().setAttribute("userName",userName);
		request.getSession().setAttribute("email",email);
		}
		if(userNames==null&&emails==null||content==null){
			return "404";
		}
		String blogId = request.getParameter("blogId");
		System.out.println("id是空的嘛？"+blogId);
		if(userNames!=null&&emails!=null){
			blogComment.setUserName(userNames);
			blogComment.setEmail(emails);
		}
		blogComment.setContent(content);
		blogComment.setBlogId(Integer.parseInt(blogId));
		blogComment.setTime(DateUtil.getNowTime());
		usersService.insertBlogComment(blogComment);
		
		return "transitionpage";
	}
	/**
	 * 登录操作
	 * @param request
	 * @param blogUser
	 * @return
	 */
	@RequestMapping("/login")
	public String login(HttpServletRequest request,BlogUser blogUser){
		String result = null;
		List<BlogUser> blogUserList = blogUserService.getUser(blogUser);
		System.err.println(blogUser);
		System.out.println(blogUserList.size());
		if(blogUserList.size()>0){
			System.out.println("登录进来了");
			String userName = blogUserList.get(0).getUserName();
			request.getSession().setAttribute("userName", userName);
			result = "transitionpage";
			request.getSession().removeAttribute("result");
		}else if(blogUserList.size()<=0){
			result = "login";
			System.out.println("没进这边？");
			request.getSession().setAttribute("result", "用户名或密码错误");
		}
		return result;
		
	}
	/**
	 * 跳转读者墙
	 */
	@RequestMapping("readers.html")
	public String goReaders(HttpServletRequest request){
		
		Page page = new Page();
		BlogLeaveWord blogLeaveWord = new BlogLeaveWord();
		String currentPages = request.getParameter("currentPages");
		if(currentPages==null||currentPages.equals("")){
			page.setCurrentPage(1);
			beginIndex=0;
			System.out.println(beginIndex+"首页");
		}else {
			page.setCurrentPage(Integer.parseInt(currentPages));
			beginIndex =(Integer.parseInt(currentPages)-1)*5;
			System.out.println(beginIndex+"-------"+"第"+currentPages+"页");
		}
		page.setBeginIndex(beginIndex);
		page.setEveryPage(everyPage);
		blogLeaveWord.setPage(page);
		List<BlogLeaveWord> leaveWordList = blogLeaveWordService.getLeaveWord(blogLeaveWord);
		
		
		System.out.println("总数量"+leaveWordList.size());
		int totalCount = blogLeaveWordService.getLeaveWordList();
		int totalPage =totalCount/everyPage;
		
		if(totalCount%everyPage!=0){
			totalPage=totalPage+1;
		}
		page.setTotalCount(totalCount);
		page.setTotalPage(totalPage);
		blogLeaveWord.setPage(page);
		
		System.out.println(blogLeaveWord.getPage().getCurrentPage()+"页数"+totalPage);
		System.out.println(leaveWordList);
		request.getSession().setAttribute("blogLeaveWord", blogLeaveWord);
		request.getSession().setAttribute("leaveWordList", leaveWordList);
		return "readers";
	}
	/**
	 * 跳转新增文章的页面
	 */
	@RequestMapping("edit.html")
	public String goEdit(){
		return "testwo";
	}
	@RequestMapping("login.html")
	public String goLogin(){
		return "login";
	}
	/**
	 * 新增文章
	 * @param request
	 * @param blogArticle
	 * @return
	 */
	@RequestMapping("saveArticle")
	public String saveAritcle(HttpServletRequest request,BlogArticle blogArticle){
		BlogArticle blogArticles = new BlogArticle();
		blogArticle.setBlogCreateTime(DateUtil.getNowTime());
		blogArticle.setBlogStatus(4);
		System.out.println(blogArticle);
		int blogId = usersService.saveAritcle(blogArticle);
		usersService.insertNum();
		System.out.println("新增文章返回的id"+blogId);
		blogArticles.setBlogId(blogId);
		
		blogArticles.setBlogCreateTime(DateUtil.getNowTime()); 
		usersService.insertComment(blogArticles);
		System.err.println("进入了新增方法中");
		return "404";
	}
	
	
	/**
	 * 留言板
	 * @param blogLeaveWord 留言参数
	 * @return 跳转过度页
	 */
	@RequestMapping("leaveWord")
	public String leave(BlogLeaveWord blogLeaveWord){
		
		System.out.println("你留言的内容："+blogLeaveWord);
		if(blogLeaveWord.getEmail()==null||blogLeaveWord.getWordContent()==null||blogLeaveWord.getWordPeople()==null){
			return "leaveword";
		}
		blogLeaveWord.setWordTime(DateUtil.getNowTime());
		blogLeaveWord.setWordStatus(0);
		blogLeaveWordService.leaveWord(blogLeaveWord);
		
		return "transitionpage";
	}
	@RequestMapping("/") 
	public ModelAndView index() {
        return new ModelAndView("first");
    }
	/**
	 * 跳转留言板页面
	 */
	@RequestMapping("/goleaveword.html")
	public String goleaveWord(){
		return "leaveword";
	}
	/**
	 * 个人简历页面
	 */
	@RequestMapping("/resume.html")
	public String toMyResume(){ 
		return "my";
	}
	/**
	 * 个人简历页面
	 */
	@RequestMapping("/about.html")
	public String about(){ 
		return "about";
	}
	/**
	 * 个人简历页面
	 */
	@RequestMapping("/demo.html")
	public String demo(){ 
		return "demo";
	}
	
	
	@Autowired
	private TestService testService;
	/**
	 * 跳转页面测试方法
	 */
	@RequestMapping("/test.html")
	public String tess(){ 
		return "first";
	}
}
