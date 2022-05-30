package kr.ac.kopo.day01;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hi");
		System.out.println("second file");
		//10+20=30
		//System.out.println(10+"+"_+20+"="+10+20);->이항연산 때문에 이상하게 나오게 됨.System.out.println(10+"+"_+20+"="+(10+20))
		System.out.println(10+"+"+20+"="+(10+20));
		System.out.printf("%d살",23); //%d 뒤에 매칭되어야 할 숫자를 뒤에다 쓰면 됨.
		System.out.println();
		System.out.printf("%d+%d=%d",10,20,10+20); //명령이 끝나면 세미콜론 붙여야함
		System.out.println("\n");
		System.out.printf("%d살\n",23);
		System.out.printf("[%7d]\n",15800);//오른쪽으로 7자리에 맞춤하여라. 
		System.out.printf("[%-7d]\n",15800);//왼쪽으로 7자리에 맞춤하여라. 
		System.out.printf("[%04d]\n",35);//0을 쓰도록 하여라. 
		System.out.printf("[%f]\n",12.3456);//소수점 다 찍어줌
		System.out.printf("[%.2f]\n",12.3456);//소수점 버림실시함.
		System.out.printf("[%b\n",true);//소수점 버림실시함. //boolen의 형태로도 가능함.
		
	 String str1= "Hi";
	 String str2= new String("Hi");
	 System.out.println(str1+str2);
	}
}