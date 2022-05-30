package kr.ac.kopo.day09;

public class Extend03 {
	
	class A {
		A() {
			System.out.println("A() 호출...");
		}
	}

	class B extends A {
		B() {
			super();
			System.out.println("B() 호출...");
		}
	}

	
	
	//쓰지는 않지만 실제로 오브젝트 프로젝트를 상속받고 있는 것임. //extends B 이런거 안쓰면 자동으로 java.lang.objec -> 자동으로 생성중임 
	class C extends B {
		C() {
			super(); // 이거 자동으로 생성임 그냥 B하고만 관련 // B는 또 A를 호출하는 셈임. // C입장에서는 B한테 상속받았음을 알뿐임. 상속은 단일 상속만 지원함. 
			System.out.println("C() 호출...");
		}
	}

	public class ExtendsMain02 {

		public static void main(String[] args) {
		
//			new A();
			new B();
		}
	}
	
	
	
	
	
	
	

}
