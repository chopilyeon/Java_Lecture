package kr.ac.kopo.day8;

public class Employee {
	
	//멤버변수 설정하면 초기값은 알아서 정해지게 됨 
	String name;
	int salary;
	String grade;
	static int employeeCnt; // 사원수를 세주고 싶다. static 이 붙어있으면 이텔릭체로 기울여줌. 
	
	// 기본 생성자를 만들어주는 것이 좋음- > 나중에 오류를 줄여줄수 있기 때문임. 원래는 default로 그냥 생성자 생성해줌. 그래도 그냥 써주자.
	Employee(){
		employeeCnt++;
		
	}
	
	
	Employee(String name, int salary,String grade){
		
		this.name=name;
		this.salary=salary;
		this.grade=grade;
		employeeCnt++;// 이런경우에 static을 붙이고 싶은 것임. 공통으로 쓰고 싶은 것
		//Employee.employeeCnt++// 이런식으로 클래스변수는 클래스를 앞에 붙이도록 하자. 가독성을 위해서  
		
	}
	
	void info() {
		System.out.println("사원명:"+name+",연봉:"+salary+"만원,직급:"+grade);
	}
	
	
	void employeeCntInfo() { // non static 임  
		System.out.println("총 사원수:"+employeeCnt+"명"); // method가 non static임 -> static을 불러 들일 수 있음. 
		System.out.println("총 사원수:"+Employee.employeeCnt+"명"); // 클래스 변수명은 앞에 클래스. 써주자 
	}
	
	// instance 객체를 만들지 않아도 저런 메소드를 생성하고 싶은 것임 그렇기 때문에 static으로 만들어보자
	static void employeeCntInfo() {  
		System.out.println("총 사원수:"+employeeCnt+"명");  
		System.out.println("총 사원수:"+Employee.employeeCnt+"명"); // 클래스명을 붙여주자.   
	
	
	}
	
	
	
	
	
	
}
