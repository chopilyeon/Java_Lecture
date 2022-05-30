package kr.ac.kopo.day09.abs01;

import java.util.Scanner;


//메인에 만들기 싫음. 이런식으로 기능들을 한번에 다 구현해버리고 싶음. 

public class Menu {
	
	
	
	private Scanner sc	= new Scanner(System.in);// 이렇게 써도 됨. 이유?
	private Scanner sc // 이렇게 써도 됨. 
	
	
	
	
	
	public Menu() {
		this.sc = new Scanner(System.in); //?
	}
	
	
	public String select() {
		Scanner sc= new Scanner(System.in);
		System.out.print("프린터를 선택하세요(1.LG 2.SAMSUNG)=>");
		String type=sc.nextLine();
		return type;
	}

	public void process() {
		
		String type=select();
		print(type);
	}
	
	public void print(String type) {
		switch(type) {
		case "1":
			LGPrinter lg= new LGPrinter();
			lg.lgPrint();
			break;
		case "2":
			SamsungPrinter sam=new SamsungPrinter();
			sam.samPrint();
			break;
		}
		
	}
	
	//UI 클래스라고 함 -> 화면 view  클래스 뭐 여러가지로 불림 //view, UI 이런거 붙으면 사용자와 출력간에을 위한 기능 클래스구나.
	//메인에 이제 모든 걸 만들고 싶지 않아서 이렇게 만들었음. 
	
	
	
}
