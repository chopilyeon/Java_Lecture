package kr.ac.kopo.day12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set : 순서(x) , 중복(x)
 * -HashSet
 * -TreeSet 
 * -object만 갖고 있으므로 generic을 이용해서 만들자 
 * 
 * 
 */



public class SetMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Set<String> set=new HashSet<>();
		System.out.println("\"one\"입력성공여부:+"+set.add("one"));
		set.add("one");
		set.add("two");
		set.add("three");
		set.add("four");
		set.add("five");
		
		System.out.println("전체 원소의 갯수:"+set.size()+"개");
		

		System.out.println("\"one\"입력성공여부:+"+set.add("one"));
	    //한번 넣으면 이제 못넣음 boolean 형으로 false 반환함. 
		
		//Data가 있는지 없는지 있으면 어디 있는지 접근하는게 hash임 전체데이터 보는건 복잡함
		///하지만 가능은 함 
		
		/*
		 * 접근 데이터 접근방법 3가지 
		 * 1. 1.5버전의 for문을 이용함. collection도 가능함. 
		 * 2. toArray()라는 메소드를 이용해서 전체 메소드를 access할수 있음 
		 * 3. iterator 객체 이용.  
		 *
		 * 
		 */
		System.out.println("<1.5 for 문을 이용한 출력>");
		for(String str : set) { // 나는 one two three four five 로 저장했는데 다르게 나옴 -> hashcode로 그룹핑을 알아서함 -> 지가 알아서 함 어떻게 출력될지 모름. 
			System.out.println(str);
		}// 내가 입력한 것과 다르게 출력이 됨. 
		
		//tree나 hash는 전체 데이터 접근 힘듬 list가 접근이 용이함. 
		System.out.println("<toArray()를 이용한 출력>");
		//set이 가지고잇는 데이터들을 array에다가 저장해주는 것임 그것이 toArray라는 메소드임. // 그래서 배열형태로 반환함 object배열로 뱉어버림 
		
		set.toArray(); 
		Object[] arr= set.toArray(); // object 배열로 받아버림 
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);//지금 원소의 타입이 object형임 arr[i].toString() 호출중임. 실제 object지만 to string을 호출중임. 매개변수로 object라는 인자가 들어가면 tostring을 붙여서 호출을 해줌
			//System.out.println(arr[i].length); // 이건 에러남 오브젝트임. length는 string에 정의되어 있는 메소드임 // 묵시적형변환 개념임. 
			//Object가 String을 받아버림 즉 Object가 toString을 하게 되면 String함수에서 오버라이딩된 toString을 호출하게 됨 -> 그래서 주소값이 아닌 그 값을 가르치게 되는 것임.  
			 
			
			
			
		}
		
		/*
		 * Iterator(순환객체) 주요 메소드
		 * -hasNext() : 데이터의 존재여부를 판단해줌. 그다음 데이터가 있니 없니 // true 아니면 false로 반환함. 
		 * -next():데이터를 접근 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		System.out.println("<Iterator 이용한 출력>"); // iterator는 list에도 있음. 
		Iterator<String> ite = set.iterator(); // 맨처음부터 맨 마지막까지 접근하고 싶은것이 목적임. 
		
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	
		
		
		
		
		
	}		
		
		
		
}
