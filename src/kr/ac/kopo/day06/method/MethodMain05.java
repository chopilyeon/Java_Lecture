package kr.ac.kopo.day06.method;

public class MethodMain05 {

	public static void main(String[] args) {
		//gu.a; 구구단 내에서 정의된 a는 이런식으로 쓸수 있음 구구단 내에서 int a= 10; ㅇ
		// TODO Auto-generated method stub
		GuGudan gu=new GuGudan();
		
		System.out.print("2-9사이의 단을 입력:");
		int dan=gu.getDan();
		gu.print(dan);
		gu.print();
		
		
		System.out.print("시작단 입력 : ");
		int startDan = gu.getDan();
		
		System.out.print("종료단 입력 : ");
		int endDan = gu.getDan();
		
		System.out.println(startDan + " : " + endDan);
		
		/*
		Scanner sc= new Scanner(System.in);
		System.out.print("2-9사이의 단을 입력:");
		int dan=sc.nextInt();
		*/
		
		gu.print(dan); 
		gu.print();
		
		
		
		
		

	}

}
