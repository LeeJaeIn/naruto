
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;

import java.util.List;

import com.wsq.webprj.dao.MemberDao;
import com.wsq.webprj.dao.mybatis.MyBatisMemberDao;
import com.wsq.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException, ParseException {

		
		
		
		Member member = new Member();
		member.setMid("a");
		member.setPwd("3333");
		member.setName("waytogo");
		member.setRegDate(new Date(System.currentTimeMillis()));
		
		MemberDao dao = new MyBatisMemberDao();
		
		//int update = dao.delete("yb");
		int update = dao.update(member);
		//int update = dao.insert(member);
		
		List<Member>list = dao.getMembers(1);
		//List<Member>list = dao.getMembers(1,"Mid","");
		
		System.out.println("�˻����:" + list.size());
		
		for(Member m : list)
		{
			System.out.printf("mid : %s, name: %s, pwd: %s, regDate : %s, ���ϴ� ���: %s, ���� ���: %s, ����: %s \n", 
					m.getMid(),m.getName(),m.getPwd(), m.getRegDate(), m.getSpeakingLanguage(), m.getLearningLanguage(), m.getCountry());
		}
		
		//System.out.printf("%d\n", update);
		//session.close();  //session ����� �� ���������� ����
		
	}

}  

//api - �÷���(����)�� �������ִ� ���̺귯��
//�����ӿ�ũ - ��ü�������� �������� ���� ������ ���̺귯��
//mybatis�� ���Ǽ��� �ִ� �����ӿ�ũ(�ɼ�-�־�ǰ� �����), ������ api(�� �ʿ��� ����)�� �ƴ�
