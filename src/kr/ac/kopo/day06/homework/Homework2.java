package kr.ac.kopo.day06.homework;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		package kr.ac.kopo.homework.day4;

		/*

		아이스크림 몇개 구입할꺼야? => 3 (키보드 입력)
		*** 1번째 아이스크림 구매정보 ***
		아이스크림명 : 비비빅(키보드)
		아이스크림가격 : 700(키보드)
		*** 2번째 아이스크림 구매정보 ***
		아이스크림명 : 월드콘(키보드)
		아이스크림가격 : 1500(키보드)
		*** 3번째 아이스크림 구매정보 ***
		아이스크림명 : 메로나(키보드)
		아이스크림가격 : 1000(키보드)
		< 총 3개의 아이스크림 구매정보 출력 >
		번호   아이스크림명    가격
		1     비비빅         700
		2
		3
		   총 판매액 : XXXX원 
		   
		   
		 */

		import java.util.Scanner;

		class IceCream{
			String name;
			int price;
		}

		public class Solution01 {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.print("아이스크림 몇개 구입할꺼야? => ");
				int count = sc.nextInt();
				
				IceCream[] icArr=new IceCream[count];	
				
				int sum = 0;
				sc.nextLine();
				
				for(int i = 0; i < count ; i++) {
					System.out.printf("%d번째 아이스크림 구매정보\n", i+1);
					IceCream ic = new IceCream();
					
					System.out.print("아이스크림명 : ");
					ic.name = sc.nextLine();
					
					System.out.print("아이스크림가격 : ");
					ic.price = sc.nextInt();
						
					sum += ic.price;
					sc.nextLine();
					icArr[i] = ic;
				}
				
				ic[0]=icArr[0] ic[1]=icArr[1] 
//				for(IceCream ic : icArr) {
//					System.out.println(ic.name);
//					System.out.println(ic.price);
//				}
//				
			
				System.out.printf("< 총 %d개의 아이스크림 구매정보 출력 >\n", count);
				System.out.println("번호\t아이스크림명\t가격");
				for(int i = 0; i < count; i++) {
					System.out.printf("%d\t%s\t\t%d\n",i+1, icArr[i].name, icArr[i].price );
					
				}
				System.out.println("\t총 판매액 : "+sum+"원");
			}
			
		}
		
		
		
		

	}

}
