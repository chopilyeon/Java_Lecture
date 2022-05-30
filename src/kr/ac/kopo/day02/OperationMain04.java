package kr.ac.kopo.day02;

import java.util.Scanner;

// 원래 이렇게 써야함 import java.util.Scanner;


/*
 * a 입력 :10
 * b 입력 :3
 * 
 * 10이 3의 배수인가? FALSE 이런 결과를 얻고 싶음. 
 * 
 * a 입력 :10
 * b 입력 :5
 * 
 * 10이 5의 배수인가? true 
 */
public class OperationMain04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // scanner 오류나면 밑에다가 숫자 갖다대고 알아서 작성하게 할 수도 있음. ctrl+shift+o 누르면 자동 import 됨. 
		
		System.out.println("a 입력:");
			int a = sc.nextInt();
		
		System.out.println("b입력:");
			int b=sc.nextInt();
		
		//	boolean result =(a % b==0); b가 0이면 오류나므로 밑의 코드로 해결할 수 있음. 
		boolean result =(b !=0 && a % b==0); //굳이 if문을 사용할 필요가 없다. 
		
		System.out.printf("%d가 %d의 배수인가? %b\n",a,b,result);
	}

}

