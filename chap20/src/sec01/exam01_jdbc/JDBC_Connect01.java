package sec01.exam01_jdbc;

import java.sql.*;

public class JDBC_Connect01 {

	public static void main(String[] args) {

		/** ORACLE JDBC Driver Test ***************************/
		String driver = "oracle.jdbc.driver.OracleDriver";
		// oracle.jdbc.driver.OracleDriver : 오라클을 만들 수 있는 객체들이 있는 클래스,,?
		/******************************************************/

		/** My-SQL JDBC Driver Test **************************/
		// String driver ="com.mysql.jdbc.Driver";
		/*****************************************************/

		try {
			Class.forName(driver);  // 클래스 객체를 생성한다.
			// oracle.jdbc.driver.OracleDriver라는 클래스를 가지고 객체를 만든 것
			System.out.println("JDBC Driver Loading 성공~!!");

		} catch (Exception e) {
			System.out.println("JDBC Driver Loading 실패~!!");
			e.printStackTrace();
		}
	}
}
