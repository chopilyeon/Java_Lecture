package kr.ac.kopo.day09;

public class CastMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child01 c= new parent(); // 이러면 컴파일시 오류가 발생하게 됨. 
		
		
		//자식의 공간이 크게 느껴지므로 실패함. 
		
		
		Child01 c =(Child01)new Parent(); //실제 메모리에는 child01 공간이 발생하지 않으므로 에러가 발생함. 
		
		//명시적 형변환은 =을 기준으로 
		
		
		//이렇게 놔야지만 에러가 발생을 안함. 
	
		
		///Child01 c2=new Child01(); 과 다를 건 없음. 반환값에서 사용하려는 거임 CastMain02로 가자 
		
		parent p=new Child01();
		Child01 c2 = (Child01)p;
		
		c2.sleep();
		c2.study();

	}

}
