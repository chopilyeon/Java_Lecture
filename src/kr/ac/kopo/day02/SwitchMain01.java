package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 * 
 * 1~3사이의 정수 입력:
 * 1입력시 "one"출력
 * 2입력시 "two"출력
 * 3입력시 "three"출력
 */


public class SwitchMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1-3사이의 정수 입력: ");
		int num=sc.nextInt();
		
		if(num==1) {
			System.out.println("ONE");
		}else if(num==2) {
			System.out.println("TWO");
		}else if(num==3) {
			System.out.println("THREE");
		}else{
			System.out.println("다시입력");
		}
		
		
// 1인경우 2인경우는 중첩되는 구간이 없음. 		
// 이러면 else는 3이 아닌경우에만 에러가 됨 -> 그러려면은? 독립적인 if를 쓸수도 있겠지만 else라고하는 것들 때문에 다중 if 를 써줘여 하는거임
// 그리고 위에 처럼 코드를 작성하면 계속 물어봐야됨 if문이 계속 물어봄 1인지 2인지 3인지 자꾸 물어봄 
		/*
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in)
					System.out.println("1-3사이의 정수 입력: ");
			int num=sc.nextInt();
			
			if(num==1) {
				System.out.println("ONE");
			}else if(num==2) {
				System.out.println("TWO");
			}else if(num==3) {
				System.out.println("THREE");
			}else{
				System.out.println("ERROR");
			}
		}
		*/
		
		//그래서 그게 얼만데? 
		switch(num) {
		case 1:
			System.out.println("ONE");
		case 2:
			System.out.println("TWO");
		case 3:
			System.out.println("THREE");
		default : 
			System.out.println("ERROR");
//  이것이 else같은 역할이 됨. 
		}
		
//block scope가 필요할거 같지만 case문에서는 block scope가 의미가 없음. 
//switch 와 if의 차이는? if 는 5가지의 갈래길중에 하나만 선택하는 것임. n개중에서 1개를 선택하겠다 이런 의미 
//switch 의 경우는 5개중에 2개만 3개만 이렇게 선택할 수도 있음. 
//n개중에서 m개를 선택하게도 할 수 있는 것임 
//다중 선택문이라고 표현을 함.
//책의 postit 같은것이 case 라고 생각할 수 있음. 책을 읽기 시작을 했으면 무조건 마지막까지 돌아야 하는 이치와 같음. 2-3-ERROR를 찍을수도 3-ERROR를 찍을수도 1-2-3-ERROR를 찍을수도 있음. 
//break 키워드를 사용할 수도 있음-> (for while do while switch) 반복분, if 문에서는 break사용할 수 없음. 
//break 하면 마지막 문장으로 돌아버림 		
		
/*		
		switch(num) {
		case 1:
			System.out.println("ONE");
			break;
		case 2:
			System.out.println("TWO");
			break;
		case 3:
			System.out.println("THREE");
			break;
		default : 
			System.out.println("ERROR");
			
			//defalut 는 아무리 위에 있다고 하더라도 다 수행하고 맨 마지막에 실행을 함. 
			//switch 의 수식에 원래는 정수와 char만 가능했지만
			//버전에 따라 달라짐 
			//1.5-enum 타입
			//1.7-String 타입 
			//deflaut는 else같은 녀석임.  
*/
	}
}