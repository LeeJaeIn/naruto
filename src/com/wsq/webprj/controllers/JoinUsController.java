package com.wsq.webprj.controllers;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wsq.webprj.dao.MemberDao;
import com.wsq.webprj.vo.Member;
import com.wsq.webprj.vo.MemberProfile;


//POJO Ŭ����
@Controller
@RequestMapping("/joinus/")
public class JoinUsController {
	
	@Autowired
	private MemberDao memberDao;
	
	
	//--------------------------------------------------------------
	@RequestMapping(value= "join",method=RequestMethod.GET)
	public String join(){
		
		return "joinus/join";
	}
	
	@RequestMapping(value= "join",method=RequestMethod.POST)
	public String join(Member m, MemberProfile mprofile, HttpSession session) throws SQLException
	{
		Date regDate = new Date();
		m.setRegDate(regDate);
		mprofile.setMember_mid(m.getMid());
		mprofile.setMember_mid(m.getMid());
		mprofile.setMember_mid(m.getMid());
		mprofile.setMember_mid(m.getMid());
		mprofile.setMember_mid(m.getMid());
		mprofile.setMember_mid(m.getMid());
		
		memberDao.insert(m);
		return "redirect:../findpartner/userlist"; 
	}
	//---------------------------------------------------------------
	
	@RequestMapping(value= "login",method=RequestMethod.GET)
	public String login(){
		
		return "joinus/login";
	}
	
	@RequestMapping(value= "login",method=RequestMethod.POST)
	public String login(String userID, 
			String password, 
			Model model,
			HttpSession session) throws SQLException
	{
		Member m = memberDao.getMember(userID);
		String error = null;
		
		if(m == null)
		{
			error = "����� ���̵� �Ǵ� 2313��й�ȣ�� �ùٸ��� �ʽ��ϴ�";
		}
		
		else if(!m.getPwd().equals(password)) //ȸ���� ���������� ��й�ȣ�� ��ġ���� ���� ���
			error = "����� ���̵� �Ǵ� 3213��й�ȣ�� �ùٸ��� �ʽ��ϴ�";
		
		if(error != null)
		{
			model.addAttribute("error", error);
			return "joinus/login";
		}
		
		
	
		//���� ����
		//���� ������ ���� ���?(session?cookie? ����)
		session.setAttribute("mid", userID);	
		return "redirect:../findpartner/userlist"; 
	}

}
