package kr.ac.kopo.day09.abs02.copy;

public class abstract Printer {
	
	

	private String model;
	
	public printers(String model) {
		this.model=model;
	}
	
	

	
	/*void print() {
		System.out.println("프린트중...");
	}
*/
	
	void abstract void print();  //hp가 말을 안들어서 바꿔버림. 강제성을 부여하는 상속으 의미임 클래스도 바꿔주자 abstract로 바꿔야함. 
	
	
	//
	
	
	

}
