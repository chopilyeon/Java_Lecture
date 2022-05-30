package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBTestMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		try {//오라클 벤더에서 제공하는 class임. 
			//1단계 : 드라이버 로딩 
			//2. DB 접속 및 연결 객체 얻어오기 
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 외부장치임 외부장치에 access하는 것임. checked exception임 
			System.out.println("드라이버 로딩 완료...");
			
			Connection conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@192.168.119.119:1521:dink", //여기에는 url이 들어감 
					"scott",
					"tiger"
			);
			System.out.println("DB접속 성공:"+conn);
		//예외처리가 있어야함 없을 수도 있기 때문임.
		//예외 뜨는 이유 보면 uncatched  나옴 
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
