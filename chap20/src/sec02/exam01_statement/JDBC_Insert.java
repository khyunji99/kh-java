package sec02.exam01_statement;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

import java.sql.*;

public class JDBC_Insert {

	public static void main(String[] args) {
		// 자바에서 오라클DB에 접근하려면 JDBC가 무조건 있어야한다.
		// 1. 프로젝트에 ojdbc7.jar 라이브러리를 포함시킨다.
		String driver = "oracle.jdbc.driver.OracleDriver";
		// driver에 들어가는건 ojdbc7(외부에서 만들어진 패키지)에 들어있는
		// 클래스들을 넣어주는 것이다.
		// 위에서는 oracle.jdbc.driver(외부에서 만들어진) 패키지에 있는
		// OracleDriver라는 클래스를 지금 driver에 넣은 것이다.
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; // 오라클에 접속할 때 이러한 형태의 url로 접속한다.
		String sql;
		Connection con = null; // import java.sql.Connection; 해줘야한다.
		Statement stmt = null; // import java.sql.Statement;
		
				
		// 2. OracleDriver 클래스를 JVM에 로드시킨다. Class.forName(...)
		try {
			Class.forName(driver); // driver에 담겨있는 클래스를 메모리에 올릴 수 있는지 확인하는 구문
			// driver 내용이 잘못 들어올 수가 있기 때문에 예외가 발생가능한 코드이다
			// --> try-catch로 예외 처리해줘야함
			System.out.println("JDBC Driver Loading 성공!!");
			
			// 3. java.sql.DriverManager.getConnection()로 Connection 객체를 생성한다.
			con = DriverManager.getConnection(url, "SCOTT", "TIGER");
			// driver로 데이터베이스에 접속을 하면 con 객체가 생긴다. 그러면 url과 user_name과 패스워드로 접속을 시도한다.
			System.out.println("데이터베이스 연결 성공!!");
			
			// 4. Connection객체에서 createStatement()메서드로 Statement객체를 얻는다.
			stmt = con.createStatement();
			sql = "INSERT INTO CUSTOMER(NO, NAME, EMAIL, TEL) VALUES ";
			sql += "(2, '유재석', 'js@naver.com', '010-4433-6655')"; // ( ) 안에서 문자열을 '' 로 한 이유는 걔네들은 oracleDB에서 데이터로 들어가는 애들이라 거기서는 문자가 ''로 인식하기 때문에 그렇게 적어줘야한다.
			
			
			// 5. Statement.executeUpdate() 메서드로 매개변수로 들어오는 sql 문장을 실행한다.
			//    Statement 객체에 있는 executeUpdate 메서드에 실행할 문장을 넣는다.
			//    executeQuery() 메서드 : SELECT 할 때 사용하는 메서드
			int res = stmt.executeUpdate(sql); // stmt.executeUpdate(sql)는 1 리턴 <-- 데이터값을 하나 넣어줬기 때문에 1리턴
			
			if(res==1) {
				System.out.println("데이터 입력 성공!!");
			} else {
				System.out.println("데이터 입력 실패..");
			}
			
		} catch (Exception e) {
			System.out.println("JDBC Driver Loading 실패..");
			e.printStackTrace();
		} finally {
			try {
				// 6. statement.close(), Connecton.close();
				stmt.close();
				con.close(); // 이 코드에서 예외가 발생할 수도 있어서 try-catch 로 예외 잡아줘야한다.
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
