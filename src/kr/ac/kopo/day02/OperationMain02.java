package kr.ac.kopo.day02;

public class OperationMain02 {
	
	public static void main(String[] args) {
		
		int a=1,b=0,c=-1;
		//boolean bool = ++a>1||++b>1; // 컴퓨터는 (++a>1)||(++b>1) 이렇게 인식 중
		boolean bool= --a>1&&++b>1||++c>0;
		//boolean bool= (--a>1&&++b>1)||(++c>0); 괄호는 이런식으로 형성이 됨.  앞의것이 F이므로 b에관한 연산은 볼필요가 없음 

		System.out.println("bool:"+bool); 
		System.out.println("a:"+a+",b:"+b+",c:"+c); // 앞의 것이 이미 참이므로 뒤의 것은 수행할 필요가 없음. 그래서 b의 값이 0이 된 것임. 
	}

}
