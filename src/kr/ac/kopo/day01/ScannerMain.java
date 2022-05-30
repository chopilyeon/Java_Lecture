package kr.ac.kopo.day01;

import java.util.Scanner; // java에서 제공하는 util.Scanner 라는 패키지를 끌고와서 사용할 것입니다.

public class ScannerMain {

	public static void main(String[] args) {
		//keyboard로 입력을 받을 수 있는 것도 있음 
		
		Scanner sc = new Scanner(System.in); //java가 제공하는것 
		
		
		System.out.println("정수를 하나 입력하세요:"); /// 무엇을 입력받을지 항상 위에 써주자. 
		int a =sc.nextInt(); //키보드로 입력받은 정수; sc.nextFloat() 도 있음 단, sc.nextChar()은 없음// 문자열은 없단 소리. 
		System.out.println("a:"+a);
		//문자는 어떻게 받을지 알아보자. System.out.print("문자열을 입력:");
		//String str=sc.next(); // 단어 단위이기 때문에 hello world 치면 경고남. 
		//System.out.println("str:"+str);
		//문장으로 입력받기 우해서는? 
		String str=sc.nextLine();
		System.out.println("str:"+str);
		char ch=sc.nextLine().charAt(0); //문자는 이렇게 입력받는다.
		System.out.println("ch:"+ch);
		
	}
}