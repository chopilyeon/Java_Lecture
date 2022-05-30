package kr.ac.kopo.day02;

public class OperationMain03 {
	
	public static void main(String[] args) {
		
		int a=1,b=0,c=-1;
		//boolean bool = ++a>1||++b>1; // 컴퓨터는 (++a>1)||(++b>1) 이렇게 인식 중 우선순위는 and가 높음. 
		//boolean bool= --a>1&&++b>1||++c>0;
		//boolean bool= (--a>1&&++b>1)||(++c>0); 괄호는 이런식으로 형성이 됨.  앞의것이 F이므로 b에관한 연산은 볼필요가 없음 
		
		boolean bool = a++>0 || b-->=0 && c++<=0; // 연산은 무조건 왼쪽에서부터 오른쪽으로 연산함. 괄호가 쳐있다고 그거 먼저 하는 것이 아님. 괄호를 친다는 것은 A||X 이렇게 보겠다는 의미임. 앞이 참이므로 뒤를 볼 필요가 없음.
				//boolean bool=b-->=0 && c++<=0|| a++>0   // 이러면 의미는 달라짐 b--는 보여질때만 -1임 실제론 0임. 
		System.out.println("bool:"+bool); 
		System.out.println("a:"+a+",b:"+b+",c:"+c); // 앞의 것이 이미 참이므로 뒤의 것은 수행할 필요가 없음. 그래서 b의 값이 0이 된 것임. 
	}

}
