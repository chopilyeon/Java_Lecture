package kr.ac.kopo.day02;

import java.util.Scanner;

/*
 *  컴퓨터의 연산은 2개씩만 수행이 가능하므로
 *  if(조건1){
 *  	문장1;
 * 	}else{
 * 		if(조건2){
 * 			문장2;
 * 		}else{
 * 			문장3;
 * 		}
 * }
 * 
 * 
 * 문장2와 문장3을 나누기 위해 또 if 조건문이 필요함 
 * 중첩된 if문임. 
 * 조건2의 해석 -> 조건1이 거짓인 것들 중에서 조건2가 참이라면 문장2를 수행하라
 * 조건1이 거짓인 것들 중에서 조건2가 거짓이면 문장3을 수행해라. 
 * 
 * 
 * 
 * 	출발한 시간을 입력하세요(ex 7시30분: 730)=>807
 * 	버스를 탑니다.
 *  1+2 말고도 
 *  2+1로도 나눌 수 있음. 
 *  
 *  if(time<815){
 *  	if(time<800){
 *  		System.out.println("걸어간다");
 *			}else{
 *				System.out.println("버스를 탄다");
 *			}
 *}else{
 *		System.out.println("택시를 탄다");
 *}   
 * 
 * 
 * 
 */

public class IFMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			
			System.out.println("집에서 출발한 시간을 입력하세요(7시30분:730)=>");
			int time = sc.nextInt();
			
			if(time<800) {
				System.out.println("걸어서 학교에 간다");
			}else {
				if(time < 815) {
					System.out.println("버스를 타고 학교에 간다");
				}else {
					System.out.println("택시를 타고 학교에 간다");
				}
			}
	




if(time<800) {
	System.out.println("걸어간다");
}else if(time<815) {
	System.out.println("버스를 타고 학교에 간다");
}else {
	System.out.println("택시를 타고 학교에 간다");	
}





/*

	다중if
	if(조건1){
}else if(조건2){
}else if(조건3){
}else{
}
조건 1 조건2도 거짓인 것들 중에서 조건 3
*/

/*
if(조건1) {
	문장1;
}else if(조건2) {
	문장2;
}else if(조건3) {
	문장3;
}else if(조건4) {
	문장4;
}else if(조건5) {
	문장5;
}else {
	문장6;
}
조건 1 아닌것 중에서 조건 2 조건 1 조건2 아닌것중에서 조건 3 조건 1 조건 2 조건 3 아닌것중에서 조건 4 
해석은 동일하지만 수평적인 관계처럼 보이게 됨. 위에는 종속적인 관게처럼 보임 
*/ 





/*

if(time>=800&&time<815){
Sys~
}else if(time<800){
sys~
}else if(time>=815){
sys~
}
이러면 헷갈림 그러니까 작은 범위부터 실시하자. 
*/
	}
}