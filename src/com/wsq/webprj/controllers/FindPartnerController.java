package com.wsq.webprj.controllers;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wsq.webprj.dao.MemberDao;
import com.wsq.webprj.dao.mybatis.MyBatisMemberDao;
import com.wsq.webprj.vo.Member;


//POJO Ŭ����
@Controller
@RequestMapping("/findpartner/")
public class FindPartnerController {
	
	//Spring�� �����ϴ� ������̼�
	
	@RequestMapping("userlist")
	public String userlist(PrintWriter out, Model model) throws SQLException
	{
		MemberDao dao = new MyBatisMemberDao();
		List<Member> list = dao.getMembers(1);
		model.addAttribute("list", list);
		return "findpartner/userlist";		
	}
	
}
