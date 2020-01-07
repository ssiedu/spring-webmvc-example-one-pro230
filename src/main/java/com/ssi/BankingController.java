package com.ssi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankingController {

	@RequestMapping("/inputpage")
	public String showInputPage(){
		return "dataentry.jsp";
	}

	@RequestMapping("/compute")
	public ModelAndView computeInterest(@ModelAttribute("data") InterestModel model){
		//process the request
		int t=model.getTime();
		int r=10;
		if(t>=5){
			r=12;
		}
		int interest=(model.getAmount()*t*r)/100;
		int net=model.getAmount()+interest;
		
		model.setRate(r);
		model.setInterest(interest);
		model.setNet(net);
		
		
		
		//provide the response using view (result.jsp)
	
		ModelAndView mv=new ModelAndView();
		mv.setViewName("result.jsp");
		mv.addObject("info", model);
		
		/*
		mv.addObject("amount", model.getAmount());	//request-object
		mv.addObject("time",t);
		mv.addObject("rate",r);
		mv.addObject("interest",interest);
		mv.addObject("net", net);
		*/
		return mv;
	}
	

	/*
	@RequestMapping("/compute")
	public void computeInterest(@ModelAttribute("data") InterestModel model, HttpServletResponse response){
		//process the request
		int t=model.getTime();
		int r=10;
		if(t>=5){
			r=12;
		}
		int interest=(model.getAmount()*t*r)/100;
		int net=model.getAmount()+interest;
		
		
		//provide the response
		
		try {
			PrintWriter out=response.getWriter();
			out.println("Interest Amount : "+interest);
			out.println("Net Amount  : "+net);
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	*/
	
	/*
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
	*/
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
