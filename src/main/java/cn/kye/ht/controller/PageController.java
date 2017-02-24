package cn.kye.ht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 这个类使用来定位汇通欢迎首页
 * 1. 学会通过controller定位前台页面
 * 2. / 请求拦截所有请求可能带来的问题(静态资源文件也会被拦截)，通过在springmvc-config
 * 中配置 mvc:defult-servlet-handler 来解决这问题
 * 3  可以通过讲 请求配置成*.action 的形式来背面静态资源被拦截的问题
 * 4 掌握利用RESTFUL的形式开业controller方法
 * @author 研
 *
 */
@Controller
public class PageController {
	
	/**
	 * 使用这一个方法 替代了 下面的四个方法
	 * 使用 RESTFUL来改造页面访问
	 * @param pageName
	 * @return
	 */
	@RequestMapping("/{pageName}")
	public String goPage(@PathVariable String pageName) {
		return "/home/"+pageName;
	}
	
	/**
	 * 这个方法是用来定位系统管理的左帧
	 * web-inf/pages/sysadmin/left.sjp
	 * @return
	 */
	@RequestMapping("/sysadmin/left")
	public String goSysadminLeft() {
		return "/sysadmin/left";
	}
	/**
	 * 该方法用来定位系统改管理的主帧页面
	 * /WEB-INF/pages/sysadmin/main.jsp
	 * @return
	 */
	@RequestMapping("/sysadmin/main")
	public String goSysadminMain() {
		return "/sysadmin/main";
	}
	
//	/**
//	 * 
//	 * 定位 欢迎页面
//	 *  对应的前台页面路径 WEB-INF/pages/home/index.jsp
//	 *  
//	 *  index.jsp用的是桢框架技术，把页面分厂了三个帧，分别是 top, left,mian
//	 *  每个帧对应一个页面
//	 *  
//	 * @return
//	 */
//	@RequestMapping("/index")
//	public String goIndex() {
//		//返回的视图逻辑要根据视图解析来确定
//		return "/home/index";
//	}
//	/**
//	 * 这个方法用来定位 顶帧  top
//	 * @return
//	 */
//	@RequestMapping("/title")
//	public String toTitle(){
//		return "/home/title";
//	}
//	/**
//	 * 这个方法用来定位  左帧  left
//	 * @return
//	 */
//	@RequestMapping("/left")
//	public String toLeft() {
//		return "/home/left";
//	}
//	/**
//	 * 这个方法用来定位 主帧  main
//	 * @return
//	 */
//	@RequestMapping("/main")
//	public String toMain() {
//		return "/home/main";
//	}
}
