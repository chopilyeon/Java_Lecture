package kr.ac.kopo.day08.extend;

public class Employee {

	String name; // public String name; 쓰면은 누구나 다 접근할 수 있다는 소리 -> 보안에 취약하게 됨. private 라고 쓰면 Employee 에서만 저걸 고칠 수 있음. 
	//부모가 갖고 있는 비밀번호는 안알려주는 것임. 상속에서는 볼 수 없는 것임. -> manager 03에서 this. name이라는 것에 접근을 못함.
	int salary;
	String grade;
	
	Employee(){
	
	}
	
	
	public Employee(String name,int salary,String grade) {
		this.name=name;
		this.salary=salary;
		this.grade=grade;
	}
	
	void info() {
		System.out.println("사원명:"+name+",연봉:"+salary+"만원,직급:"+grade); // 근데 회사에는 사원들만 있느건 아니고 관리자도 있음 
	}
	
	
}
