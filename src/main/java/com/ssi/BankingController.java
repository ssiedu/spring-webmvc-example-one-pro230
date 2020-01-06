package com.ssi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BankingController {

	@RequestMapping("/inputpage")
	public String showInputPage(){
		return "dataentry.jsp";
	}
	
	
	@RequestMapping("/compute")
	public void computeInterest(@RequestParam("t1") int amount, @RequestParam("t2") int time, HttpServletResponse response){
		
		//process the request
		int interest=(amount*time*10)/100;
		int netamt=amount+interest;
		//provide the response
		
		try {
			PrintWriter out=response.getWriter();
			out.println("Interest Amount : "+interest);
			out.println("Net Amount  : "+netamt);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	/*
	@RequestMapping("/compute")
	public void computeInterest(HttpServletRequest request, HttpServletResponse response){
		//this method will be called , when url ends with compute
		//this the handler for compute url.
		//this method is supposed to read request parameters
		int amount=Integer.parseInt(request.getParameter("t1"));
		int time=Integer.parseInt(request.getParameter("t2"));
		//process the request
		int interest=(amount*time*10)/100;
		int netamt=amount+interest;
		//provide the response
		
		try {
			PrintWriter out=response.getWriter();
			out.println("Interest Amount : "+interest);
			out.println("Net Amount  : "+netamt);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	*/
	
}
