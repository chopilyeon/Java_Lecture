package kr.ac.kopo.day01;

/* 
 	기본형 : boolen
 	문자형 : char
 	정수형 : byte, short, int(기본), long
 	실수형 : float, double(기본)
 
 	변수선언
 	자료형 변수명;
 		
 	변수 대입
 	변수명 = 값;
 	
 	변수 초기화(선언과 동시에 값 대입)
 	자료형 변수명 = 값; 
 	
 	// 정수 123을 저장하기 위한 변수 c선언
 	 
 	 같은 자료형의 변수 여러개 선언
 	 자료형 변수명1,변수명2,변수명3,...; 
 
 
 
 
 
 
 */
	
		

public class VariableMain {

	char b; // 멤버변수라고 표현함 이건 자동초기화가 일어남 class 에서 선언되는 변수임.
	
		public static void main(String[] args) {
			
			
			//대문자 A를 저장하기 위한 변수 a선언
			char a; //ram 이라고 하는 메모리에 잡히게 됨. 지역변수임. method안에서 life style을 함께함 초기화 자동설정이 되지 않음. 
			a = 'A';
			
			//정수 123을 저장하기 위한 변수 c선언
			int c = 123;
			
			//실수 3개를 선언하기 위한 변수 d1,d2,d3 선언; 
//			double d1;
//			double d2;
//			double d3;
			double d1,d2,d3;
			//다른 타입은 불가능함
			//char e; int f; 
			
			//double d1,d2=12.34,d3; 이렇게는 주로 안함
			
			//double d1,d2=12.34,d3=0;
			
			System.out.println(a); //공간은 있지만 그 값이 없으므로 에러가 발생함 -> garbage 값이라고 표현함. 메소드안에 있는것들은 지역변수임. 
			System.out.println(c);
			
			
		}
}
