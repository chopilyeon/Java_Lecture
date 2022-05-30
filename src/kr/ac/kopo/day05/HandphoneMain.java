package kr.ac.kopo.day05;


//이런식으로 클래스를 생성할수도 있음.  // 앞에서 car는 public붙여도 되고 안붙여도 되지만 이런식으로 class생성하려면 public 쓰면 에러남 
//public이 붙으면 접근제한자임.

//참조 클래스를 .java 로 만들지 않고 저렇게도 만들 수 있음. 


class Handphone{
	
	String name; //실 사용자 명
	String phoneNumber; //핸드폰 번호
	String company; //제조사
	

	
	
}

/// 아까 car class에 정의되어 있는 변수들과 다름. 

//배열은 같은 파일의 변수들을 모아놓은 것들의 집합임. 



public class HandphoneMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handphone hp = new Handphone();
		hp.name = "홍길동";
		hp.phoneNumber="010-1111-2222";
		hp.company="삼성";
		
		Handphone hp2=new Handphone();
		hp2.name="강길동";
		hp2.phoneNumber="010-3333-4444";
		hp2.company="애플";
		
		Handphone hp3=new Handphone();
		hp3.name="윤길동";
		hp3.phoneNumber="010-5555-6666";
		hp3.company="화웨이";
		
		
		// int 나 double 이런게 아닌가? int 와 double 의 경우는 자료형 배열. 
		//홍길동 삼성 이런것도 다른데서 받아와야하지 않나? 
		//String 배열과 비슷한 이치임. 참조형 배열처럼. 
		Handphone[] hpArr= {hp,hp2,hp3}; //Handphone 배열 hpArr가 만들어진것임. 
		
		for(Handphone phone:hpArr) {
		
			
			System.out.println("사용자:"+phone.name+",전화번호:"+phone.phoneNumber+",제조사:"+phone.company);
		}
	}

}
