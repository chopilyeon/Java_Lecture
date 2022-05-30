package kr.ac.kopo.day01;

public class VariableMain03 {
	
	public static void main(String[] args) {
		
		int a;
		byte b=10;
		
		a=b; // =은 대입 연산자라고 부름 b를 a로 보내는 것임. //자료형은 같아야 함. // 연산자를 기준으로 좌측과 우측의 자료형이 같아야함
		// 다른경우가 생길수도 있음 
		// 이런 경우에 형 변환이 발생할 수가 있음.
		//기본자료형에서의 형변환 -> 형변환의 종류에는 명시적 강제적 묵시적 형변환이 있을 수 있음 
		//참조자료형에서의 형변환은 나중에 배움. 
		//int =byte 자체가 말이 안됨. 
		//byte가 아닌 int가 들어와야 됨. 
		//너는 원래 int라고 최면을 걸어야함 
		a=(int)b; // 이게 형변환임. int = (int)byte 묵시적 형변환임.  
		//묵시적인경우에는 int를 사용 안해도 됨. 
		b=(byte)a; // byte =int 이것은 명시적임. b=(byte)a; 이렇게 써도 되지만 명시적이므로 그냥 써야됨. 명시적일경우엔 에러가 발생하게 됨. 
		//연산자 좌우로 타입이 달랐을 때 써주는 것임. 
		System.out.println(10+20);
		System.out.println(10+20.0); // 이런식으로 연산할때도 형변환이 일어남 -> 큰수의 타입을 따라가게 됨
		//원래는 System.out.println((double)10+20.0) 이런식으로 써야하지만 묵시적으로 큰수의 타입을 따라가게 됨 
		//만약 int형의 계산을 하고 싶으면 System.out.println(10+(int)20.0); 이런식으로 써줌. 
		double d= 10+20.2;  //10.0+20.2로 변환이 됨.
		//int e= 10+20.2; //10은 정수임 20.2는 double 큰수의 타입을 따라가야함 30.2가 됨 -> int로 받음 또 형변환이 일어남 -> 30이 됨 근데 30.2이므로 
		int e= (int)(10+20.2);//이렇게 쓰는것이 맞는것
		//상수는 변경될수 없는 데이터임.
		
		int num=100;
		System.out.println("num:"+num);
		num=20;
		System.out.println("num:"+num);
		
		//final 붙이면 안됨 
		
		//final int num =100;
		//파이값같은건 고정시켜놔야함 어떤사람은 3.14 어떤사람은 3.1로 계산할수도 있음 
		//final은 메소드 클래스 전부다 붙을 수 있음.
		//final 변수는 대문자로 작성해줌. 
		//final int NUM=100; 이런 식임. 
		
		double aaa = Math.PI*10; // PI에 final이 붙어있구나! 아는 것 
		
		char ch= '!'; // '' 안에는 문자를 넣어야함. 
		//ch='''; // '라는 문자를 넣고 싶은것임. 이럴 때는 역슬래쉬를 사용함  ch='\''; 이렇게 붙여준다. 
		ch='\n'; //이게 엔터임. 
		//ch='\' // 역슬래쉬를 넣고 싶은것임. 자바는 역슬래쉬 다음의 문자를 한꺼번에 인식해버림 -> 저경우는 앞의 '의 짝이 없어짐. 저런 경우에는 ch='\\' 이런식으로 저장하게 됨. 
		System.out.println(ch);
		
		///경로 지정할때 사용이 됨 \가 붙으면 그 다음 문자와 붙어버리기 때문에 경로에는 \\ \\ \\ \\ 이런식으로 표현이 됨 
		String path="D\\Lecture\\java-workspace";
		System.out.println(path);
		String str="\"ab\""; // "를 문자로 인식하기 위해서 \를 붙여줌. 
		System.out.println(str);
				
	}
	

}