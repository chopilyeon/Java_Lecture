package kr.ac.kopo.day11.Main;

import java.util.Scanner;

class MismatchEvenException extends Exception{
	//Excepiton class가 갖고 있는 생성자를 source에서 끌고 올 수 있음. 
	//부모꺼 그냥 호출해줌. 
	//throw new Exception("짝수가 아닌 정수가 입력되었습니다"); // try - catch 가 없어서 에러 발생 중. 

	public MismatchEvenException() {
		super();

	}

	public MismatchEvenException(String message) {
		super(message);
		System.out.println("안녕하세요");
		
	}
	
	
	

	
	
}



public class ExceptionMain08 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		// 이게 우리가 아는 일반적인 예외처리임 throw를 한번 이용해보겠다는 뜻임.  
		Scanner sc = new Scanner(System.in);
	    System.out.print("짝수를 입력:");
		
		int num = sc.nextInt();
		
		if(num<0||num%2==1) {
			
			System.out.println("잘못입력했습니다");
		}else {
			System.out.println("짝수:"+num);
		}
	
		/////////////// 이게 진짜임. 
		
		
		package kr.ac.kopo.day11;

		import java.util.Scanner;

		class MismatchEvenException extends Exception {

			public MismatchEvenException() {
				super();
			}

			public MismatchEvenException(String message) {
				super(message);
			}
			
		}


			public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);
				try {
					System.out.print("짝수를 입력 : ");
					int num = sc.nextInt();

					if (num < 0 || num % 2 == 1) {
						throw new MismatchEvenException(num + "은 짝수가 아닙니다"); //try 내부에 있어야함 
					}
				} catch(Exception e) {
					System.out.println(e.getMessage()); // 타고타고 가서 getMessage 도달 e.getMessage() 메세지 출력. 
					e.printStackTrace();
				}
				
				/*
				Scanner sc = new Scanner(System.in);
				System.out.print("짝수를 입력 : ");
				int num = sc.nextInt();
				
				if(num < 0 || num % 2 == 1) {
					System.out.println("잘못입력했습니다");
				} else {
					System.out.println("짝수 : " + num);
				}
				*/
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*package kr.ac.kopo.day11;

		import java.util.Scanner;

		public class ExceptionMain08 {

			public static void main(String[] args) {
				
				Scanner sc = new Scanner(System.in);
				try {
					System.out.print("짝수를 입력 : ");
					int num = sc.nextInt();

					if (num < 0 || num % 2 == 1) {
						throw new Exception("짝수가 아닌 정수가 입력되었습니다");
					}
				} catch(Exception e) {
					System.out.println(e.getMessage());
				}
				
				/*
				Scanner sc = new Scanner(System.in);
				System.out.print("짝수를 입력 : ");
				int num = sc.nextInt();
				
				if(num < 0 || num % 2 == 1) {
					System.out.println("잘못입력했습니다");
				} else {
					System.out.println("짝수 : " + num);
				}
			
				*/
		
		
			}
		

		
		
		
		
		
		
	}
	
	


