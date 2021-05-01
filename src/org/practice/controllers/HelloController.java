package org.practice.controllers;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.practice.model.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jakarta.validation.Valid;

@Controller
public class HelloController {

	@InitBinder
	public void intiBinder(WebDataBinder binder){
		SimpleDateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
		binder.registerCustomEditor(Date.class, "dob", new CustomDateEditor(dateFormat, false));		
	}	
	
	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public ModelAndView morning() {
		ModelAndView mv = new ModelAndView("RegistrationPage");
		//mv.addObject("greetings", "Good Morning..." + userName + " pwd is " + password);
		return mv;
	}

	@RequestMapping(value="/welcome/evening/{userName}/{password}", method = RequestMethod.GET)
	public ModelAndView evening(@PathVariable("userName")String userName, @PathVariable("password")String password) {
		ModelAndView mv = new ModelAndView("HelloPage");
		mv.addObject("greetings", "Good Evening..." + userName + " pwd is " + password);
		return mv;
	}

	@RequestMapping(value="/registration.html", method = RequestMethod.POST)
	public ModelAndView registration(@ModelAttribute("student") Student student, BindingResult result) {
		System.out.println("Inside Registration API");
		
		if(result.hasErrors()) {
			System.out.println("Has some Errors...");
			ModelAndView mv = new ModelAndView("RegistrationPage");
			return mv;
		}		
		System.out.println("No Errors... Found!!!");
		ModelAndView mv = new ModelAndView("LoginPage");
		mv.addObject("student", student);
		return mv;
	}
	
	
}
