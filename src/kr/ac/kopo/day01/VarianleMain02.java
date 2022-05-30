package kr.ac.kopo.day01;

class Test{

}

public class VarianleMain02 {
	
	public static void main(String[] args) {
		
		//"Hello" 문자열을 저장하기 위한 str 선언
		//자료형 str;
		String str;
		str="Hello";
		System.out.println(str);
		//원래는 이렇게 저장해야함. String이라는 class만 유일하게 new를 안쓰는 것임.  
		//String str = new String("Hello"); 
		//new에 만들면 heap에 만들어짐  이 공간을 대표할수 있는 공간이 없음 -> 
		//String이 참조변수라고 함. 
		//stack에 주소를 갖고 있음 -> 나중에 heap에 주소를 보내서 그 주소를 알려줌 << 참조변수는 오로지 주소값만 기억함 >> -> 다른 주소에 접근하게 해 줌. 
		//str 이 갖고 있는 것은 원래 0x50임 <<주소값일 뿐임>> 
		//heap
		System.out.println(str);
		System.out.println(str.hashCode());
		
		Test t =new Test();
		System.out.println(t);
		//@ 이런 주소가 나오게 됨 
		
		
	}

}
