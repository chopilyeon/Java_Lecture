package kr.ac.kopo.day04;

import java.util.Arrays;

public class ArrayMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {10,20,50,70,30};
		int[] copy=arr; // arr 배열의 복사본을 갖게 하는 것이 목적임. 
		
		
		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println("copy:"+Arrays.toString(copy));
		
		
		
		copy[2]=100; // 수정이 될까? -> 되긴 됨 대신 arr 배열까지도 .  참조변수를 복사한것 -> 즉 주소를 복사한 것이다

		System.out.println("arr:"+Arrays.toString(arr));
		System.out.println("copy:"+Arrays.toString(copy));
		
		//우리는 저 배열을 복사해오고 싶은 것임. 한번 해보자 
		
		//deep copy
		
		//method를 이용할 수도 있음. 
		
		//jvm이 java.lang package 에 있는 class는 자동으로 import해버림 
	    //그래서 import하지 않고 사용하고 있는 것임. 
		
		
		
		//int[] copy=arr;
		int[] copy1=new int [arr.length];
		System.arraycopy(arr, 0, copy1, 0, arr.length);
		//이렇게 해서도 카피 가능함. 딥카피 0번지부터 저 사이즈만큼 복사해다가 넣어주세요.
		System.out.println(copy1);
		System.out.println(arr);
		
		
		//int[] copy=new int[arr.length];
		
		for(int i=0;i<arr.length;i++) {
			copy[i]=arr[i];
		}
	
		//이러면 서로 다른 주소값을 갖고 있음을 알 수 있음. 
		
		
		
	}

}
