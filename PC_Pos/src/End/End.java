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

	//로그아웃 + 회원정보 저장
	public End(List<Member> member) {//회원정보가 담겨있는 리스트가 들어오겠지?		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/mydb", "root", "201612006");
			if (conn != null) {
				System.out.println("DB 접속 성공");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
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
