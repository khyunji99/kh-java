package sec02.exam01_statement;

import java.sql.*;

class  JDBC_Select_org{
  public static void main(String[] args)  {

	String driver = "oracle.jdbc.driver.OracleDriver";
    String url = "jdbc:oracle:thin:@localhost:1521:XE";

    Connection con  = null;
    Statement  stmt = null;
    //---JDBC_Select 추가된 내용 -------
    ResultSet  rs   = null;
	int no = 0; 
    String name, email, tel;  //데이터베이스에서 얻어온 필드값 저장할 변수 선언
    String sql;               //SQL문을 저장할 변수 선언

    try{
    	// 1. jdbc 라이브러리를 로딩한다.
      Class.forName(driver);
      // 2. Connection 객체를 얻는다.
      con = DriverManager.getConnection(url, "SCOTT", "TIGER" );
      // 3. Statement 객체를 얻는다.
      stmt= con.createStatement();
      //---JDBC_Select 추가된 내용 -------
      sql = "SELECT * FROM customer";
      System.out.printf("번호 \t 이름 \t\t 이메일 \t\t 전화번호 \n");
      System.out.printf("-----------------------------------------------------------------\n");
      // 4. ResultSet rs = stmt.executeQuery() 메서드로 SELECT문을 수행한다.
      //    int res = stmt.executeUpdate() 메서드로 INSERT / UPDATE / DELETE문을 수행한다.
      // int res에는 추가된 데이터의 개수가 담아진다.
      // ResultSet 는 테이블의 하나의 ROW 형태의 데이터타입으로
      // ResultSet rs에는 추가되는 데이터값들이 테이블에 있는 하나의 ROW 형태로 담겨진다.
      rs = stmt.executeQuery(sql);  //얻어진 레코드를 가져옴

      while( rs.next() ){
		 no = rs.getInt("no"); 
         name = rs.getString("name");  
         email = rs.getString("email");     
         tel   = rs.getString("tel"); 
        System.out.printf(" %d \t %s \t %s \t %s\n", no, name,email,tel);
      } 
    }
    catch(Exception e){
      System.out.println("데이터베이스 연결 실패!");
    }
    finally{
      try{//rs, stmt, con 객체를 close() 메서드를 호출해 해제
        if( rs != null )      rs.close();        
        if( stmt != null )    stmt.close();
        if( con != null )     con.close();
      }
      catch(Exception e){
        System.out.println( e.getMessage( ));  
      }
    }
  }
}


