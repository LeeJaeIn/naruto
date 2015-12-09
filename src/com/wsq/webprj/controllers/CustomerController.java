package com.wsq.webprj.controllers;

import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


//POJO Ŭ����
@Controller
public class CustomerController {
	
	//Spring�� �����ϴ� ������̼�
	
	@RequestMapping("/customer/index") 
	public String index(PrintWriter out, Model model)
	{
		return "customer/index";
	}
		
	@RequestMapping("/customer/mypage") 
	public String myPage(PrintWriter out, Model model)
	{
		return "customer/mypage";
	}
	
	@RequestMapping("/customer/debate")
	public String debate(PrintWriter out, Model model)
	{
		return "customer/debate";		
	}
	
	@RequestMapping("/joinus/join")
	public String join(PrintWriter out, Model model)
	{
		return "joinus/join";		
	}
	
	@RequestMapping("/joinus/login")
	public String login(PrintWriter out, Model model)
	{
		return "joinus/join";		
	}
	
}
