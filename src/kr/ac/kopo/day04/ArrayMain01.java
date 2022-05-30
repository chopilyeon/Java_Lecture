package kr.ac.kopo.day04;

public class ArrayMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr; // method 안에 생성되어 있는 지역변수임 ->메소드와 생명주기를 함께함. 이런건 초기화가 안 돼 있음. 자동초기화는 new일 때 가능하다. 
		
		//정수 5개를 가지는 배열을 생성
		
		//arr = new int[5]; //arr[0]~arr[4]
		//new는 자동초기화 일어남 그러므로 0이 되어 있을 것임. 
		
		
		arr=new int[10]; //하면 다시 할당이 됨. 줄엿다 늘렷다 하는 것이 아님 -> 주소값이 아예 바뀌어 있음. 
		
		
		System.out.println("arr:"+arr);
		System.out.println("배열의 원소 총 개수:"+arr.length+"개");
		System.out.println("첫번째 원소:"+arr[0]);
		System.out.println("두번째 원소:"+arr[1]);
		System.out.println("세번째 원소:"+arr[2]);
		System.out.println("네번째 원소:"+arr[3]);
		System.out.println("다섯번째 원소:"+arr[4]);
		//이러면 @표시 즉 주소가 찍히게 됨. 
		//index 때문에 i를 씀. 
		
		System.out.println("----------------------------------------------");
		
		//각 원소의 값에 10 20 30 40 50 대입
		/*arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		//임의의 i번째일 때 
		*/
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(i+1)*10;
		}
		
		
		
		
		for(int i=0;i<5;i++){//for (int i=0;i<=4;i++) <=4보다 <5라는 숫자를 많이 씀 -> 위에 보면 배열의크기가 5개니까!  
			System.out.println(i+"번째 원소:"+arr[i]);
		}
		//for(int i=0;i<arr.length;i++){ 이렇게 많이 구현함 lenght로 배열이 크기를 알아내는 것임. 
	
		}

}
