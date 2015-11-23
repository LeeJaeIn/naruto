
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;

import com.wsq.webprj.dao.MemberDao;
import com.wsq.webprj.dao.mybatis.MyBatisMemberDao;
import com.wsq.webprj.vo.Member;

public class TestProgram {

	public static void main(String[] args) throws SQLException, ParseException {

		//�������� �Է�
		/*MemberProfile m_profile = new MemberProfile();
		m_profile.setAge(20);
		m_profile.setGender("male");
		m_profile.setHabitat_country_code(82);
		m_profile.setLevelMentee("beginner");
		m_profile.setLevelMentor("beginner");
		m_profile.setMember_mid("ybaek9001");
		m_profile.setName("yb");
		m_profile.setNationality_country_code(82);
		m_profile.setText("�ȳ��ϼ���");
		
		
		MemberProfileDao dao = new MyBatisMemberProfileDao();*/
		
		//ȸ������
		Member member = new Member();
		member.setMid("msfad");
		member.setPwd("1234");
		
		MemberDao dao = new MyBatisMemberDao();
		
		
		
		
		//int update = dao.delete("yb");
		//int update = dao.update(member);
		int update = dao.insert(member);
		
		List<Member>list = dao.getMembers(1);
		//List<Member>list = dao.getMembers(1,"Mid","");
		
		System.out.println("�˻����:" + list.size());
		
		for(Member m : list)
		{
			System.out.printf(
					"mid : %s, "
					+ "pwd : %s\n", 
					m.getMid(),
					m.getPwd());		
		}
		
		System.out.printf("%d\n", update);
		//session.close();  //session ����� �� ���������� ����
		
	}

}  

//api - �÷���(����)�� �������ִ� ���̺귯��
//�����ӿ�ũ - ��ü�������� �������� ���� ������ ���̺귯��
//mybatis�� ���Ǽ��� �ִ� �����ӿ�ũ(�ɼ�-�־�ǰ� �����), ������ api(�� �ʿ��� ����)�� �ƴ�
