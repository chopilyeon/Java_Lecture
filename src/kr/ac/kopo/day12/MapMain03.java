package kr.ac.kopo.day12;

public class MapMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s01=new String("hello");
		String s02=new String("hello");
		//객체를 비교하기 위해선 equals method를 사용해야함 
		///if(s01.equals(s02)){
		
		Member m= new Member("홍길동","010-1111-2222");
		Member m2=new Member("홍길동","010-1111-2222");
		
		//객체와 객체를 비교할때 equals method를 사용해야 함.
		if(m.equals(m2)) {
			System.out.println("m==m2");
		}else {
			System.out.println("m!=m2");
		}
		// 같다라고 나와야하는데 같지 않다라고 나옴. 
		//eqauls 는 지금 object꺼를 상속중임. 
		//equals 메소드를 보니까 주소값을 비교중임. 실제 if(m==m2) 이러고 있음 
		
		
		//overriding 해야함 
		
		
		// 가서 override 하자. 
		
		
 		
		
		
		
		
	}

}
