package kr.ac.kopo.day12;


/*
 * 기본자료형 Wrapper Class 
 * boolean Boolean
 * char	Character
 * byte	Byte
 * short Short
 * int Integer
 * long Long
 * float Float
 * double Double
 * 
 * 
 * class Boolean{
 * 
 *  	private boolean value; //java.lang package에 있기때문에 import안해도 볼 수 있음
 *		  
 *  
 * 
 * 
 */



public class WrapperMain {
	
	public static void main(String[] args) {
	
	
	int i =100;
	Integer i2=new Integer(100);
//<<<<<<< HEAD
//=======

	//참조자료형 메소드 사용할 수 있음
		
//>>>>>>> //branch 'main' of git@github.com:chopilyeon/java_study.git
	Integer i5=Integer.valueOf(100);
	
	Integer i3=100; //Integer 는 객체임 100은 숫자임. //이러면 지가 알아서 참조자료형 위의 명령문을 실행함 // 오토박싱이라고 함 
	//auto boxing
	int i4=new Integer(100); // 이것도 원래 하면 안됨 -> 이게 가능한 이유는 wrapper class라 auto unboxing을 해서 밖으로 빼버림.
	System.out.println(Integer.parseInt("123")+100); //숫자 스트링을 정수로 바꿔줌. return값이 int로 나옴.  
	System.out.println(Integer.valueOf("123")+100);//reference 타입으로 123 뿌려줌 
	
	
	String str1= new String("Hi");
	String str2="Hi";
	String str3="Hi";
	System.out.println(str2==str3);
	System.out.println(str2.equals(str1));
	System.out.println(str2==str1);
	System.out.println(str2.hashCode());
	System.out.println(str1.hashCode());
	
	}
	

}
