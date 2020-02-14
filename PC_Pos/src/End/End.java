package End;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import Manager.*;
import Person.Member;

public class End {
	private Connection conn;
	private PreparedStatement pstmt;
	Statement stmt;

	//로그아웃 + 회원정보 저장
	public End(List<Member> member) {//회원정보가 담겨있는 리스트가 들어오겠지?		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/mydb", "root", "201612006");
			if (conn != null) {
				System.out.println("DB 접속 성공");
			}		
			update(member);
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로드 실패");
		} catch (SQLException e) {
			System.out.println("DB 접속 실패");
			e.printStackTrace();
		}
	}
	
	private void update(List<Member> member) throws SQLException, ClassNotFoundException{
		// TODO Auto-generated method stub
		for (int i = 0; i < member.size(); i++) {
			try {
				stmt = conn.createStatement();
				String sql = "UPDATE pc_pos SET RESTTIME="+"'"+member.get(i).getRestTime()+"'"+"WHERE NAME="+"'"+member.get(i).getName()+"'";
				stmt.executeUpdate(sql);
				sql = "UPDATE pc_pos set TOTALTIME=" + "'"+member.get(i).getTotalTime() +"'"+ "where NAME=" +"'"+ member.get(i).getName()+"'";
				stmt.executeUpdate(sql);
				stmt.close();
			} catch (NullPointerException e) {
				String sql = "insert into pc_pos values(?,?,?,?,?,?)";
				if(conn!=null) {
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1,member.get(i).getName());
					pstmt.setString(2, member.get(i).getID());
					pstmt.setString(3, member.get(i).getBirth());
					pstmt.setString(4, member.get(i).getGrade());
					pstmt.setInt(5, member.get(i).getRestTime());
					pstmt.setInt(6, member.get(i).getTotalTime());
					pstmt.execute();
					pstmt.close();
				}

			}
			
		}
		conn.close();
	}
}
