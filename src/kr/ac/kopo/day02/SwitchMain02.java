package kr.ac.kopo.day02;

public class SwitchMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = new String("Hello");
		switch(a) {
		case "Hello":
			System.out.println("TRUE");
		defuault:
			System.out.println("FALSE");
		}
		
		
		//System.out.println(a=="Hello"); // 이것은 heap stack 의 a는 주소값임 
		//System.out.println(a.equals("Hello"));
		//print(a)에는 two stream 이 돌고 있음. -> stack 에서 heap 으로 자료 보내는 중임. 
	}

}
//문자열 비교는 동등비교는 불가능함. equals 같은 녀석을 써야 비교가 가능함. 
//근데 switch로 한번 해보자 근데 switch는 비교가 가능해짐. 안에서 equals 가 돌아가고 있음. 
//if 를 사용하게 되면은 if(str.equals("Hello")){이런식으로 써야함. 더 복잡해짐. 
//4가지의 키워드가 어떻게 배치되느냐에 따라 for while do-while 알아보자.  