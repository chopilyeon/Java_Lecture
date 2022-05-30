package kr.ac.kopo.day07;

class Car{

	
 /* 생성자의 특징
  * 1. 클래스의 명과 동일 
  * 2. 반환형이 없다.
  * 3. 디폴트 생성자 지원: 클래스 내에 생성자가 존재하지 않는 경우 JVM이 자동으로 생성함. 
  * 4. 생성자도 오버로딩을 지원함
  * 5.목적은 멤버변수 값을 초기화 하는 것이 목적임
  * 
  *   	
 
  *
  *다음과 같이 생성자를 생성할 수 있음. 
  */
	

	Car(){
		
		System.out.prointln("car() 생성자 호출 ...");
	

	}
	Car(int i){
		System.out.println("Car(int) 생성자 호출...");
	}

	Car(int i, String s){
		System.out.println("Car(int, String) 생성자 호출");
	}



public class ConstructorMain01 {

	public static void main(String[] args) {
		
		Car c= new Car(); /// 생성자를 호출하는 행위임. 에러 안남 -> jvm 이 생성자를 자동으로 생성해줌 // class 내에 생성자가 하나도 정의되어 있지 않으면 자동으로 해줌   
		/* 만약 class 내에 Car(int a) 이런식으로 정의해 버리면 저 코드는 에러가 나게 됨 
		
		*/
		
		Car c2=new Car(10);  이러면 호출 될 것임 메소드랑 비슷함. 
		
		Car c3=new Car(10,"aaa"); 
		
	}

}
