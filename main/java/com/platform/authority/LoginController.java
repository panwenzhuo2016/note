//package com.platform.authority;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.servlet.ModelAndView;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
///**
// * 登录
// * @author Rundon
// *
// */
//@Controller
//@RequestMapping("/platform/authority")
//public class LoginController  {
//
//	@Autowired
//
//	@RequestMapping(value = "login", method = RequestMethod.GET)
//	public String login(HttpServletRequest request, HttpServletResponse response) {
////		Principal principal = WebUtil.getPrincipal();
////
////		// 如果已经登录，则跳转到管理首页
////		if(principal != null && !principal.isMobileLogin()){
////			return "redirect:/platform/authority/home.spr";
////		}
//		return "login";
//	}
//
//	/**
//	 * 登录失败
//	 */
//	@RequestMapping(value = "login", method = RequestMethod.POST)
//	public String loginFail(HttpServletRequest request, HttpServletResponse response) {
////		Principal principal = WebUtil.getPrincipal();
////		if(principal != null){
////			return "home";
////		}
////
////		String username = WebUtils.getCleanParam(request, FormAuthenticationFilter.DEFAULT_USERNAME_PARAM);
////		boolean rememberMe = WebUtils.isTrue(request, FormAuthenticationFilter.DEFAULT_REMEMBER_ME_PARAM);
////		boolean mobile = WebUtils.isTrue(request, FormAuthenticationFilter.DEFAULT_MOBILE_PARAM);
////		String exception = (String)request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
////		String message = (String)request.getAttribute(FormAuthenticationFilter.DEFAULT_MESSAGE_PARAM);
////
////		if (StringUtils.isBlank(message) || StringUtils.equals(message, "null")){
////			message = "用户或密码错误, 请重试.";
////		}
////
////		model.addAttribute(FormAuthenticationFilter.DEFAULT_USERNAME_PARAM, username);
////		model.addAttribute(FormAuthenticationFilter.DEFAULT_REMEMBER_ME_PARAM, rememberMe);
////		model.addAttribute(FormAuthenticationFilter.DEFAULT_MOBILE_PARAM, mobile);
////		model.addAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME, exception);
////		model.addAttribute(FormAuthenticationFilter.DEFAULT_MESSAGE_PARAM, message);
////
//		return "login";
//	}
//
//	/**
//	 * 退出
//	 * @author Rundon
//	 * @param request
//	 * @param response
//	 * @param model
//	 * @return
//	 */
//	@RequestMapping(value="logout")
//	public String logout(HttpServletRequest request, HttpServletResponse response){
////		SecurityUtils.getSubject().logout();
//		return "login";
//	}
//
//	/**
//	 * 登录成功
//	 * @author Rundon
//	 * @param request
//	 * @param response
//	 * @return
//	 */
//	@RequestMapping(value="home")
//	public ModelAndView home(HttpServletRequest request, HttpServletResponse response){
////		Principal principal = WebUtil.getPrincipal();
//		ModelAndView model=new ModelAndView("login");
////		if(principal==null){
////			return model;
////		}
//		model=new ModelAndView("home");
//		return model;
//	}
//
//	/**
//	 * 跳转模块
//	 * @author Rundon
//	 * @param request
//	 * @param response
//	 * @return
//	 */
//	@RequestMapping(value="appModule")
//	public ModelAndView appModule(@RequestParam(required=true) String moduleId, HttpServletRequest request, HttpServletResponse response){
////		Principal principal = WebUtil.getPrincipal();
//		ModelAndView model=new ModelAndView("login");
////		if(principal==null){
////			return model;
////		}
//		model=new ModelAndView("appModule");
//		model.addObject("moduleId", moduleId);
////		model.addObject("moduleName", systemCache.loadDmValue("DM_MENU", moduleId));
//		return model;
//	}
//}
