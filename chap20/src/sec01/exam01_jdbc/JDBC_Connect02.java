package sec01.exam01_jdbc;

import java.sql.*;

public class JDBC_Connect02 {

	public static void main(String[] args) {

		/** ORACLE JDBC Driver Test *****************************************/
		String driver = "oracle.jdbc.driver.OracleDriver";
		// String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		// jdbc:oracle:thin:@localhost:1521:XE 란,
		// 오라클에 접속할 수 있는 커넥션 정보
		// 데이터베이스 서버이름 : localhost
		// 객체 이름..? : XE
		/*******************************************************************/

		/** My-SQL JDBC Driver *********************************************/
		// String driver ="com.mysql.jdbc.Driver";
		// String url = "jdbc:mysql://localhost/academy";
		/*******************************************************************/

		Connection con = null;

		try {
			// driver 를 메모리에 올린다.
			Class.forName(driver);

			/** ORACLE에서 Connection 객체 ***********************************/
			con = DriverManager.getConnection(url, "SCOTT", "TIGER");
			// url 하고 userid랑 password를 가지고 오라클 driver를 이용해서 커넥션을 한다.
			// 패스워드를 TIGER대신 이상한 값 "TIGER1" 를 넣어주면 커넥션이 안되기 때문에
			// 데이터베이스 연결 실패 가 출력된다.
			/*******************************************************************/

			/** My-SQL에서 Connection 객체 ***********************************/
			// con = DriverManager.getConnection(url, "totoro", "1234" );
			/*******************************************************************/

			System.out.println("데이터베이스 연결 성공~!!");

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패~!!");
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
