package kr.ac.kopo.day07;

public class Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//멤버변수 
		String name;
		int age;
		String bloodType; // AB 형 때문에 string 으로 잡음. 
		void sumnum(int a, int b) {
			System.out.print(a+b);
			
			
		}
		
		
		//회원의 정보를 출력하는 method를 한번 만들어보자 
		void info() {
			
			System.out.println("이름:"+name+",나이:"+age+",혈액형:"+bloodType); // 멤버변수 아니므로 그냥 저렇게 써도 됨. m.age/m.name
			
			///이런식으로 method를 생성할 수 있음 
			
			
			//기본 생성자가 호출될때 알수없음을 호출하고 싶은 것임 
		Member(){	
			name="알수없음";
			age=-1;
			bloodType="알수없음";
		}
			
		/*이렇게 홍길동 이라는 인스턴스 객체를 생성자를 이용해 만들수 있다 
		
		
		*Member m2=new Member("홍길동");
		*/
		
		Member(String n){
			name=n;
		}
		
		
		
		Member(String n,int a){
			name=n;
			age=a;
			bloodType="알수 없음";
		}
		
		
		Member(String n,int a,String bt){
			name=n;
			age=a;
			bloodType=bt;
		}
		
			
		//이거 거슬림 나는 이름 age bloodtype을 초기화하는 것이 목적이야 라고 쓰고 싶음. 
		
		// 이래야 보기가 좋음. 
		//Member라는 생성자 안에 지역변수인 name도 있고 멤버변수인 name도 있을 수 있음 -> 멤버변수인 name에 지역변수인 name을 넣고 싶은 것임.
		
		//지역변수가 우선순위가 높음 나랑 가장 가까운 것이기 때문임 --- 지역변수는 갈색으로 멤버변수는 파랑으로 보여줌 
		
		//생명주기가 메소드나 생성자에 한정되어 있는 애들- > 지역변수 
		
		//멤버변수를 
		Member(String name,int age,String bloodtype){
			this.name=name; //this 는 instance 객체를 의미함 메소드내에서 지역변수와 멤버변수를 구분해서 사용할 때 
			this.age=age; // this.멤버변수 -> 
			this.bloodType=bloodtype;
		}
		
		Member(){	
			name="알수없음";
			age=-1;
			bloodType="알수없음";
			
		}
		
		Member(String name){
			this.name=name;
			this.age="알수없음";
			this.bloodType="알수없음";
		}
		
		Member(String name){
			this.name=name;
			this.age="알수없음";
			this.bloodType="알수없음";
		}
		
		//name만 치면 가장 가까운 name을 가르치게됨
		
		
		//귀찮다

		
		Member(String name,int age){
			Member(name,age,"알수없음"); ->Member 대신 this를 쳐버림. //오버로딩 된 상태에서 사용함.  
		} // 이렇게 되면 내가 일일이 코드를 위처럼 다 칠일이 없음. 
		//근데 에러남 -> 이러면 메소드라고 인식하기 때문임. 
		
		
		
		// 이렇게 인식해버림 일반메소드의 호출로 인식해버림. 
		void Member(String name,int age, String n) {
			
			
		}
		
		//일반 메소드 내에선 this 사용 불가 // 생성자 내에 생성자를 생성한다고 보면 됨.  
		Member(String name,int age){
			Member(name,age,"알수없음"); // 오버로딩 된 다른 것들을 불러옴 맨 위쪽에 있어야함 System.out.print(name)  뭐 이런거 쓰면 안됨
			
		}
		
		
		
		
		
		
	
		
		
		
		
		
		
		//shift alt A 누르면 다중선택이 가능함 
		
		// 이런 경우엔 this 를 생략해도 됨 쓸것이 없기 때문임. 
		
		
		
		//문제는 알수없음이 아니라 모름으로 고치고 싶다면 위에 this(name,age,"알수없음") 썼던 거를 전부 "모름" 으로 고쳐야 함. 
		
		
		
		
		//이런순으로 설계함.
		//멤버변수
		
		//생성자 
		
		//메소드
		
		
		
		
		}
		
	
	
	}
	

}
