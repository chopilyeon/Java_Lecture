package kr.ac.kopo.day07;

public class StringMain03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str= "hello world!";
		
		//r의 위치를 알아보자 
		
		//첫번째 인덱스부터 계속 물어보게 됨 
		
		for(int i = 0 ; i <str.length();i++) {
			if(str.charAt(i)=='r')
				System.out.println("r 위치:"+i);
		}
		
		//귀찮아서 다른 걸로 대체함 - >
		
		
		char search = 'r' ;
		String search="llo";
		String search="l";
		String search="p";
		System.out.println(search+"위치:"+str.indexOf(search)); // 이렇게 됨
		//l 의 위치를 싹다 뽑아보자.
		int index=str.indexOf(search); // 없으면 -1
		
		//질문 l
		while(index!=-1) {
			System.out.println("시작인덱스:"+index);
			index=str.indexOf(search,index+1); // search를 찾는데 index+1 부터 시작 맞으면 그 위치 반환 안맞으면 -1 반환 
		}
	}
		
		// indexOf 밑에 마우스 갖다 대면 overloading  지원함 
		//System.out.println(search+"위치:"+str.indexOf(search));
		//System.out.println(search+"위치:"+str.indexOf(search)); // 제일 처음에 나온 문자열 위치만 뽑아내는 것임 중복된거 안알려줌. 
		//System.out.println(search+"위치:"+str.indexOf(search,5)); // 5번째부터 위치를 찾아주게 됨. 
		
		
	
		str="hello world!";
		String subStr=str.substring(3,8); //[3]~[8-1] 문자열로 변환 
		System.out.println("substring(3,8)에 대한 결과는 :"+substr); //문자열로 반환 
		System.out.println("substring(6))에 대한 결과는 :"+str.substring(6)); //질문 6에서부터 끝까지 
		//원본은 이렇게해도 바뀌지 않음. 
	
		str="hello"+"!!!!";
		str="hello"+.concat("!!!!");
		
		
		String result=str.replace("l","rr");
		System.out.println("replace(\"l\",\"rr\"):"+result); // 질문 "인식하려고 
		
		str="         hello world   ";
		result=str.trim();
		
		
		String data="홍길동전:허균:조선시대";
		data.split(":"); // : 을 기준으로 쪼개겠다는 의미임. 
		String[] bookInfo= data.split(":");
		System.out.println("split():"+Arrays.toString(bookInfo));
		
		
		int num=123;
		String.valueOf(num); // num에 들어있는 정수값을 문자열로 바꿔주는 것임.
		String strNum=String.valueOf(num);
		System.out.println(strNum+100);
		
		//num+""// 형변환 때문에 문자열로 다 인식함
		
	}

}
