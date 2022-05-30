package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class SelectMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn=null;
		PreparedStatement pstmt = null;
		try {
			ConnectionFactory factory = new ConnectionFactory();
			conn = factory.getConnection();
			//conn = new ConnectionFactory().getConnection(); // 이렇게 써도 됨
			
			String sql = "Select * from t_test ";

			pstmt = conn.prepareStatement(sql);
			
			
			ResultSet rs = pstmt.executeQuery(); // return  형이 resulst.  set임 이게 그냥 실행 결과임. 무슨 표가 아님. 근데 맨처음에는 이걸 공백을 가르키더라.
			while(rs.next()) {
				String id=rs.getString("id");
				String name=rs.getString("name");
				System.out.println("id:"+id+",name:"+name);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCClose.close(pstmt, conn); // 이제 JDBCClose의 static method를 써보자
			}
		}
		
	}


//1 단계 2단계 5단계는 계속 반복이 됨 -> util로 받아버리자! 
