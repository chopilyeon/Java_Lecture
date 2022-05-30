package kr.ac.kopo.day08.extend;


//관리자(Manager)는 사원(Employee)의 한 형태다. -> 상속관계로 표현하고 싶음. 

public class Manager03 extends Employee { //자식클래스는 부모 클래스의 메소드랑 멤버변수 사용이 가능함 
	
	
	// 항상 기본 생성자를 만들어주도록 하자. 
	Manager03(){
		super(); // 이거 생략되어 있음 근데 매개변수 있으면 반드시 써줘야함. 
	}
	
	
	/*String name;
	int salary;
	String grade;
	이렇게 써도 됨. 부모 클래스에 다 있으므로. 
	*/ 
	Employee[] empList; // 관리사원목록 저장
	String [] str; 
	
	Manager03(String name,int salary,String grade,Employee[] empList){
		//super(); -> 기본 생성자가 없어서 에러가 나고 있음. employee 클래스에서 기본 생성자까지 만들어줘야함.  
		//눈에 보이지 않지만 super라는 생성자를 호출함. 
		/*super.name=name; // employee가 갖고 있으므로 super로 써줌. 
		super.salary=salary;
		super.grade=grade;
		위처럼 쓰지 않고 
		*/ 
		super(name,salary,grade); // 이렇게 만들어버릴수 있음. 위에꺼 굳이 칠필요 없음. employee 가보면 employee 생성자에 저런거 있음. 
		this.empList=empList; // 자기한테 이런 멤버변수 없으면 부모꺼까지 자등으로 확인해줌. 
		//만약 자기한테 있으면 super.name 이런식으로 바꿔주어야함.  
	}
	
	@Override  // 일종의 코드 주석임. 동시에 컴파일시점에 에러까지 체크해줌. 실행시점에 하는 코드 주석. 여기나온 info 메소드는 부모클래스의 info를 overriding 한거임.
	void info() {
		//System.out.println("사원명:"+name+",연봉"+salary+"만원,직급:"+grade);
		//info(); // 만 쓰면 기본이 this.info();임 자기한테 info없으면 부모꺼 찾음. 근데 자기한테도 info 메소드가 있음 -> 계속 자기꺼 호출하고 있는 거임. 
		super.info(); // 이렇게 써서 부모의 info를 쓰고 싶다고 해야함.  //메소드 오버라이딩 발생. 
		
		
		//실제로는 employee에 정의되어 있는 변수임. 
	// 생각해보면 사원의 변수는 전부 manager도 갖고 있음 -> 변수를 다 가지고 있으므로 상속 받을 수 있음.  
	// 상속관계로 만들어보자.	
		
	System.out.println("---------------------------------");
	System.out.println("---------------------------------");
	System.out.println("\t관리사원 목록");
	System.out.println("---------------------------------");
	
	//원래는 string 아닌가? for(String e:empList) 아님?? 
	
	for(Employee e:empList) {
		e.info();
	}
	System.out.println("--------------------------------");
	

	
	
	}
}
