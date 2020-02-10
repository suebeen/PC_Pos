//import java.sql.*;
//import java.util.StringTokenizer;
//
//import voca.Words;
//
//public class DB {
//	private Connection conn;
//	private PreparedStatement pstmt;
//	private ResultSet rs;
//	
//	DB(){
//		readDB();
//		
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
//	private void GetBDtoList() {// BD���� ������ �ܾ�� ���� list�� map���� ���
//		// TODO Auto-generated method stub
//		String sql = "select * from voca";
//		if (conn != null) {
//			try {
//				pstmt = conn.prepareStatement(sql);
//				rs = pstmt.executeQuery();
//				while (rs.next()) {// wordsŬ������ �ܾ� ���
//					String eng = rs.getString(1);
//					String prekor = rs.getString(2);
//					StringTokenizer kt = new StringTokenizer(prekor, "/");
//					int line = kt.countTokens();
//					Words w = new Words(line);
//					w.setEng(eng);
//					for (int i = 0; i < line; i++) {
//						w.setKor(kt.nextToken().trim(), i);
//					}
//					arr.add(w);// wordsŬ������ list�� ���, �ܾ�� BD�� ������ ���� ������ list�� ���������.
//				}
//				for (int i = 0; i < arr.size(); i++) // map�� �ܾ��� ��� -> addword()���� �ܾ� ���� ����.
//					voca.put(arr.get(i).getEng(), arr.get(i).getKor());
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//		System.out.println("����Ʈ ����");
//	}
//}
