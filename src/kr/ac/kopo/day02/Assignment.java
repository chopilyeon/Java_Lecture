package kr.ac.kopo.day02;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 1
		
		System.out.println("A="+(int)'A');
		System.out.println("E="+(int)'E');
		System.out.println("I="+(int)'I');
		System.out.println("O="+(int)'O');
		System.out.println("U="+(int)'U');
		
		
//2
		
	
	  Scanner sc = new Scanner(System.in);
	  
	  System.out.println("시간을 입력하세요");
	  int a = sc.nextInt();
		if (a / 3600 > 0) {
			System.out.printf("%d시간" + ' ' + "%d분" + ' ' + "%d초", a / 3600, (a - a / 3600) / 60, (a - a / 3600) % 60);
		} else {
			if ((a - a / 3600) / 60 > 0) {
				System.out.printf("%d분" + ' ' + "%d초", (a - a / 3600) / 60, (a - a / 3600) % 60);
			
			}else {
				System.out.printf("%d초", (a - a / 3600) % 60);
			}
		}
		
		//3
		System.out.println("\n");
		System.out.println("원의 반지름을 입력하시오");
		int b=sc.nextInt();
		final double pi=3.141592;
			System.out.printf("원의 면적은 %f입니다",b*b*pi);
			
		//4
			
		System.out.println("\n");
		System.out.println("정수를 입력하세요");
		System.out.println("나눌 수를 입력하세요");
		int c = sc.nextInt();
		int d = sc.nextInt();
		System.out.printf("몫:%d",c/d);
		System.out.printf("몫:%d",c%d);
		
		//5
		System.out.println("\n");
		System.out.println("달러를 입력하세요");
		int e = sc.nextInt();
		final double f = 10925.00;
		System.out.printf("원화는 %f입니다.",e*f);
		
		
		//6
		System.out.println("\n");
		
		//7
		String inputStr=sc.nextLine();
		System.out.println("알파벳을 입력하세요");
		char w = inputStr.charAt(0);
		int q=(int)w+26;
		System.out.printf("입력(알파벳)%s:",(char)w);
		System.out.printf("변경된 값:%s",(char)q);
		
		System.out.println('\n');
		
		//8
		int payment = sc.nextInt();
		int num = sc.nextInt();
		int rest = payment-num;
		int rest1=rest%1000;
		int rest2=rest1%500;
		int rest3=rest2%100;
		int rest4=rest3%50;
		System.out.println("물건값을 입력하세요");
		System.out.println("지불한 돈의 액수를 입력하세요");
		System.out.printf("거스름돈:%d",payment-rest);
		System.out.println('\n');
		System.out.printf("1000원:%d",rest/1000);
		System.out.println('\n');
		System.out.printf("500원:%d",rest1/500);
		System.out.println('\n');	
		System.out.printf("100원:%d",rest2/100);
		System.out.println('\n');
		System.out.printf("50원:%d",rest3/50);
		System.out.println('\n');
		System.out.printf("10원:%d",rest4/10);
		System.out.println('\n');
		
		//9
		
		int book = sc.nextInt();
		
		//10
		
	
	
		
		
		
	}
	
}
	
	