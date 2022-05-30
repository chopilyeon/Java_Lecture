package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class IcecreamMain {

	public static void main(String[] args) {
		Icecream cr=new Icecream();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("아이스크림 몇개 구입하시겠습니까?=>");
		int num=sc.nextInt();
		
		Icecream[] iceArr=new Icecream[count]; //단지 참조 변수 배열만 만들었을 뿐임. 이것은 아이스크림 객체가 만들어진 것이 아님. 
		
		for(int i=0;i<=num;i++) {
			System.out.println("*****"+(i+1)+"번째 아이스크림 구매정보 입력"+"*****");
			System.out.print("아이스크림명:");
			iceArr[i].name=sc.nextLine();     //Null이기 때문에 iceArr[i]=new Icecream(); 이렇게 하면 객체가 생성이 됨
			System.out.print("아이스크림 가격:");
			iceArr[i].price=sc.nextInt();
			
			
			/*icecream ice01 
			*
			*icecream ice02 - 그냥 참조변수를 저장할수 있는 것을 배열로 만든 것임.  
			*ice01=new Icecream();
			*
			*이렇게 해야 실제로 아이스크림 객체가 만들어진 것임. 
			*
			*iceArr[i]=new Icecream(); 이렇게 하면 객체가 생성이 됨 
			* 
			* System.out.print
			* 
			*/
			
			
			
			
			
		}
		
		
		
		
	}

}
