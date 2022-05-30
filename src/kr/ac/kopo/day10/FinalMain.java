package kr.ac.kopo.day10;

//class 와 method에 final을 한번씩 써보자. 


class Super{
	private final double PI=3.14;
	
	super(){
		//PI=3.141592; 이러면 에러남. final 로 지정해놓았기 때문임.  
	
	
	
	}
	
	final void call() {
		System.out.println("SUPER::call()");
	}
	
	
	
}


class Sub extends Super{
	void call() {
		System.out.pintln("SUB::call()");	
		
		
	}
}
//Random class를 상속받아서 이용해보자. 
class MyRandom extends Random{
	@OVerride
	public int nextInt(int bound) {
		return super.nextINt(bound)+1;
	}
	//이건 오버라이드 아님. 오버로딩 한거임 
	//오버라이드는 완전히 일치해야하는 것임. 
 	public int nextInt(int strat, int end) {
		return super.nextInt(end-start)+start; 
	}
	
	
	
class MyString extends String { // 이건 안됨 String class 는 final이라 못받아옴. 	
	
}






public class FinalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//나만의 random method를 생성했음 -> 이제 자기만의 함수를 만들 수 있는 것임. 
		 
		//묵시적형변환을 이용해보자. 
		
		MyRandm r= new MyRandom();
		int random = r.nextInt(2);
		System.out.println(random);
		
		
		
		
		Random r= new Random();
		//int random=r.nextInt(90)+10; // 이러면 10부터 90까지의 숫자를 계산 가능함. 
		int random=r.nextInt(10)+1; // 이렇게 +1 +1 쓰는것이 귀찮음. 나만의 random class를 만들고 싶음. 

		
		
		
		
		
	}

}
