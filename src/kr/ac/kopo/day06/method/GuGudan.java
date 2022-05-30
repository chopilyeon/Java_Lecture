package kr.ac.kopo.day06.method;

import java.util.Scanner;

public class GuGudan {
	//입력받은 값을 main에 보내주자. 
	
	int getDan(){
		Scanner sc =new Scanner(System.in);
		int dan= sc.nextInt();
		return dan;
		
	}
	
	
	
	
	/**
	 * 파라미터로 날라온 정수의 해당 구구단을 출력
	 *@param dan 출력단  
	 * 
	 */
	
	
	
	
	

	
	void print(int dan) {
		
		System.out.println("***"+dan+"단***");
		for(int i=1;i<=9;i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
	}

	void print() {
		
		for(int dan=2;dan<=9;dan++) {
			System.out.println("***"+dan+"단***");
			for(int i=1;i<=9;i++) {
				System.out.printf("%d*%d=%d\n",dan,i,dan*i);
			}
		}
	}
	
	/*
	 * 
	 * 2-9단 사이의 구구단 출력
	 */
	
	
	
	
	//이렇게도 할 수 있지 않을까? 
	void print() {
		
		for(int dan=2;dan<=9;dan++) {
			System.out.print(dan); // print 위에 있으므로 그냥 갖다가 씀. 
			
		} //  이 코드를 print(2,9); 라고 쓸 수도 있는 것임. start와 end 받게끔 정의되어 있음. 
		
		
		/**
		 * 파라미터로 날라온 시작단~종료단 사이의 구구단 출력 
		 * @param start 시작
		 * @param end 종료단
		 * 
		 * 
		 */
		
		
	void print(int start,int end) {
		
		for(int dan=start;dan<=end;dan++) {
			Sysem.out.print(dan);
		}
		
		
		
		int a= 10;
		
		for(int b=1;b<=10;b++) {
			a=a+20;
		}
		
		
		
	}
}