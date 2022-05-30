
package kr.ac.kopo.day01;

public class PrintMain02 {
	
	public static void main(String[] args) {
		System.out.println('A');
		System.out.println('A'+"BCD");
		System.out.println('A'+'B');
		System.out.println('A'+10);
		//아스키코드로 인식함. 
		/* 
		 	ASCII CODE(0~256) - 1byte
		 		대문자 소문자 숫자문자 특수문자 공백문자를 숫자로 일대일 매칭시킨 숫자표
		 	UNICODE(0~655000) - 2byte
		 		다국어 지원 숫자표(ASCII CODE+한글,한자, ....)
		 		자바의 경우는 유니코드를 이용하게 됨.
		 		한글을 인식못하는 경우가 생겨버리게 됨 ##16진수형태로 프론트엔드할 때 이렇게 쓰기도 함. 
		 		//2진수 아닌 16진수를 이용하는 경우가 생기기도 함. 2진수가 너무 길어서. 
		 		'A' : 65                /// 0x 이건 16진수를 나타내게 됨. 0x41 //계산기 앱들어가서 확인해보자
		 		'a' : 97				/// 0x61 이 됨 
		 		'0' : 48				/// 0x30
		 		 
		 		 A 출력? 
		 */
	}

}
