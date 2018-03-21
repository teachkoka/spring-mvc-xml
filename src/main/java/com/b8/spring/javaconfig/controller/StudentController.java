package com.b8.spring.javaconfig.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.b8.spring.javaconfig.model.Student;
import com.b8.spring.javaconfig.service.StudentService;



@Controller
public class StudentController {
	
	@Autowired
	StudentService service;
	
	@RequestMapping(value="/student", method=RequestMethod.GET)
	public String getStudent(Model model){
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-login";
	}
	
	@RequestMapping(value="/student", method=RequestMethod.POST)
	public String postStudentData(@Valid @ModelAttribute Student student, BindingResult bindingResult, Model model){
		if(bindingResult.hasErrors()){
			return "student-login";
		}
		service.processStudentData(student);
		String text = "Hey "+student.getName()+"Welcome to Spring MVC.";
		model.addAttribute("message", text);
		return "success";

	}
	

}
