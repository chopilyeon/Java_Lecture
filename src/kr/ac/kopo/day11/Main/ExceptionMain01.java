package kr.ac.kopo.day11.Main;

import java.util.Random;

public class ExceptionMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("main start");
		Random r= new Random();
		int num = r.nextInt(3);
		System.out.println("num:"+num);
		System.out.println(10/num);
		System.out.println("main end...");
		

	}

}
