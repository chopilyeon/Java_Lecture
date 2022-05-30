package kr.ac.kopo.day04;

public class ArrayMain03 {
	public static void main(String[] args) {
		
		int[] arr= new int[5];
		
		//값을 넣어보자
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		
		
		// 출력해보자 
		
		System.out.println("<PRINT>");
		
		for(int num:arr) {
			System.out.print(num+"\t");
		}
		System.out.println();
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		/*
		 
		int data=1;
		for(int num:arr) {
			num=data++;  // 이건 그냥 복사본임.  1.5버전의 for문은 출력할때 사용하는 것임 
		}
		// num값은 그저 arr값을 받을뿐 arr은 전혀 바뀌지 않았다. 
		
		
		for (int num:arr){
		System.out.print(num+"\t");
		
		//arr 을 출력하면 000000 이 나옴 num값이 arr을 받았으니까 
		*/
		
	}

}
