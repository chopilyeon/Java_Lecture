package kr.ac.kopo.day06.method;


//class Method 를 만들면 같은 패키지내에 있으므로 동명의 클래스가 존재할수 없음. 이미 앞에서 만들었음. 패키지 내에 있는 자바
//파일로 인식함

class ExamMethod{
	
	int getSum(int a, int b){
		return a+b;
		
	}
	
	int getTotal(int a,int b) {
		int s= 0;
		while(a<=b) {
			s+=a++;
			//잘못씀. 초창기의 내가 실수함
		}
		return s;
	}
	
	
	
	
	
}




public class MethodMain04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ExamMethod exam=new ExamMethod();
		int sum = exam.getSum(10, 20);
		System.out.println("10+20="+sum);
		
	
		
		
		System.out.println("1~10 총합:"+exam.getTotal(1,10)); // 이건 어디 값이 저장된것이 아님 일회성으로 그냥 저장이 된 것임
		
		
		
		

	}

}
