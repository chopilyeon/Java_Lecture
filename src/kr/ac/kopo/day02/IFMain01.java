package kr.ac.kopo.day02;

/*
 * 조건문
 * 	
 * if(조건){
 * 		문장;
 * } 
 * 
 * 
 * if(조건){
 * 		문장1;
 * }
 * if(조건){
 * 		문장2;
 * } ///이러면 출력될수 있는 가짓수가 4개가 됨 우리는 2개만 출력하고 싶은 것임. 
 * 
 * 대안 
 * 
 * if(조건){
 * 		문장1;
 * }else{
 * 		문장2;
 * }  
 * 조건 ? 문장1: 문장2 가 되는 것임. 
 * 
 * 근데 살다보면 2분법적 사고만 하고 살지는 않음. 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 *조건에 맞으면 문장 안맞으면 빠져나가는 형태를 취하게 됨
 *보유하고 있는 책 권수 입력 :1 
 *1 book
 *보유하고 책 권수 입력 : 4
 *4 books
 */

public class IFMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int book = 10;
		
		System.out.print(book+"book");
		if(book>=2) {
		System.out.println("s");
		}
		System.out.println();
		
		if(book==1) {
		System.out.println(book+"book");
		}else{
			System.out.println(book+"books");	
		}

	}
}
