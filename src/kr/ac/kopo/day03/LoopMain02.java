package kr.ac.kopo.day03;

/*
 *	while(expr){ //조건이 거짓이면 밑으로 내려감. 
 *		statement;
 *	}
 *
 *	for(init;expr;incre){
 *		statement;
 *	}
 *
 *
 *------------------------------------------------------
 *지금 문제는 조건문을 밑으로 내리고 싶은 것임 
 *
 *for(init;expr;incre){
 *		statement;
 *}
 *
 *
 *{
 *
 *	statement;
 *}while(expr);  // ; 써주면 밑에 {}와는 관계가 없음을 의미하게 됨. 
 *{
 *}
 *----------------------------------
 *
 *
 *
 *do -while문
 *do{
 *	statement;
 *	incre/decre;
 *}while(expr); 
 *
 *
 *
 *
 *
 */



/*aaa: while() {
	
			switch
}
*/






public class LoopMain02 {

	 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int cnt=1;
		do {
		System.out.println("Hello");
		cnt++;
	}while(cnt<=5);

	 //while(true){->  이러면 무한 루프
		
	while(true) {
		System.out.println("Hello");
		++cnt;
		
		if(cnt>5) {
			break; // switch는 가장 가까운 switch 문에서 빠져 나오는 것임. beack 문은 반복문에서도 빠져나올 수 있음. 
		}
	}
		
	}
}