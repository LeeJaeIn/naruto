package com.wsq.webprj.controllers;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wsq.webprj.dao.FriendDao;
import com.wsq.webprj.dao.MemberDao;
import com.wsq.webprj.dao.MemberProfileDao;
import com.wsq.webprj.vo.Member;


//POJO 클래스
@Controller
@RequestMapping("/findpartner/")
public class FindPartnerController {
	
	//Spring이 제공하는 어노테이션
	@Autowired
	private MemberDao memberDao;
	
	
	@RequestMapping(value="userlist", method=RequestMethod.GET)
	public String userlist(int pg, boolean isNext, Model model) throws SQLException
	{
		isNext=true;
		List<Member> list = memberDao.getMembers(pg);
		if(memberDao.getMembers(pg+1).size()==0)
			isNext=false;
		
		model.addAttribute("list", list);
		model.addAttribute("pg",pg);
		model.addAttribute("isNext", isNext);
		return "findpartner/userlist";		
	}

	@RequestMapping("userDel")
	public String userDel(String id)
	{
		memberDao.delete(id);
		
		return "redirect:userlist?pg=1";
	}
	 
	
}
