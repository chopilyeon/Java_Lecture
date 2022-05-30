package kr.ac.kopo.day05.homework;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums=new int[10];
		int[] sum=new int[2]; //[0] : 짝수의 총합~[1]:
		Scanner sc=new Scanner(System.in);
		
		
		int oddSum=0,evenSum=0;
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(i+1+"번째 정수 입력: ");
			num[i]=sc.nextInt();
			sum[nums[i]%2]+=nums[i];
				
			}
		String[] title= {"짝수","홀수"};
		for(int mod=0;mod<=1;mod++) {
			System.out.println("<"+title[mod]+">");
			for(int i=0;i<nums.length;i++) {
				if(nums[i]%2==mod) {
					System.out.print(nums[i]+" ");
				}
			}
			System.out.println(title[mod]+"총합:"+sum(mod));
		
			
			
			
			
		System.out.println(Arrays.toString(sum));
		}
	
//do while- 잘못 입력받은거 다시 입력받게끔 하는것임 
	
		
		
		/*for(int i=0;i<nums.length;i++) {
			do{
				System.out.print(i+1+"번째 정수 입력: ");
			
			num[i]=sc.nextInt();
			}while(nums[i]<0);
			sum[nums[i]%2]+=nums[i];
	    }
		*/ 
		
		//do-while 말고 다른 방법으로 해보자 -이중반복이라 비효율적임 
		
		//무한 루프돌릴려면 맨뒤에 i++ 생략하면딤
		
		
		for(int i=0;i<nums.length;i++) {
			System.out.print(i+1+"번째 정수입력:");
			nums[i]=sc.nextInt(); //올바르지 않으면 i++이 되면 안됨 
			if(nums[i]<0) {
				i--;
			}
				
		}
		
		
		// 더 간단한 방법은 무한루프 돌리고 올바르게 입력할때만 i++ 하는 경우임
		/*
		for(int i=0;i<nums.length;) {
			System.out.print(i+1+"번째 정수입력:");
			nums[i]=sc.nextInt(); //올바르지 않으면 i++이 되면 안됨 
			if(nums[i]>=0) {
				sum[nums[i]%2]+=nums[i];
				i++;
			}
				
		}
		*/
		
		int loc=0;
		
		while(loc<nums.length) {
			System.out.print(loc+1+"번째 정수입력:");
			nums[loc]=sc.nextInt();
			if(nums[loc]<0)
				continue; // 올바르지 않다면 위로 올라가자. 
		    sum[num[loc]%2]=num[loc++];
			
		}
		

		while(loc<nums.length) {
			System.out.print(loc+1+"번째 정수입력:");
			nums[loc]=sc.nextInt();
			if(nums[loc]>=0){
			 // 올바르지 않다면 위로 올라가자. 
		    sum[num[loc]%2]=num[loc++];
			}
		}

		
		
		
		
		
		
	}

}
