package Day15;
// sql 포함하기
// 프로젝트 - 우클릭 - Build Path Add External~~ - 설치한 파일 선택 - apply
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBConnection { // 코드 시험 나온당 

	//  
	public Connection con;  // 연결을 시도하는 객체
	public Statement stmt; // SQL 언어의 코드를 만들어 실행하도록 하는것
	public PreparedStatement psmt; // 
	public ResultSet rs; // SQL문을 실행한 결과를 얻어오기 위한것.

	// 기본생성자
	public JDBConnection() {
		try {
			// JDBC 드라이버 로드
			// My SQL
			Class.forName("com.mysql.cj.jdbc.Driver");

			// DB에 연결
			// URL : [PORT]/[스키마]?옵션파라미터
			// MySQL
			String url = "jdbc:mysql://localhost:3306/human?serverTimezone=Asia/Seoul&allowPublicKeyRetrieval=true&useSSL=false";
			String id = "human";
			String pw = "123456";

			con = DriverManager.getConnection(url, id, pw); // 자바랑 SQL 연결 시도
			System.out.println("DB 연결 성공"); 
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
