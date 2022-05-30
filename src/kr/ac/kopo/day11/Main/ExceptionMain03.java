package kr.ac.kopo.day11.Main;

import java.util.Random;

public class ExceptionMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//예외는 예기치 못한 상황. 
		try{
			System.out.println("main start");
			Random r= new Random();
			int num = r.nextInt(3);
			System.out.println("num:"+num);
			System.out.println(10/num);
			
			
			String str="hello";
			System.out.println("str:"+str);
			System.out.println(str.charAt(10));
		
			
		} catch(ArithmeticException ae) {
			System.out.println("예외발생:"+ae.getMessage());//(ae 가 오류났다는 그런 정보를 갖고 있음);
			ae.printStackTrace();//  이러면 어디서 오류가 났는지 추적가능 어느줄에서 에러가 났는지 추적 가능.  
		} catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException:"+se.getMessage())
		}
		System.out.println("main end...");
		

	}

}
