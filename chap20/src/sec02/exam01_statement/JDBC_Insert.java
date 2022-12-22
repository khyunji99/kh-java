package sec02.exam01_statement;

//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;

import java.sql.*;

public class JDBC_Insert {

	public static void main(String[] args) {
		// �ڹٿ��� ����ŬDB�� �����Ϸ��� JDBC�� ������ �־���Ѵ�.
		// 1. ������Ʈ�� ojdbc7.jar ���̺귯���� ���Խ�Ų��.
		String driver = "oracle.jdbc.driver.OracleDriver";
		// driver�� ���°� ojdbc7(�ܺο��� ������� ��Ű��)�� ����ִ�
		// Ŭ�������� �־��ִ� ���̴�.
		// �������� oracle.jdbc.driver(�ܺο��� �������) ��Ű���� �ִ�
		// OracleDriver��� Ŭ������ ���� driver�� ���� ���̴�.
		String url = "jdbc:oracle:thin:@localhost:1521:XE"; // ����Ŭ�� ������ �� �̷��� ������ url�� �����Ѵ�.
		String sql;
		Connection con = null; // import java.sql.Connection; ������Ѵ�.
		Statement stmt = null; // import java.sql.Statement;
		
				
		// 2. OracleDriver Ŭ������ JVM�� �ε��Ų��. Class.forName(...)
		try {
			Class.forName(driver); // driver�� ����ִ� Ŭ������ �޸𸮿� �ø� �� �ִ��� Ȯ���ϴ� ����
			// driver ������ �߸� ���� ���� �ֱ� ������ ���ܰ� �߻������� �ڵ��̴�
			// --> try-catch�� ���� ó���������
			System.out.println("JDBC Driver Loading ����!!");
			
			// 3. java.sql.DriverManager.getConnection()�� Connection ��ü�� �����Ѵ�.
			con = DriverManager.getConnection(url, "SCOTT", "TIGER");
			// driver�� �����ͺ��̽��� ������ �ϸ� con ��ü�� �����. �׷��� url�� user_name�� �н������ ������ �õ��Ѵ�.
			System.out.println("�����ͺ��̽� ���� ����!!");
			
			// 4. Connection��ü���� createStatement()�޼���� Statement��ü�� ��´�.
			stmt = con.createStatement();
			sql = "INSERT INTO CUSTOMER(NO, NAME, EMAIL, TEL) VALUES ";
			sql += "(2, '���缮', 'js@naver.com', '010-4433-6655')"; // ( ) �ȿ��� ���ڿ��� '' �� �� ������ �³׵��� oracleDB���� �����ͷ� ���� �ֵ��̶� �ű⼭�� ���ڰ� ''�� �ν��ϱ� ������ �׷��� ��������Ѵ�.
			
			
			// 5. Statement.executeUpdate() �޼���� �Ű������� ������ sql ������ �����Ѵ�.
			//    Statement ��ü�� �ִ� executeUpdate �޼��忡 ������ ������ �ִ´�.
			//    executeQuery() �޼��� : SELECT �� �� ����ϴ� �޼���
			int res = stmt.executeUpdate(sql); // stmt.executeUpdate(sql)�� 1 ���� <-- �����Ͱ��� �ϳ� �־���� ������ 1����
			
			if(res==1) {
				System.out.println("������ �Է� ����!!");
			} else {
				System.out.println("������ �Է� ����..");
			}
			
		} catch (Exception e) {
			System.out.println("JDBC Driver Loading ����..");
			e.printStackTrace();
		} finally {
			try {
				// 6. statement.close(), Connecton.close();
				stmt.close();
				con.close(); // �� �ڵ忡�� ���ܰ� �߻��� ���� �־ try-catch �� ���� �������Ѵ�.
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
