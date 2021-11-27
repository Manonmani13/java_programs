package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	@RequestMapping("index")
	//@ResponseBody
public ModelAndView index(@RequestParam ("uname") String login,HttpSession sec)//HttpServletRequest req
{
	//System.out.println("hello");
		//HttpSession sec=req.getSession();
		//String s=req.getParameter("name");
		ModelAndView mav=new ModelAndView();
		mav.addObject("username",login);
		mav.setViewName("index");
		sec.setAttribute("username", login);
		return mav;
		//"index";//index.jsp
		
}
}
