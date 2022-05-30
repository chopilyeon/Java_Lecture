package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] strArr= {"데이터분석","자바","교육"};
		
		//String[] strArr=new String[3];
		// 여기까지만 치면 초기값이 null이 됨.
		
		//strArr[0]은 null 값이 됨.
		
		strArr[0]="데이터분석";
		strArr[1]="자바";
		strArr[2]="교육";
		
		
		/*
		 *
		 * int loc=0
		 * 좀 더 유연하게 쓸 수 있음 데이터분석이 사라져도 자바랑 교육이 보이게 됨 0 1 2 3 으로 쓰는 것보다는
		 * 후위 증가는 ; 후에 + 를 시키게 됨.  
		 * strArr[loc++]="폴리텍";
		 * strArr[loc++]="데이터분석";
		 * strArr[loc++]="자바";
		 * strArr[loc++]="교육";
		 * 
		 * 
		 */
		
		
		System.out.println("문자열이 총 개수:"+strArr.length+"개");
		
		
		/*
		 *배열의 전체 원소를 출력 방식
		 *1. index를 이용한 출력 (원소접근:0~length-1)
		 *2. jdk 1.5버전의 for문을 이용한 출력  -> 출력에만 사용이 됨. 
		 *3. Arrays.tostring() 메소드를 이용한 출력
		 * 
		 */
		 
		System.out.println("<index를 이용한 출력>");
		for(int i=0;i<strArr.length;i++) {
			System.out.println(strArr[i]);
		}
		
		System.out.println("첫번째 문자열:"+strArr[0]);
		System.out.println("두번째 문자열:"+strArr[1]);
		System.out.println("세번째 문자열:"+strArr[2]);
		
		//이걸 보고 메모리 구조도 그릴 수 있음.
		
	
		
		System.out.println("<1.5버전의 for문을 이용 출력>");
		//for(시작값;종료조건;증가/감소) { //: 으로 2개의 영역으로 분류시킬 수 있음 
	    
			
			// 이렇게 돌게 됨 String 파일의 s가 기억하게 됨. 
	    for(String s:strArr){
	    	
	    	/*String s=strArr[0]
	        String s=strArr[1]
	        String s=strArr[2]
	        		----
	        String s=strArr[strArr.length-1] 
	    */ 
	    	System.out.println(s);
	    	
	    	
	    
	    	
	    }
		

	System.out.println("<Arrays.toString() 메소드 이용 출력>");
	Arrays.toString(strArr); // 배열이 갖고 있는 것들을 하나의 문자열로 바꿔주게 됨 
	String result = Arrays.toString(strArr);
	System.out.println(result);
	//Array는 자바에서 제공하는 놈임 
	
	}
}



