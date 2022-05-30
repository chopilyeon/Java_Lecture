package kr.ac.kopo.day04;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int a = sc.nextInt();
		if(a%2==0) {
			a=a-1;
		}
		
		
	for(int i=1;i<=a;i++) {
		if(i<=(a+1)/2) {
			for(int j=1;j<=a;j++) {
				if(j<=10-i && j>=i) {
					System.out.print("*");
				}else{
					System.out.print("-");
				}
			}
		}else{
			for(int j=1;j<=a;j++) {
				if(j<10-i||j>i) {
					System.out.print("-");
				}else{
					System.out.print("*");
				}
				
			}
		}
		System.out.println();
		
		
	}
	
		
		

	}

}
