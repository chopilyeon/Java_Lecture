package kr.ac.kopo.day09.abs02.copy;

public class LGPrinter extends Printer {
	
	
	public LGPrinter() {
		
		
	}
	
	public LGPrinter(String model) {
		super(model);
	}
	
	@override
	public void print() {// 이건 그냥 부모꺼 print  한거임 
	
		System.out.println("LG 프린터에서 출력중...")
	}
	
	
	
	
}
