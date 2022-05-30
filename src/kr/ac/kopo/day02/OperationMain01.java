package kr.ac.kopo.day02;

public class OperationMain01 {
	
	public static void main(String[] args) {
		
		int a=1,b=0;
		boolean bool = ++a>1||++b>1; // 컴퓨터는 (++a>1)||(++b>1) 이렇게 인식 중
		
		System.out.println("bool:"+bool); 
		System.out.println("a:"+a+",b:"+b); // 앞의 것이 이미 참이므로 뒤의 것은 수행할 필요가 없음. 그래서 b의 값이 0이 된 것임. 
	}

}
