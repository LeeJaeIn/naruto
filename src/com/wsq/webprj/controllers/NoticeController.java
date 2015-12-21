package com.wsq.webprj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeController {
	
	@RequestMapping("/noticecenter/notice")
	public String notice(){
		return"noticecenter/notice";
	}

}
