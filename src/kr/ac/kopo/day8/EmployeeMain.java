package kr.ac.kopo.day8;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int totalEmployee=0; 
		//우리 회사에 입사한 사원수를 알고 싶어졌음.
		
		//static은 프로그래밍 실행되자마자 공간이 만들어짐. 
		//클래스 이름으로 접근함 
		System.out.println("총사원수:"+employee.employeeCnt+"명";)
		
		
		Employee e = new Employee("홍길동",3300,"사원");
		//totalEmployee++; // 이런식으로 사원수를 증가시킬 수 있음 //외부에 있는 것보다는 관련이 있는 것끼리 넣는것이 좋음 employee class로 가자. 
		Employee e2=new Employee("강길동",3800,"대리");
		//totalEmployee++;
		e.info();
		e2.info();
		e.employeeCntInfo();
		e2.employeeCntInfo(); // 왜 자꾸 1명만 나올까? -> 각자 다 독립적이기 때문임
		// employee에 대해서 전부 알필요 없음 -> employee class 안에 있지만 어차피 1개만 필요함 
		
		// 이런경우에 static 키워드가 필요하다는 것임. 
		
		
		
		//멤버변수가 뭐인지까지는 모름.   info 메소드를 이용해서 그냥 정보를 볼 수 있을 뿐/ 생성자를 통해서 생성할 뿐임
		//e.name=""; 이런 코드는 좋은것이 아님. 자신의 멤버변수를 알 수 있는 곳은 오로지 자신의 클래스에서만 쓰게 하자.
		
		//우리 회사에 입사한 사원수를 알고 싶어졌음. 
		//System.out.println("입사한 총 사원수:"+totalEmployee+"명");
		
		
		Employee.employeeCntInfo(); // static method 로 정의했기 때문에 가능해짐. 
		/*
		Employee e = new Employee("홍길동",3300,"사원");
		//totalEmployee++; // 이런식으로 사원수를 증가시킬 수 있음 //외부에 있는 것보다는 관련이 있는 것끼리 넣는것이 좋음 employee class로 가자. 
		Employee e2=new Employee("강길동",3800,"대리");
		
		*이 코드 없어도 위에 메소드 쓸 수 있음. 
		*/ 
	}
	

}
