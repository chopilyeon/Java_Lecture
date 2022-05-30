package kr.ac.kopo.day09.abs02.copy;

import java.util.Scanner;

import kr.ac.kopo.day09.abs02.Printer;


//메인에 만들기 싫음. 이런식으로 기능들을 한번에 다 구현해버리고 싶음. 

public class Menu {
	
	
	
	//private Scanner sc	= new Scanner(System.in);// 이렇게 써도 됨. 이유?
	private Scanner sc; // 이렇게 써도 됨. 
	
	
	
	
	
	public Menu() {
		this.sc = new Scanner(System.in); //?
	}
	
	
	public String select() {
		Scanner sc= new Scanner(System.in);
		System.out.print("프린터를 선택하세요(1.LG 2.SAMSUNG) 3.HP=>");
		String type=sc.nextLine();
		return type;
	}

	public void process() {
		
		String type=select();
		print(type);
	}
	
	private public void print(String type) {// private 를 쓰면은 class 내부적으로만 이 메소드를 사용할 수 있음 documentation 만들때 메소드는 public 형태만 보여주게 됨.
		//private는 보여주지 않음. 자식들도 접근을 못함 menu.print()도 불가능해짐. 
		Printer p= null;
		switch(type) {
		case "1":
			//LGPrinter lg= new LGPrinter();
			p=new LGPrinter();
			p.Print();
			//Printer lg= new LGPrinter(); 부모를 참조변수를 쓸수도 있음. // 부모의 참조변수가 abstract랑 상관없이 주소값을 가르칠 수 있음. 
			// lg.lgPrint(); 이거 안씀. 
			//lg.Print();
			break;
		case "2":
			//SamsungPrinter sam=new SamsungPrinter();
			p=new LGPrinter();
			p.Print();
			
			//sam.print(); 
			
			// 이거 쓰지말자sam.samPrint();
			break;
		case "3":
			//HPPrinter hp= new HPPrinter();
			p=new LGPrinter();
			p.Print();
			
			//hp.hpPrint();
			//hp.print(); 오버라이드 안하면 끝임. 안나옴 이렇게 하면 그냥 부모 클래스에 있는 print 메소드를 뱉어버림. 추상클래스로 강제성을 부여하겠다는 것임.  
			//추상클래스로 강제성을 부여해야함. 그럼 사용자들은 print라는 메소드라는 이름을 동일하게 사용할 수 있음
			//hpPrint() 같은 반항적인 놈들을 제거해버릴 수 있음. 
			
			
			//이것이 묵시적 형변환이라고 하는 것임. 
		
			break;
		}
		if(p!=null) {
		p.Print();
		}
	}
	
	//UI 클래스라고 함 -> 화면 view  클래스 뭐 여러가지로 불림 //view, UI 이런거 붙으면 사용자와 출력간에을 위한 기능 클래스구나.
	//메인에 이제 모든 걸 만들고 싶지 않아서 이렇게 만들었음. 
	
	
	
}
