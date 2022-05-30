package kr.ac.kopo.day11.Main;

import java.util.Random;

public class ExceptionMain04 {

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
		
			exception e = new ArithmeticException // 내부적으로는 오류가 발생하면 이런 new 객체가 형성이 되었던 것. 
					//원래는 ArithmeticExcepiton과 StringIndexOutOfBoundsException의 자리임
					//exception 을 상속받고 있으므로 이게 처리할 수 있음
					//exception 얘가 상속하는 thorws는  printStackTrace 이런 함수를 갖고 있음 
					// 쓸 수 있음 
				
					
		} catch(ArithmeticException |StringIndexOutOfBoundsException ae) {
			System.out.println("예외발생:"+ae.getMessage());//(ae 가 오류났다는 그런 정보를 갖고 있음);
			ae.printStackTrace();//  이러면 어디서 오류가 났는지 추적가능 어느줄에서 에러가 났는지 추적 가능.  
		}	
			/*} catch(StringIndexOutOfBoundsException se) {
			System.out.println("StringIndexOutOfBoundsException:"+se.getMessage()) // 멀티 catch문이 너무 귀찮다. 
		}
		*/
		
		// 근데 어떤 에러가 발생할지 모를 수도 있음-> 겁나게 발생할 수도 있음. 모든 예외들은 Exception class 를 상속 받음 -> 묵시적형변환으로 사용할 수 있음. 
		
		System.out.println("main end..."); //이 문장은 무조건 출력이 되는데 finally를 왜 쓸까? 
		

	}

}
