package kr.ac.kopo.day05.homework;

import java.util.Scanner;

public class HomeworkMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums=new int[5];
		Scanner sc=new Scanner(System.in);
		
		//i번째는 0~i-1 까지보다 커야 함. nums[i]>nums[0]~nums[i-1] 을 파악하자. 
		for(int i=0;i<nums.length;i++) {
			System.out.print(i+1+"번째 정수 입력: ");
			nums[i]=sc.nextInt();
			
			for(int j=0;j<i;j++) {
				if(nums[i]<nums[j]) {
					System.out.println("Error!!!");
					i--; 
					break; // 이렇게 해도 됨.
					
	loopI:for(int i=0;i<nums.length;) {
			  System.out.print(i+1+"번째 정수 입력: ");
			  nums[i]=sc.nextInt();
						
		  for(int j=0;j<i;j++) {
			  if(nums[i]<nums[j]) {
				System.out.println("Error!!!");
				continue loopI; // 멀리 떨어져 있는 곳으로 보낼수도 있음. 
				
					
				}
			}
		  i++
		  
		}
	
	loopI:for(int i=0;i<nums.length;) {
		  System.out.print(i+1+"번째 정수 입력: ");
		  nums[i]=sc.nextInt();
		  if(i>0&&nums[i]<nums[i-1]) {
			  //i=0 이면 -1이 되는 경우가 발생하므로 인덱스가 받을 수가 없음. 
		  
			  for(int j=0;j<i;j++) {
				  System.out.println(nums[j]);
			  }
			  System.out.println("보다 큰수여야 합니다");
			  i--;
		  }

			String msg = "";
			for(int i = 0; i < nums.length;) {
				System.out.print(i+1 + "번째 정수 입력 : ");
				nums[i] = sc.nextInt();
				if(i > 0 && nums[i] < nums[i-1]) {
					System.out.println(msg + "보다 큰수여야합니다");
				} else {
					msg += nums[i++] + " ";
				}
			}// 메세지를 이어붙일 수도 있음. 
			
		  
		  
			
			System.out.println("<PRINT>");
			for(int num:nums) {
				System.out.print(num+"\t");
			}
			System.out.println();
	
			
			System.out.println("< REVERSE >");
			for(int i=nums.length;i>=0;i--) {
				//num[i]=25 --> 52
				int n10=num[i]/10;
				int n1=nums[i]%10;
				System.out.print(n1*10+n10+"\t");
			
			}
			System.out.println();
	
	
	
	}

}


