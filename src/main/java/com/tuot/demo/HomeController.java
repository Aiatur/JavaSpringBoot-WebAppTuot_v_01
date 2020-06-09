package com.tuot.demo;

import java.io.ObjectInputStream.GetField;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
//	public String homeCM(String name, HttpSession session) {
//		System.out.println("Inside homeCM ");
//		session.setAttribute("name", name);
//		return "homeView";
//	}
	
//	@RequestMapping("home")
//	public String homeCM(HttpServletRequest req, HttpSession session) {
//		String name=req.getParameter("name");
//		System.out.println("Inside homeCM ");
//		session.setAttribute("name", name);
//		return "homeView";
//	}
	
//	@RequestMapping("home")//best way
//	public String homeCM(@RequestParam("myName") String name, HttpSession session) {//myName is the attribute name in view
//		System.out.println("Inside homeCM ");
//		session.setAttribute("name", name);
//		return "homeView";
//	}
	
//	@RequestMapping("home")//best
//	public ModelAndView homeCM(@RequestParam("myName") String name) {
//		System.out.println("Inside homeCM ");
//		ModelAndView modelAndViewObj = new ModelAndView();
//		modelAndViewObj.addObject("name",name);
//		modelAndViewObj.setViewName("homeView");
//		return modelAndViewObj;
//	}
	
	@RequestMapping("home")//best
	public ModelAndView homeCM(StudentModel studentObj) {
		System.out.println("Inside homeCM ");
		ModelAndView modelAndViewObj = new ModelAndView();
		modelAndViewObj.addObject("student",studentObj);
		modelAndViewObj.setViewName("homeView");
		return modelAndViewObj;
	}
	

}
