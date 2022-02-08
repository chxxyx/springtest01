package com.spring.test01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String home() {
		
		return"/WEB-INF/view/home.jsp";
	}
	
}
