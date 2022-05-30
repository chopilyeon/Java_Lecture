package kr.ac.kopo.day02;

import java.util.Random;

public class Homeworkd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		//int max=num1>num2?num1:num2;
		//int min=num1>num2?num2:num1;
		
		
		
		int num1=r.nextInt(30)+1;
		int num2=r.nextInt(30)+1;
		int num3=r.nextInt(30)+1;
		
		System.out.println(num1+":"+num2+":"+num3);
		
		int max=num1,min=num2;
		if(num1<num2) {
			max=num2;
			min=num1;
		
		}
		
		if(num3>max) {
			System.out.printf("%3d%3d%3d\n",num3,max,min);
		}else if(num3>min) {
			System.out.printf("%3d%3d%3d\n",max,num3,min);
		}else {
			System.out.printf("%3d%3d%3d\n", max,min,num3);
			
		}

	}




/*
if(num1>num2) {//num1 num2
	if(num3>num1) {
		//num3 num1 num2
	}else if(num3>num2) {
		//num1 num3 num2
	}else {
		//num1 num2 num3
	}
	   
    */
//Math.random()// 0~9 사이의 숫자를 구하고 싶으면 *10을 하면 됨. 
//System.out.println((int)(Math.random()*10));
    

	
	
	
	
	}