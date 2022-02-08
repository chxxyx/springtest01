package com.spring.test01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeContorller {

	@RequestMapping("/list")
	public String notice() {
		
		return "/WEB-INF/view/client/notice/list.jsp";
	}
	
}
