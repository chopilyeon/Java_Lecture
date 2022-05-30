package kr.ac.kopo.day07;

public class Constructor04 {

	public static void main(String[] args) {
		
		Member02 m = new Member02();
		Member02 m2 = new Member02("홍길동");
		/*
		Member m2 = new Member();
		m2.name = "홍길동";
		*/
		
		Member02 m3 = new Member02("윤길동", 22);
		Member02 m4 = new Member02("한길동", 30, "O");
		
		m.info();
		m2.info();
		m3.info();
		m4.info();
	}
}
