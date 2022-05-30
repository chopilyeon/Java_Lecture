package kr.ac.kopo.day02;

/*
 * 반복문을 위한 기본요소 4가지
 * 1.반복할 문장(statement)
 * 2.시작값(init)
 * 3.증가/감소(incre/decre)
 * 4.종료조건(expr)
 
 *
 *			운동장 한바퀴 뛴다. 
 *			제어를 가하는 곳에 {}를 붙여야함 
 *	if(){
 * 운동장 한바퀴 뛴다;
 *}
 *  if라는 키워드 대신 while을 사용해보자. 
 *  
 *  
 *  한바퀴 뛸차례다;
 *  
 *  while(!열바퀴 다 뛰었냐?){
 *  		운동장 한바퀴 뛴다;
 *  		바퀴수 증가;
 *  		10바퀴일 때 빠져나가고 싶은 것임. 
 *  		
 *  }
 *  조건이 참이면 block scope내에 있는 제어문들을 수행함. 
 *  그렇기 때문에 앞에 !을 붙임. 조건이 참이어야 제어문들을 수행하기 때문임. 
 *  
 *  조건이 거짓이 될때까지 수행함. 
 *
 *  1.init;
 *  while(2.expr){
 *  3.statement;
 *  4.incre/decre;
 *  }
 *  5. 
 *
 *	1 ->2 조건 참 -> 3-> 4
 *	  ->2 조건 참 -> 3-> 4
 *	  ->2 조건 참 -> 3-> 4
 *	  ->2 조건 거짓 ->5
 *
 */


public class LoopMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean bool=false;
		System.out.println("---------반복문 시작------");
		while(bool) {
			System.out.println("Hello");
		}
		
			
		////while(false){
			//System.out.println("Hello"); -> 이런 식이면 작동 안함. 위처럼 boolean 으로 변수 저장시키고 while 조건문에 넣어놓으면 작동함.  
		//}
		
		//{
		//System.out.println("Hello");
	//} -> 이것 자체는 그냥 제어문일 뿐임

	


	int cnt=1;
	while(cnt<=5) {
		System.out.println("Hello");
		++cnt; // 혼자 단독으로 쓰면 전위증가랑 후위증가랑 똑같다고 인식해도 됨. cnt++; 
	}
	System.out.println("--------반복문 종료----------");
	}

}


//-----------------------
/*
for(1.init;2.expr;3.incre/decre){
	4.statement;
}
5.
for나 while이나 조건식이 거짓이 될때까지 반복을 실시함. 
1->2 조건 참->4 (먼저 문장을 수행하고)->block scope가 끝나고 증가나 감소의 문장을 수행을 함.

1->2 조건 참 -> 4->3
 ->2 조건 참 -> 4->3
 ->2 조건 참 -> 4->3
 ->2 조건 거짓 ->5
*/


/* 같은 방식으로 while문이 아닌 for문을 사용해보도록 하자. 
/
public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	
	System.out.println("---------for 반복문 시작------");
	
	for(int cnt =1;cnt<=5 ; cnt++) { // 일반적으로 for 문에서 후치나 전치나 다 똑같음. 
		System.out.println("Hello");
	}
	
	System.out.println("-------for 반복문 시작-------");
	System.out.println("-------while 반복문 시작-------");
	}

	int cnt =1; 
	
	while(cnt<=5) {
		System.out.println("Hello");
		++cnt;
	}
	*/
	
	// 변수를 두번이나 설정을 해버리면? -> 에러가 나야 정상인데 왜 에러가 나지 않을까? 변수의 라이프사이클 때문에 
	// 변수는 사라지게 됨 block 나가면 사라짐 
	// 그러므로 밖에서는 cnt 변수 출력이 안됨.
	// 그래서 while 다음에 for 문이 있으면 오류가 남 while은 block scope 밖에서 정의가 되기 때문임. 
	
//	if(a>5)System.out.println("t")