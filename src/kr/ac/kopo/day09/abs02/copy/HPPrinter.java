package kr.ac.kopo.day09.abs02.copy;

public class HPPrinter extends Printer{
	
	
	
	//자기만의 고유한 프린트를 쓰고 싶음 
	//hp가 앙탈을 부림. 
	//추상메소드가 되기 전까지는 그냥 만들던 안만들던 상관 없었음. 
	
	pulbic void hpPrint() {
		System.out.println("HP프린터에서 출력중..."); 
	}
	//오버라이드가 반드시 필요함. 추상메소드를 안받아버렸으므로 강제성을 부여함 

	
	@Override
	public void print() {
		System.out.println("HP프린터에서 출력합니다...")//printer라는 메소드를 무조건 만들어라 
	}
	
	
}
