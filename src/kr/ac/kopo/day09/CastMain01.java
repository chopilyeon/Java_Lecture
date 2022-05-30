package kr.ac.kopo.day09;

public class CastMain01 {
	
	
	
	//return 타입에서의 묵시적형변환을 보자. -> 이런 경우에 묵시적형변환이 더 많이 일어남. 
	
	
	/*
	public static void print(Child01 c) {
		
		c.print();
	}
	public static void print(Child02) {
		c.print();
	}
	
	*/
	
	//그냥 디폴트가 object obj 라서. 그냥 안써도 됨
	public static void print(Object obj) {
		
	}
	
	//이것도 묵시적 형변한임. 
	
	
	public static Object returnFun() {
		return Random();
		return true;
		return new java.util.Scanner(System.in);
	}
	
	
	
	
	
	//묵시적 형변환 
	
	/*
	print(new Random());
	print(new Car());
	print(new String("111"));
	*/
	
	
	//이 자체가 묵시적 형변환임. 
	
	//부모클래스가 참조변수로 받아버리고 있는 셈임. 
	
	//이걸로 때로는 child의 study sleep 메소드 같은걸 다 받아버리고 싶음.  
	
	//근데 이자체로는 부모의 공간만 접근이 가능함.
	Parent p=new Child(); 
		Child ss=(Child)p;
	
	
	public static void print(Parent p) {
		p.print();
	}
	
	
	
	public static void main(String[] args) {
		
		Child01 c01=new Child01();
		// print(c01); -> 이렇게 쓰는 없음.
		
		// 보통은 이렇게 씀 
		print(new Child01);
		
		
		Child01 c01= new Child01();
		c01.print();
		
		Child02 c02 =new Child02();
		
		print(02)
		
		
		c02.print();
		
		Parent p = new Parent();
		print(p);
		p.print();
		
	
		
		
		
		
		
		
		
		//명시적 형변환에 대해 알아보자
		//이렇게 하면 p로는 sleep이나 study를 실행이 불가능함.
		//묵시적이 일어나야 명시적이 가능한 것임. 
		
		public static void print(Parent p) {
			p.print();
		
			
			//Child01 c= (Child01)p; //인자가 뭐가 나올지 모름 c01일지 c02일지 아무도 모름. 
								//child 02 가 날라오면 그걸로 바꿔야함 parent가 날라오면 그대로 쓰고.
								//child 01이 날라올수도 있음.
								//이걸 알수 있는 방법이 필요함 
								//이럴 때 instanceof 라는 키워드를 써야함 
			
			
			if(p instance of Child01) {
				Child01 c = (Child01)p;
				c.study();// 명시적 형변환을 한 후에 그제서야 study랑 sleep이 가능함 
				c.sleep(); 
				
			}else if(p instance Child02) {
				
				Child02 c= (Child02)p;
				c.sing();
				c.play();
			
			}
				
			System.out.println("Child01:"+(p instanceof Child01)); // p가 가르키는 객체가 child01이냐? 라고 묻는 것임. 
				System.out.println("Child02:"+(p instanceof Child02));
				System.out.println("parent:"+ (p instanceof Parent));
			
			
			c.study();
			c.sleep(); 
			
			
		}
		
		
		
		public static void main(String[] args) {
			
			
			
			print(new Child02()); // child02 영역에 parent도 있어서 true로 뜸. 
			print(new Child01()); // child01 영역에 parent도 있어서 true로 뜨긴 뜸. 
			print(new parent()); 
			
			
			
			
			
			
			Child01 c01=new Child01();
			// print(c01);
			
			print(new Child01);
			
			
			Child01 c01= new Child01();
			c01.print();
			
			Child02 c02 =new Child02();
			print(02)
			
			
			c02.print();
			
			Parent p = new Parent();
			print(p);
			p.print();
			
		
			

		
		
		
		
		
		
	}

}
