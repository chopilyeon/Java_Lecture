package kr.ac.kopo.day07;

public class Member02 {

	String name;
	int    age;
	String bloodType;
	
	
	//이 알 수 없음들을 고친다는 것이 매우 복잡함 ->상속자가 상속자를 물고 늘어지게끔 
	
	Member02() {
		this("알수없음", -1, "알수없음");
	}
	
	Member02(String name) {
		this(name, -1, "알수없음");
	}
	
	Member02(String name, int age) {
		this(name, age, "알수없음");
		System.out.println(name);
	}
	
	Member02(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름 : " + name 
				+ ", 나이 : " + age
				+ ", 혈액형 : " + bloodType);
	}
	
}
/*

//밑에 과정은 매우 귀찮은 과정임. 
public class Member {

	String name;
	int    age;
	String bloodType;
	
	
	
	
	밑에 알 수 없음들을 다 고친다는 것이 매우 번거로운 작업임. 
	
	
	
	//상속자가 상속자를 물고 늘어지게끔 코드를 작성가능
	Member(){
		this("알수없음");
	}
	
	
	
	Member(String name){
		this(name,-1);
	}
	
	
	
	
	
	Member(String name,int age){
		this(name,age,"알수없음");
	}
	

	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	
	
	
	
	원래 상속자 개념을 모르면 밑에처럼 쳐야함 위에는 상속자가 상속자를 물고 물고 늘어지게끔 작성한 것임. 
	
	
	
	
	
	Member() {
		name = "알수없음";
		age = -1;
		bloodType = "알수없음";
	}
	
	Member(String name) {
		this.name = name;
		this.age = -1;
		this.bloodType = "알수없음";
	}
	
	Member(String name, int age) {
		this.name = name;
		this.age = age;
		this.bloodType = "알수없음";
	}
	
	Member(String name, int age, String bloodType) {
		this.name = name;
		this.age = age;
		this.bloodType = bloodType;
	}
	
	void info() {
		System.out.println("이름 : " + name 
				+ ", 나이 : " + age
				+ ", 혈액형 : " + bloodType);
	}
	
}
*/
