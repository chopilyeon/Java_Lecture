package kr.ac.kopo.day07;

public class StringMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	   //final하고는 상관은 없음. 참조변수일 때는 주소를 비교하게 됨. 
		
		
		//String str = "Hello";// 상수문자열임. 
		//String str2= "Hello";
		
		
		//밑에 처럼 쓰면 출력결과가 다르다라고 나옴  
		
		
		//이유는? 위에꺼는 상수 문자열임. method 공간. -> Hello를 가르키는 공간은 하나임.  
		// 램에 상수값들을 저장할 수 있는 공간이 있음 Hello 를 저장할 수 있는 공간이 만들어짐 -> 
	
		// 주소값이 같냐고 물어보는것임
		
		
		//참조변수를 비교하게 되면 주소를 비교하게 됨 
		
		//기본 자료형은 자기가 값을 갖고 있으므로 주소값을 비교할 필요가 없는 것임. 
		//String str = new String("Hello");
		//String str2=new String("Hello"); 
		
		
		
		
		
		
		//이건 주소를 비교하는 것임. equals라는 메소드로 비교해야함 
		/*if(str==str2) {
			System.out.println("같다");
		
		}else {
			System.out.println("다르다");		
		}
		
		*/
		/*
		if(str.equals(str2)==true) {
			System.out.println("문자열비교:같다");
		}else {
			System.out.println("문자열비교:다르다");
		}
		*/
		// 만약 대문자라면 다르게 인식하게 될 것임. 
		System.out.println("대소문자관계없이 문자열 비교:"+str.equalsIgnoreCase(str2));
		
		
		
		
		
		String[] names = { "홍길동","홍길순","홍길동","박길동","홍가네","윤길동","한길홍"}; 
		
		
		System.out.println("<전체 이름이 홍길동인 사람 출력>");
		
		for(String name : names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			
			}
		}
		
		System.out.println("<성이 홍씨인 사람 목록을 출력해주세요>");
		for(String name:names) {
			if(name.equals("홍길동")) {
				System.out.println(name);
			}
		}
		
		

		System.out.println("<성이 홍씨인 사람 목록을 출력해주세요>");
		for(String name:names) {
			if(name.startsWith("홍")) {
				System.out.println(name);
			}
		}
		
		
		/*System.out.println("<이름이 길동인 사람 출력>");
		for(String name:names) {
			if(name.endsWith("길동")) {
				System.out.println(name);
			}
	*/
		
	
		System.out.println("<이름에 홍 포함된 사람 출력 >");
		for(String name:names) {
			if(name.contains("홍")) {
				System.out.println(name);
			}
		}
		
			
			
		String str="apple";
		String str2="banana";
		int compare=str.compareTo(str2); 
		if(compare==0) {
			System.out.println(str+"=="+str2);
		}else if(compare>0) {
			System.out.println(str+">"+str2);
		}else {//compare<0
			System.out.println(str+"<"+str2);
		
		}
		
		
		
		
		
		
		
	}

}
