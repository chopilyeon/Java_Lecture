package kr.ac.kopo.day06.method;



class 고양이{
		
	void 잠을잔다() {
		System.out.println("고양이가 잠을 잡니다");
	
	}
	void 냐옹거린다() {
		System.out.println("고양이가 냐옹합니다");
		
	}
	
	
//char[] x 배열을 쓰라는 것임. 
	
class Method{
	
	
	//메소드 오버로딩 - 같은 클래스내에서 메소드명이 같으면서 매개변수의 개수나 타입이 서로 다른것

	void call() {
		System.out.println("call()  메소드호출...");
	}
	void call(int i) {
		System.out.println("call(int) 메소드 호출..."); // 인자를 다르게 썼더니 지금 메소드 명이 달라도 다르게 인식함 // 아까는 Duplicate 라고 오류 났었음 
	}
	void call(double i) {
		System.out.println("call(double) 메소드 호출...");
	}
	void call(String str,int n){
		System.out.println("call(String,int) 메소드 호출..."); //순서도 맞춰서 써야함. 
	}
	
	} 


public class MethodMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		고양이 나비= new 고양이(); 
		나비.냐옹거린다();
		
		Method m = new Method();
		m.call();
		m.call(10); //자바에서는 변수와 그 메소드명으로 메소드를 구분하게 된다. 
		m.call(10.3);
		//m.call(true); // 이건 에러남 이런걸 받는 것은 위에 없으므로. 
		m.call("hello",5); 
		
		
		
		
		//지금한 행위는 이런 것임 
		/*
		void aaa() {
		}
		void bbb() {
		}
		
		*/
	
	

		
// 앞에서와 다른점은 앞은 한 클래스내에 전부다 있었음 . 

//이번엔 고양이라는 클래스를 아예 따로 만들어놨음. 

//그래서 함수 호출하려면 나비.냐옹거린다 라고 써야함 
		
		
		
		
	}

}
