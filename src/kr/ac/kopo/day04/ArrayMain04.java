package kr.ac.kopo.day04;


import java.util.Arrays;
public class ArrayMain04 {

	public static void main(String[] args) {
		

	
	// 편하긴 하지만 어떤 차이가 있는지 알아보자 
	//int[] arr= {10,20,30,40,50}; // 선언시에만 사용할 수 있다. 
	//int[] arr=new int[] {10,20,30,40,50};
	
	//이번엔 5 4 3  을 가르키는 놈을 정의하고 싶어짐
	
	//arr= {5,4,3}; 이러면 에러남. 배열의 선언과 같이 사용되어야 함. 
	//다른 배열을 가르키게 하고 싶은 것임 -> 기존의 brace 못씀
	
	
	
	int [] arr=new int[] {5,4,3}; //이미 갖고 있는 녀석을 다르게 지정해주고 싶다면 이래야만 쓸 수 있는 것임.
	
	
	
	
	
	
	System.out.println("arr:"+Arrays.toString(arr));
	}
}
