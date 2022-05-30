package kr.ac.kopo.day02;

public class OperationMain05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 10,b=5;
		int max =a>b?a:(a<b?b:0); // 공간 3개로 분리시킨 셈. 
		max = a == b ? 0 : (a>b?a:b);
		
		System.out.println("max:"+max);

	}

}
