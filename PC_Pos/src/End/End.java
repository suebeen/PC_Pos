package End;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import Manager.*;
import Person.Member;

public class End {
	private Connection conn;
	private PreparedStatement pstmt;

	//�α׾ƿ� + ȸ������ ����
	public End(List<Member> member) {//ȸ�������� ����ִ� ����Ʈ�� ��������?		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/mydb", "root", "201612006");
			if (conn != null) {
				System.out.println("DB ���� ����");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε� ����");
		} catch (SQLException e) {
			System.out.println("DB ���� ����");
			e.printStackTrace();
		}
		String sql = "insert into pc_pos valuse(?,?,?,?,?,?)";
		
		if(conn!=null) {
			try {
				for (int i = 0; i < member.size(); i++) {
					pstmt = conn.prepareStatement(sql);
					
				}
			}catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
