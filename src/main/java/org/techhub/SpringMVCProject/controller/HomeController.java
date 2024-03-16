package org.techhub.SpringMVCProject.controller;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.techhub.SpringMVCProject.model.AdminLogin;
import org.techhub.SpringMVCProject.model.Student;
import org.techhub.SpringMVCProject.service.StudentService;

@Controller
public class HomeController {
	@Autowired
	StudentService studentservice;

	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	@RequestMapping(value="/validate" , method=RequestMethod.POST)
	public String masterpage(AdminLogin login,Map<String, String> map){
		
		if(login.getName().equals("admin") && login.getPass().equals("admin")) {
			return "master";
		}
		else {
			map.put("msg","Invalid Username and Password");
			return "home";
		}
		
		
	}
	
	@RequestMapping(value="/addstudent", method=RequestMethod.GET)
	public String addnewstudent(){
		return "addnew";
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String saveRecord(Student s,Map<String, String> m) {
		boolean b=studentservice.isAddStudent(s);
		if(b) {
			m.put("msg","Record Saved Succesfully");
		}
		else {
			m.put("msg", "Some Problem are there");
		}
		return "addnew";
		
	}
	
}
