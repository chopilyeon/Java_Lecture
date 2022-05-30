package kr.ac.kopo.day03;

/*
 * 
 * 
 * 
 */

public class ExamMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//규칙적인 반복을 할때 for문을 많이 사용하곤 함
		
		//for(int i=1;i<=10;i++) {
		//for(int i=10;i>=1;i--) {
		//for(int i=0;i<=9;i++) {
		for(int i=5;i>=-4;i--) {
			System.out.println("Hello");
		}
		
		// 3가지 요소가 다 들어 가야하는건 아님-> 생략도 가능함 그냥 찍어버리면 무한루프로 돌게 됨

		//while은 true
		System.out.printf("[03%d]입니다", 5);
		
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		System.out.print("*");
		/*
		 * for(int i =1;i<=5;i++){
		 * 	System.out.println("*")
		 * 	System.out.println( )
		 
		 * 별 5개씩 3번 반복하려면?
		 * for(int i=1;i<=3;i++){
		 *		System.out.print("*****\n");
		 *	}
		 *
		 * 이중 for문입니다. 
		 * for(int i=1;i<=3;i++){
		 *		for(int j=1;j<=5;j++){
		 *		System.out.print("*");
		 *		}
		 *	
		 *		System.out.println();
		 *int i 의 초기화는 1번 수행 //  int j의 초기화는 3번 수행됨 // print ("*")은 15번 수행됨. 
		 *
		 *
		 *}
		 */
		
	//12345 출력 해보자 
		
		for(int i =1; i<=5;i++) {
			//System.out.println(정수);
			//num을 이런식으로 설정할수도 있음. System.out.print(num--);
			//System.out.println(6-i);
		}
		
		
		//변수로 사용될수도 있고 횟수로 사용될수도 있음. 
	for(int i=5;i>=1;i--){
		System.out.print(i);
	}
	System.out.println( );
		
		
		
		
		
		
		
	}

	}
