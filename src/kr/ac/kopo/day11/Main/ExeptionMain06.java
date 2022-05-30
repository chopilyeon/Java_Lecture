package kr.ac.kopo.day11;

import java.io.FileReader;

public class ExceptionMain06 {

	public static void main(String[] args) {
		
		System.out.println("main start...");
		
		for (int i = 0; i < 5; i++) {
			try {
				System.out.println("loop...");
				if (i == 3) {
					FileReader fr = new FileReader("a.txt"); // checked Exception
				}
			} catch (Exception fnfe) {
				fnfe.printStackTrace();
				//break; 이러면 그냥 for문 빠져나가야 정상임 그래도 finally 라서  end  loop 찍음 
				retrn;// 하면은 main end는 찍히면 안됨 -> 그런데도 finally 붙으면 end loop는 출력시킴!  
			} finally { // 이러면 finally 무조건 실행함. 어떤 자원을 관리할때 사용하거나 함. -> 예외없이 무조건 출력을 시켜야함 어떤 한사람에게만 쓰고 읽을 수 있는 권한을 줌. 동시에 주면 에러남 . 반드시 이렇게 실행이 되어야 함. 
				System.out.println("end loop...");
			}
		}
		System.out.println("main end...");
		
	}
}

