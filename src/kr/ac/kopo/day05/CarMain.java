package kr.ac.kopo.day05;



//실행 클래스 Car라는 클래스를 이용해서 실행중이므로. //하나의 실행클래스와 여러개의 참조 클래스를 갖고 있는 셈임 
public class CarMain {

	
		
		//new 클래스명(); // car라는 클래스를 이용해서  인스턴스 객체를 만드는 것임
		// heap 에 저장 
		
		Car c=new Car(); //눈에 보이는 자동차를 추상화시켜서 구현한 것임 
		
		
		c.name= new String("소나타");// 원래는 이렇게 써야하지만 String은 new를 쓰지 않는다. // string도 class임. 
		c.company="현대";// ()안에 뭔가를 쓰는경우도 곧 생길 것이다. 
		
		Car c2=new Car();
		c2.name="K9";
		c2.company="기아";
		
		
		System.out.println("첫번째 자동차명:"+c.name);
		System.out.println("두번째 자동차명:"+c2.name);
		
		
		
		
		
		
		
		//c.name 
		//c2.name ->  c와 c2는 동일한 멤버변수와 메소드. 
		// c와 c2라는 참조변수는 car라는 클래스의 인스턴스 객체를 만든것임.  
		//그러므로 동일한 멤버변수와 메소드를 갖게 됨 
		// TODO Auto-generated method stub

		// 그냥 만들면 이렇게 써야함 
		/*String[] names=new String[2];
		String[] company=new String[2];
		
		names[0]="소나타";
		company[0]="현대";
		*/
		
		
		
		
		
		
		
	

}
