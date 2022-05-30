package kr.ac.kopo.day03;

import java.util.Scanner;



public class NewAssignment {

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
	  int hour = a/3600;
	  int minute = (a-hour*3600)/60;
	  int second = a-hour*3600-minute*60;
		if (a / 3600 > 0) {
			System.out.printf("%d시간" + ' ' + "%d분" + ' ' + "%d초", hour, minute, second);
		} else {
			if (a/60 > 0) {
				System.out.printf("%d분" + ' ' + "%d초", minute , second);
			
			}else {
				System.out.printf("%d초", second);
				
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
		sc.nextLine();
		final double f = 10925.00;
		System.out.printf("원화는 %f입니다.",e*f);
		
		
		//6
		System.out.println("\n");
		
		
		
		
		
		
		
		//7
		
		String inputStr=sc.nextLine();
		char w = inputStr.charAt(0);
		System.out.println("알파벳을 입력하세요");
		if(w>=97) {
			System.out.println((char)(w-32));
		}else{
			System.out.println((char)(w+32));
		}
		
		
		
		
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
		if(book<0) {
			System.out.println("잘못 입력했습니다");
		}else {
			if(book==0) {
				System.out.println("보유하고 있는 책 없음");
			}else {
				System.out.printf("보유하고 있는 책권수:%d",book);
			}
		
		}
		
		//10
		
	    int first = sc.nextInt(); 
	    int seconds = sc.nextInt(); 
		int third = sc.nextInt();
		
		int one = (first>seconds)?(first>third?first:third):(seconds>third?seconds:third);
		int two = (first>seconds)?(seconds>third?second:third):(first>third?first:third);
		int three=(first>seconds)?(seconds>third?third:seconds):(first>third?third:first);

	System.out.print(one);    	
	System.out.print(two);
	System.out.print(three);
	   
	
	
	
	//11
	
	int tiger = sc.nextInt(); 
    int rabbit = sc.nextInt(); 
	int bear = sc.nextInt();
	int deer = sc.nextInt();
	
	int most = (tiger>rabbit)?(tiger>bear?tiger:bear):(rabbit>bear?rabbit:bear);
	int realmost=most>deer?most:deer;
	System.out.println(realmost);
	// 앞선 3개중에 가장 큰 것을 고르고 그다음 4번째 숫자와 비교해서 큰 것이 가장 큰 것입니다.
	
	}
	
}
	    		
	    	
	   