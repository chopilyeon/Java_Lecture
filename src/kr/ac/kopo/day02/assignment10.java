package kr.ac.kopo.day02;

import java.util.Scanner;

public class assignment10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("정수 3개를 입력하세요");
		  int first = sc.nextInt(); 
			 int second = sc.nextInt(); 
			 int third = sc.nextInt(); 
		    if(first>second) {
		    	if(first>third) {
		    		System.out.println("max:"+first);
		    	} else{
		    		System.out.println("max:"+third);
		    	}
		    } else{
		    	if(second>third){
		    		System.out.println("max:"+second);
		    	} else{
		    		System.out.println("max:"+third);
		    	}
		    }

}

	}
	