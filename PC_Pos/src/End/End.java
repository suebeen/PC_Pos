//package End;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.List;
//
//import Manager.*;
//import Person.Member;
//
//public class End {
//	private Connection conn;
//	private PreparedStatement pstmt;
//	Statement stmt;
//
//	//�α׾ƿ� + ȸ������ ����
//	public End(Member member) {//ȸ�������� ����ִ� ����Ʈ�� ��������?		
//		try {
//			Class.forName("org.mariadb.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mariadb://127.0.0.1:3306/mydb", "root", "201612006");
//			if (conn != null) {
//				System.out.println("DB ���� ����");
//			}		
//			update(member);
//		} catch (ClassNotFoundException e) {
//			System.out.println("JDBC ����̹� �ε� ����");
//		} catch (SQLException e) {
//			System.out.println("DB ���� ����");
//			e.printStackTrace();
//		}
//	}
//	
//	private void update(Member member) throws SQLException, ClassNotFoundException{
//		// TODO Auto-generated method stub
//			try {
//				stmt = conn.createStatement();
//				String sql = "UPDATE pc_pos SET RESTTIME="+"'"+member.getRestTime()+"'"+"WHERE NAME="+"'"+member.getName()+"'";
//				stmt.executeUpdate(sql);
//				sql = "UPDATE pc_pos set TOTALTIME=" + "'"+member.getTotalTime() +"'"+ "where NAME=" +"'"+ member.getName()+"'";
//				stmt.executeUpdate(sql);
//				stmt.close();
//			} catch (NullPointerException e) {
//				String sql = "insert into pc_pos values(?,?,?,?,?,?)";
//				if(conn!=null) {
//					pstmt = conn.prepareStatement(sql);
//					pstmt.setString(1,member.getName());
//					pstmt.setString(2, member.getID());
//					pstmt.setString(3, member.getBirth());
//					pstmt.setString(4, member.getGrade());
//					pstmt.setInt(5, member.getRestTime());
//					pstmt.setInt(6, member.getTotalTime());
//					pstmt.execute();
//					pstmt.close();
//				}
//
//			}
//					
//		conn.close();
//	}
//}
