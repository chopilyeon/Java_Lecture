package kr.ac.kopo.day02;

import java.util.Scanner;

public class assignment07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String inputStr=sc.nextLine();
		char w = inputStr.charAt(0);
		System.out.println("알파벳을 입력하세요");
		if(w>=97) {
			System.out.println((char)(w-32));
		}else{
			System.out.println((char)(w+32));
		}

	}

}
