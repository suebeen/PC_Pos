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
//				System.out.println("DB 접속 성공");
//			}
//		} catch (ClassNotFoundException e) {
//			System.out.println("JDBC 드라이버 로드 실패");
//		} catch (SQLException e) {
//			System.out.println("DB 접속 실패");
//			e.printStackTrace();
//		}
//	}
//
//	private void GetBDtoList() {// BD에서 가져온 단어와 뜻을 list와 map으로 등록
//		// TODO Auto-generated method stub
//		String sql = "select * from voca";
//		if (conn != null) {
//			try {
//				pstmt = conn.prepareStatement(sql);
//				rs = pstmt.executeQuery();
//				while (rs.next()) {// words클래스에 단어 등록
//					String eng = rs.getString(1);
//					String prekor = rs.getString(2);
//					StringTokenizer kt = new StringTokenizer(prekor, "/");
//					int line = kt.countTokens();
//					Words w = new Words(line);
//					w.setEng(eng);
//					for (int i = 0; i < line; i++) {
//						w.setKor(kt.nextToken().trim(), i);
//					}
//					arr.add(w);// words클래스를 list에 등록, 단어는 BD에 있으나 실제 문제는 list로 만들어진다.
//				}
//				for (int i = 0; i < arr.size(); i++) // map에 단어장 등록 -> addword()에서 단어 비교을 위함.
//					voca.put(arr.get(i).getEng(), arr.get(i).getKor());
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//
//		}
//		System.out.println("리스트 성공");
//	}
//}
