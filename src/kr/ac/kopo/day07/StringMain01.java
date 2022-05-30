package kr.ac.kopo.day07;

import java.util.Arrays;

public class StringMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			//String str="hello";// 밑에 꺼랑 차이점이 존재하지만 나중에 설명함.
			String str=new String("hello");
			char[] chars= {'h','e','l','l','o'};
			String str2=new String(chars);
			byte[] bytes= {65,67,98,120};
			String str3=new String(bytes);
			
			str=new String("Hello World!!!"); // 이게 어떻게 가능?
			System.out.println("str:"+str+",길이:"+str.length());
			
			
			
			char[] words=new char[5];
			
			//words에 Hello Worlds의 문자를 저장해보자. 
			
			int loc=0;
			str.getChars(6,11,words,0); //6번째부터 10번째까지 words의 0번 인덱스부터 저장하세요. 
			/*
			 * 
			 * words =new char[str.length()];
			 * str.getChars(0,str.length()-1, words,loc); // str.length에는 문자 없으므로 -1 로 씀.  
			 * 
			 */
			
			for(int i =6;i<=10;i++) {
				//System.out.println(str.charAt(i));
				words[loc++]=str.charAt(i);
			}
			//words 는 캐릭터 배열임. 
			
			System.out.println("words:"+words); // 주소가 기억됨. 
			System.out.println("words:"+Arrays.toString(words)); // 배열을 하나의 문자로 
			
			
			// C 는 아스키코드 기반임 // 자바는 문자단위로 움직일 수 있기 때문에 -> 자바에서 c로 넘기면 잘 모름 
			//주거니 받거니 할때는 byte형태를 더 많이 씀. -> 자바 언어를 C 가 이해를 못할 수 있음. 
			
			System.out.println("str:"+str);
			System.out.println("str2:"+str2);
			System.out.println("str3:"+str3);
			
		}

	}

}
