package kr.ac.kopo.day07;

public class ConstructorMain03 {

	//멤버 변수 초기화에 대해 알아보자 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Member m= new Member(); 
		
		//우리는 Member의 변수를 만들기 위함임 .
		
		
		System.out.println("이름:"+m.name); //이런식으로 찍었었음 
		
		
		//method를 이용해서 한번 불러보자. 
		
		m.info(); // 이러면 null 과 0이 나오게 됨 -> default로 생성해버리기 때문임. 
		
		//우리는 혈액형 나이를 알수 없음으로 쓰고 싶은 것임. 
		
		Member에 들어가서 
		
		/*Member(){	
			name="알수없음";
			age=-1;
			bloodType="알수없음";
			
		}
		*/
		
		
		/*m.name="홍길동" 이런게 좋은 것이 아님.
		 *Member m2=new Member("홍길동"); 이런식으로 써주도록 하자. -> 난 이름이 홍길동인 instance 객체를 만들거야! 
		 *Member 가서 하나 만들자 
		 *
		 *
		 *이번엔 이름이 홍길동이고 22세인 인스턴스 객체를 만들어보자 Member로 이동 
		 *
		 *Member m3=new Member("홍길동",22);
		 *Member m4=new Member("홍길동",22,"A");
		 *
		 *
		 *
		 *
		 *
		 *	
		 *m.info();
		 *m2.info();
		 *m3.info();
		 *m4.info();  
		 *  
		 *  
		 *  
		 */
		
		
		
		
		
		
		

	}

}
