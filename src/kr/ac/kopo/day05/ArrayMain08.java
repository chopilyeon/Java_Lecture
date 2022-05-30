package kr.ac.kopo.day05;

public class ArrayMain08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr=new String[3];
		
		strArr[0]="hello";
		strArr[1]=new String("good"); //일단은 new String 이랑 string 같다고 보자 엄밀히는 다름 
		strArr[2]="nyenye~~~";
		
		//String 만 new없이 사용할 수 있다. 일단은 기억하자
		
		for(String str:strArr) {
			System.out.println(str);
		}
			
	}

}
