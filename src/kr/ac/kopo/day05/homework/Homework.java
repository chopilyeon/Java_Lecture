package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("아이스크림 몇개 구입할거야?");
		
		int num=sc.nextInt();
		
		sc.nextLine();
		
		
		int [] arr;
		
		
		String [] str;
		arr = new int [num];
		str = new String[num];
		for(int i=0;i<num;i++) {
			System.out.println((i+1)+"번째 아이스크림 가격을 입력하세요.");
			arr[i]=sc.nextInt();
			sc.nextLine();
			System.out.println((i+1)+"번째 아이스크림 구매정보를 입력하세요 ");
			str[i]=sc.nextLine();
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			System.out.println(str[i]);
		}
		
		System.out.println("<총 3개의 아이스크림 구매정보 출력>");
		
		System.out.println("번호 아이스크림명 가격");
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf("%d    %s    %d",(i+1),str[i],arr[i]);
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
	}

}
