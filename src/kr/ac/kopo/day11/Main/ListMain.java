package kr.ac.kopo.day11.Main;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMain {

	
	/*
	 * List: 순서 0, 중복0 
	 * -ArrayList
	 * -LinkedList
	 * 
	 * 
	 * 
	 * 
	 * 
	 * add()
	 * get()
	 * size()
	 * remove()
	 * isEmpty()
	 * contains()
	 * clear()
	 * 
	 * 
	 * 
	 
	 
	 * 
	 */
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//List<int>list= new ArrayList<int>(); // 이러면 에러남 참조자료형만 들어오게 해야함
		//래포 변수라는게 있음. 그러면 쓸 수 있음 
		//List<Integer>list= new ArrayList<Integer>();// 정수로만 만들 수 있는 array인것임.
		//list.add(10);//
		//List<String> list=new ArrayList<String>(); // 동일해야함.
		//List<String>list=new ArrayList<>(); //JDK 1.7 버전부터는 자료형이 당연히 같으므로 안써도 됨.   
		List<String> list=new LinkedList<String>(); // LinkedList 로 바꿔줄 수 있음 묵시적형변환으로 가능. 
		//String을 set의 형태로 List로의 형태로도 저장할 수 있고. 
		//generic은 안에 들어가는 타입을 통일중. 
		//Printer랑 비슷한 맥락. 
		//실전에서는 List로 받는게 편함. 
		
		
		
		ArrayList<String> list1=new ArrayList<>(); // 
		
		
		
		list.add("one"); // 이러면 컴파일 할때 에러남. ->  정수가 아니므로 // 즉 컴파일시에 에러를 잡을 수 있다는 장점이 있음. 
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("one"); // 중복을 허용함 
		
		
		System.out.println("전체 원소의 갯수:"+list.size()+"개"); //몇번째부터 몇번째까지 데이터가 있더라 알려주는 것임. 
		
		//List list = new ArrayList(); // 이러면 막 저장해도 에러는 안남.
		
		
		//list의 목적은 같은 타입의 데이터를 모아놓고 거기서 탐색하는 것이 목적임.  
		
		
		System.out.println("<PRINT>");// 데이터는 압축되어있어야 좋은 것임. 구멍이 많아지면 안좋음. 
		
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i)); // 이러면 알려줌 
			
			// getmethod 이용해보자
			
			
			
		}
		
		
		
		
		
		//배열이랑 똑같이 사용함. 
		
		

		System.out.println("\"one\" 삭제:"+(list.remove("one")?"성공":"실패")); //boolean 값으로 반환함. 
		System.out.println("\"one\" 삭제:"+(list.remove("one")?"성공":"실패")); //boolean 값으로 반환함. // 이렇게하면 끝에놈 삭제 
		System.out.println("\"one\" 삭제:"+(list.remove("one")?"성공":"실패")); //boolean 값으로 반환함. //이제 실패  
		
		
		
		
		
		//이러면 삭제되면 앞으로 계속 밀려오는 걸 알 수 있음. 
		
		System.out.println("<1.5버전>");
		for(String str:list) {
			System.out.println(str);
		}
		//내부적으로 배열처럼 사용중 
		
		
		
	//1.5버전의 for문을 이용해보자. 
		
		
		System.out.println("0번지 문자열:"+list.get(0));
		System.out.println("0번지 위치한 문자열 삭제:"+list.remove(0));//삭제하고 삭제한 값 리턴  
		System.out.println("0번지 문자열:"+list.get(0));		
		
		
		
		
		

	}

}
