package kr.ac.kopo.day02;

public class homework02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	int num1=(int)(Math.random()*30)+1;
	int num2=(int)(Math.random()*30)+1;
	int num3=(int)(Math.random()*30)+1;
	int num4=(int)(Math.random()*30)+1;
	
		
	System.out.println(num1+":"+num2+":"+num3+":"+num4);
	
	Math.random();// 0~9 사이의 숫자를 구하고 싶으면 *10을 하면 됨. 
	System.out.println((int)(Math.random()*10));
	/* 
	int max01=num4>num2?num1:num2;
	int max02=num3>num4?num3:num4;
	int max=max01>max02?max01:max02; 
	*/
	
	
	
	
	
	int max=num1>num2?num1:num2;
	if(max<num3) {
		max=num3;
	}
	if(max<num4) {
		max=num4;
	}
	
	System.out.println("가장 큰수:"+max);
	
	
	}

}
