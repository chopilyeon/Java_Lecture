package kr.ac.kopo.day08.extend;

public class Manager {
	
	String name;
	int salary;
	String grade;
	Employee[] empList; // 관리사원목록 저장
	
	
	Manager(String name,int salary,String grade,Employee[] empList){
		this.name=name;
		this.salary=salary;
		this.grade=grade;
		this.empList=empList;
	}
	
	
	void info() {
		System.out.println("사원명:"+name+",연봉"+salary+"만원,직급:"+grade);
			
	// 생각해보면 사원의 변수는 전부 manager도 갖고 있음 -> 변수를 다 가지고 있으므로 상속 받을 수 있음.  
	// 상속관계로 만들어보자.	
		
	System.out.println("---------------------------------");
	System.out.println("---------------------------------");
	System.out.println("\t관리사원 목록");
	System.out.println("---------------------------------");
	
	for(Employee e:empList) {
		e.info();
	}
	System.out.println("--------------------------------");
	

	
	
	}
}
