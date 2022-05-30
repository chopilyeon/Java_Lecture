package kr.ac.kopo.day07;

class Car{

	
 /* 생성자의 특징
  * 1. 클래스의 명과 동일 
  * 2. 반환형이 없다.  	
 
  *
  *다음과 같이 생성자를 생성할 수 있음. 
  */
	

	void Car(){ /// void 쓰면 에러남  생성자 이름이랑 똑같다고 얘기함 default 로 생성자 만들어버리기 때문임 
		
		System.out.println("car() 생성자 호출 ...");
	

}





public class ConstructorMain01 {

	public static void main(String[] args) {
		
		Car c= new Car(); /// 생성자를 호출하는 행위임. 에러 안남 -> jvm 이 생성자를 자동으로 생성해줌 // class 내에 생성자가 하나도 정의되어 있지 않으면 자도으로 해줌   
		/* 만약 class 내에 Car(int a) 이런식으로 정의해 버리면 저 코드는 에러가 나게 됨 
		
		
		

	}

}
