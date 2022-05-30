package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Connection conn=null;
		PreparedStatement pstmt = null;
		try {
		
			
			Class.forName("Oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin@192.168.119.119:1521:dink";
			String user="scott";
			String password="tiger";
			
			conn = DriverManager.getConnection(url,user,password);
			
			String sql = "Select * from t_test ";

			pstmt = conn.prepareStatement(sql);
			
			
			ResultSet rs = pstmt.executeQuery(); // return  형이 resulst  set임 
			while(rs.next()) {
				String id=rs.getString("id");
				String name=rs.getString("name");
				System.out.println("id:"+id+",name:"+name);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}

//1 단계 2단계 5단계는 계속 반복이 됨 -> util로 받아버리자! 
