package kr.ac.kopo.jdbc;
/*
 * 아이디 입력:park
 * 이름 입력: 박길동 
 * 1개행을 삽입하였습니다.
 * 
 * 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn=null;
		Statement stmt=null;
		Scanner sc = new Scanner(System.in);
		//try 문과 finally 둘다 사용하기 위해서 이렇게 사용함 -> 인텔리제이에 내가 도서관 구현할 때 생각해보자.
		//1 단계 : 드라이버 로딩
		try {
		 Class.forName("oracle.jdbc.driver.OracleDriver"); 
		 System.out.println("드라이버 로딩 성공...");
		 
		 //2단계 : DB 접속 및 Connection 객체 얻기 
		 String url = "jdbc:oracle:thin:@192.168.119.119:1521:dink";
		 String user= "scott";
		 String password="tiger";
		 
		 conn
		 	=DriverManager.getConnection(url,user,password); //메소드가 객체를 만들도록 도와줌 
		 System.out.println("conn: "+conn);
		 	//3단계: sql 실행 객체 얻어오기
		 	//new 하지 않음 -> 그냥 받아옴 connection 객체에서 statement 객체를 얻어올 것임
		 	//statement객체를 얻어오자
		 stmt = conn.createStatement(); //return형이 statement임 //java.sql에서 긁어 와야함. //메소드가 객체를 만들도록 도와줌.
		 System.out.println("id를 입력하세요");
		 String id=sc.nextLine();
		 System.out.println("이름을 입력하세요");
		 String name=sc.nextLine();
		 String sql ="insert into t_test(id,name)" +"values(\'"+id+"\',\'"+name+"\')";
		 //작은 따옴표를 넣어야함. oracle dbms에서는 작은 따옴표!~ 따옴표 안넣으면 에러 발생함.
		 //작은 따옴표 너무 불편함. query가 잘 눈에 안보임 -> 가독성이 문제가 생김.
		 //그래서 prepared statement가 생겨났음.
		 	//4단계 : sql을 실행하고 결과를 얻어오기 
		 	//stmt를 실행하도록 하자! 
		 	int cnt = stmt.executeUpdate(sql);// return 값이 int임. 수정한 값이 출력이 됨 
		 	System.out.println("총" + cnt + "개 행이 삽입되었습니다.");
		 	//이제 접속을 종료해야 함. 
		}catch(Exception e) {
			e.printStackTrace();
		}finally { //5단계: 접속을 종료함 
			//접속을 해지하는 명령어는 close로 하기로 다 약속함 지금 우리는 객체 2개 얻어옴 2개 다 close해야함 만들어진 순서 반대로 
			//만들어진 순서 반대로 statement 해제 하고 connection을 close 하자 
			if(stmt !=null) {
			try{ // block scope안에서만 stmt가 작동함  //sql exception이 발생할 수 있으므로  try catch
				stmt.close(); //연결이 누군가 oracle DBMS 껐을 때 null이 아닌데도 close하므로 에러가 발생할 수 있음. 
			} catch(Exception e) {
				e.printStackTrace();
			}
			// 같은 try - catch에 묶으면 안됨 
			if(conn !=null) {
				try {
					conn.close(); // connection을 끊는 연습은 해야하지만 일단 여기서는 자동으로 끊어버림. 
				}catch(Exception e) {
					e.printStackTrace(); //특이하게도 자동으로 auto commit 이 됨. 
				}
		
			}
			}
		}

		//위에 꺼 또 실행하면 에러남 -> primary key 규칙에 위반이 됨.
		//이제 키보드로 아이디와 패스워드를 입력받아서 접속할 수 있도록 해보자. 
		
	}
}