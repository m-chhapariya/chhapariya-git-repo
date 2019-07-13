package com.myblog.poetry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainHandler {
	
	@RequestMapping("/irshaad")
	public String welcomeHome() {
		return "index";
	}
	
}
