package kr.ac.kopo.day11.Main;

import java.util.Random;

class A{
	private Object data; // 집어넣고 빼고 하고 싶음. 
	
	// 지금 어떤 데이터든 갖게 하고 싶음. 
	
	
	A(Object data){
		this.data=data;
	}
	
	Object getData() {
		return data;
	}
	
	
	void setData(Object data) {
		this.data=data; 
	}
	
	
	
	
	
	
}
//<>가 generic임.t가 Type을 의미함. 
class B<T>{
	private T data; 
	
	B(T data){
		this.data=data; 
	}

	T getData() {
		return data;
	}
	
	
	void setData(T data) {
		this.data=data; 
	}
	
}




public class GenericMain {

	public static void main(String[] args) {
		
		B<String> b=new B<String>(new String("Hello"));
		System.out.println("길이:"+b.getData().length()); // 형변환이 필요 없게 됨. 
		
		
		B<Random> b2= new B<Random>(new Random(0));
		System.out.println("추출된 정수:"+b2.getData().nextInt(10)+1);
		
		
		
		B<String> b3=new B<String>(new Icecream()); // String인데 Icecream 이냐고 물어봄 -> 컴파일때 에러가 발생하게 됨. 
		b3.setData(10); // 이래도 에러남 generic이 string이라서  
		
		//컴파일때 제어가 가능함. 
		
	
		A a= new A(new String("hello")); 
		String data=(String)a.getData(); // 
		System.out.println("길이:"+data.length());
		
		
		
		
		A a2=new A(new Random());
		//object 형으로 반환이 되지만 시렞론 Random 으로 받아야하므로 
		int random=((Random)a2.getData()).nextInt(10)+1;
		System.out.println("추출된 정수:"+random);
		//형변환이 잘못된다면? Random 인데 Scanner로 변환하면 에러남. 
		
		//object가 모든 걸 다 받을수 좋은데 형변환이 힘들어지게 됨.
		
		//이걸 해결하기 위해 만들어진 것이 generic임.
		
		
		
		
		//제네릭에 올수 있는건 참조자료형임 
		
		
		
	}

}








