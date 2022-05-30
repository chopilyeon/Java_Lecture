package kr.ac.kopo.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import kr.ac.kopo.util.ConnectionFactory;
import kr.ac.kopo.util.JDBCClose;

public class UpdateMain01 {
	public static void main(String args[]) {
	Connection conn =null;
	PreparedStatement pstmt = null;
	
	try {
		conn=new ConnectionFactory().getConnection();
		conn.setAutoCommit(false); // jdbc 는 true로 되어 있음.  자동으로 commit하지 못하게 함. 실제 물리적인 DB는 변하지 못하게함 
//		String sql = "update t_test ";
//			   sql+=" set name=? "; 교수님은 앞과 끝에 항상 공백을 주더라. 
//			   sql+=" where id =? "
		//변화가 자주 발생하면 String class를 쓰지 않는다. String builder class 나 String buffer class를 사용함. 
		//변화가 발생하면 String class를 쓰지 않음. 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 ID를 입력: ");
		String id = sc.nextLine();
		System.out.print("수정할 이름을 입력 :");
		String name = sc.nextLine();
		
		StringBuilder sql = new StringBuilder();
		sql.append("update t_test ");
		sql.append(" set name = ? ");
		sql.append(" where id = ? ");
//		
		
		
		
//		String sql = "update t_test set name =? where id =?";
//		String builder 형을 toString으로 바꿔줘야함
		
		
		//query는 + 연산을 많이 씀 -> Stringbuilder class를 이용해서 써주더라 ~ 
		
		pstmt = conn.prepareStatement(sql.toString());
		pstmt.setString(1,name);
		pstmt.setString(2,id);
				
		int cnt = pstmt.executeUpdate();
		conn.commit(); // commit 이라고 하는 method를 써줘서 반영을 해주도록 하자. 이렇게 해서 transaction을 제어할 수 있음.
		System.out.println(cnt+"행 수정완료");
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}finally { 
		JDBCClose.close(pstmt,conn);
	}
	
	
//commit을 내가 원하는 시점에 해야함 autocommit이 돈 주고 받는 시스템 만들때에 무제가 될수가 있음. 
	}
}