package com.wsq.webprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomerCenterController {
	
	@RequestMapping("/customercenter/cuscenter")
	public String cuscenter(){
		return "customercenter/cuscenter";
	}
	
	

}
