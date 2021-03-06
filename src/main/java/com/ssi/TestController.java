package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	//write the different handler-methods
	
	@RequestMapping("/info")
	public String showInformationPage(){
		return "information.jsp";
	}
	
	@RequestMapping("/data")
	public String showUserInfoPage(){
		return "userinfo.jsp";
	}
	
	
	
	@RequestMapping("/hello")
	public void helloHandler(){
		System.out.println("WELCOME TO FIRST SPRING WEB APPLICATION");
	}
	
	@RequestMapping("/welcome")
	public void welcome(){
		System.out.println("CHECKING WELCOME MAPPING");
	}
}
