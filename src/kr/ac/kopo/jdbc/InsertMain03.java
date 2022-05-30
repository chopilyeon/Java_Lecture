package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt=null;
		
		
		try {
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
			String user ="scott";
			String password="tiger";
			conn=DriverManager.getConnection(url,user,password);
			
			String id = "kim";
			String name ="김길동";
			conn.createStatement(); // 객체를 만들어버림. 
			String sql = "insert into t_test(id,name) values(?,?)"; // 뭔가가 들어갈 자리에 ?로 나타냄. 
				   
			
			//preparedStatement 객체가  들어감. 
			pstmt=conn.prepareStatement(sql); // 이런 쿼리를 가지고 있는 statement 객체를 만들어줘라!
			//물음표를 채우기 위해
			pstmt.setString(1,id); // 문자를 넣을지 숫자를 넣을지 date를 넣을지 statement에 있는 객체는 저런거 해석 못함.
			//pstmt.setString(1,) 1번째에 문자를 넣으려고 해 이러면 알아서 작은 따옴표가 들어가게 됨. 
			pstmt.setString(2,name);
			
			int cnt = pstmt.executeUpdate(); // 여기에 매개변수가 들어갈 필요가 없음 위에 넣어줬음. 하지만 ?에 변수가 없어서 에러남
			//? 자리에 뭔가 넣어 줘야함. 
			System.out.println(cnt + "개 행이 삽입되었습니다.");
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			
		}
		
		

	}

}
