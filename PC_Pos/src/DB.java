//import java.sql.*;
//import java.util.*;
//
//import Person.*;
//public class DB {
//	private Connection conn;
//	private PreparedStatement pstmt;
//	private ResultSet rs;
//	private List<Member> MemberList;
//	
//	public List<Member> getMemberList() {
//		return MemberList;
//	}
//
//	public void setMemberList(List<Member> memberList) {
//		MemberList = memberList;
//	}
//
//	DB(){
//		MemberList = new ArrayList<>();
//		readDB();		
//	}
//
//	private void readDB() {
//		// TODO Auto-generated method stub
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/mydb", "root", "201612006");
//			GetBDtoList();
//			if (conn != null) {
//				System.out.println("DB ���� ����");
//			}
//		} catch (ClassNotFoundException e) {
//			System.out.println("JDBC ����̹� �ε� ����");
//		} catch (SQLException e) {
//			System.out.println("DB ���� ����");
//			e.printStackTrace();
//		}
//	}
//
//	private void GetBDtoList() throws SQLException {// BD���� ������ �ܾ�� ���� list�� map���� ���
//		// TODO Auto-generated method stub
//		String sql = "select * from pc_pos";
//		if (conn != null) {
//			try {
//				pstmt = conn.prepareStatement(sql);
//				rs = pstmt.executeQuery();
//				while (rs.next()) {// wordsŬ������ �ܾ� ���
//					String name = rs.getString(1);
//					String ID = rs.getString(2);
//					String birth = rs.getString(3);
//					String grade = rs.getString(4);
//					int restTime = rs.getInt(5);
//					int totalTime = rs.getInt(6);					
//					Member temp = new Member(name, ID,birth,grade,restTime,totalTime);
//					MemberList.add(temp);
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//		System.out.println("����Ʈ ����");
//		rs.close();
//		pstmt.close();
//		conn.close();
//	}
//}
