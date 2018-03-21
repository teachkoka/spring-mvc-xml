package com.b8.spring.javaconfig.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.b8.spring.javaconfig.model.Student;


@Controller
public class LandingPageController {
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String landingPage(Model model){
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-login";
	}
	
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String indexPage(Model model){
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-login";
	}

}
