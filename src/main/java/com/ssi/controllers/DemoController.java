package com.ssi.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController {
	
	@RequestMapping("/checking")
	public void check(){
		System.out.println("Checking Success============>");
	}
	
}
