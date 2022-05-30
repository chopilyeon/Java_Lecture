package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/*
 * 
 * Map : key value 쌍의 집합, key에 대한 중복(x)
 * HashMap
 * TreeMap
 * 
 * 
 * 
 */



public class MapMain01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		Map<String,String>map=new HashMap<>();
		map.put("aaa", "1111");
		map.put("bbb", "2222");
		map.put("ccc", "3333");
		map.put("ddd", "4444");
		
		
		System.out.println("<패스워드 변경 서비스>"); 
		System.out.println("아이디를 입력:");
		
		String id = sc.nextLine(); 
		if(!map.containsKey(id)) {//if(map.containsKey(id))==false) // 이렇게 써도됨  
			System.out.println("입력하신 ["+id+"]는 존재하지 않습니다");
			System.out.println("서비스를 종료합니다");
			return; 
			
			//if를 만족하면 return 함  fff를 실행하고 있다는 얘기는  if를 만족하지 못했다는 얘기임 
		}
		//fff
		//즉 id가 있다는 의미임 else안쓰고도 쓸 수 있음
		
		System.out.println("기존의 패스워드 입력: ");
		String password = sc.nextLine();
		if(!map.get(id).equals(password)) {//! 붙이면 같지 않다는 의미임. String에서의 동등비교는 equals로 하자 
			System.out.println("패스워드가 일치하지 않습니다");
			System.out.println("서비스를 종료합니다");
			 return;
		}
		System.out.print("변경할 패스워드를 입력: ");
		String newPassword = sc.nextLine();
		map.put(id, newPassword);
		System.out.println("패스워드 변경이 완료되었습니다.");
		
		
		
		//이제 전체 맵에 있는 정보를 출력해보자. 
		//어떻게 하면 전체 데이터를 출력할 수 있을까? 
		//iterator 가 없음... 
		//map에 있는 정보를 출력하기 위해서 key에 대한 중복을 허용하지 않으므로 set형태로 만들어보자. 
		
		//이게 entry set임. 
		 // 맵에 있는 정보를 set형 객체로 만들어주고 싶은 것임. 
		//return type이 set임. 
		
		//map은 key와 value의 쌍임.
		
		/*class Map{
		 * 
		 * private Object key;
		 * private Object value; 
 		 *실제로는 이렇게 되어있지 않음 Map은 그 안에 entry class가 있음 
 		 *내부 클래스로 구성되어 있음. 
 		 *class Map{
 		 *
 		 *class Entry{
 		 *	private Object key;
 		 *	private Object value;
 		 *}
 		 *Map.class 
 		 *Map$Entry.class //inner class 임. 
 		 *
 		 *
 		 *우리의 목적은 key와 value를 뽑아내고 싶은 것임.
 		 *entrySet -> entry value를 set형으로 뽑아달라는 뜻임 
 		 *제네릭은 그러면 Entry로 뽑아내야함.   
 		 */
 		 Set<Entry<String,String>> set= map.entrySet();
 		 //이제 Set형임 
 		 
 		 //1.5 버전의 for문을 사용하자 
 		 
 		 System.out.println("---------------------------");
 		 System.out.println("<회원 정보 출력>");
 		 System.out.println("---------------------------");
 		 System.out.println("아이디\t패스워드");
		 
 		 
 		 //map을 collection으로 변환하려면 set형임 중복을 허용하지 않고 순서를 가지지 않은 것은 똑같으므로
 		 Set<String> keys=map.keySet();
 		 for(String key:keys) {
 			 
 			 System.out.println(key+"\t"+map.get(key));
 			 
 			 
 		 }
 		 
 		 
 		 /*
 		 for(Entry<String,String>:set) {
 			 System.out.println(e.getkey()+"\t"+e.getValue());
	 
 			 
 		 }
 		 */
 		 //getkey 하면 아 key라는 변수 있겠구만 유추 가능 
 		 
 		 
 		 
 		 
 		System.out.println("---------------------------");
		  		 
 		 
 		 //map 은 인터페이스임 
 		
 		
 		
 		
 		
 		 
		
		
		
		
		
		
		
	}

}
