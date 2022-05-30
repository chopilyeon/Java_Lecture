package kr.ac.kopo.day12;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


/*
//생성자를 넣어보자. alt + shift + s 를 누른 후 c를 선택 => 기본생성자 
 * 										  o를 선택 => 매개변수 생성자
 * 										  r을 선택 => getter/setter 메소드 
										  v를 선택 =>override/implement 메소드
										  s를 선택 =>toString()메소드 date객체나 그런것들은 toString을 override할 것임. //그런것을 Source를 이용해서 만들 수 있음 
										  


*/
class Member {
	private String name;
	private String phone;

	public Member() {
	}

	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

@Override
public String toString() {
	return "Member [name=" + name + ", phone=" + phone + "]";
}
	


//public boolean equals(Object obj = new Member("홍길동","010-1111-2222"))
//묵시적 형변환이 발생하고 지금 명시적형변환으로 equals라는 method를 바꾸자. 
/*
@Override
public boolean equals(Object obj) {
	if(obj==null) {
		return false;
	}
	Member m = (Member)obj;
	if(!this.name.equals(m.name)) {// 여기서의 equals는 string의 equals임. 근데 에러남 -> obj는 object임. name은 멤버변수로 형변환을 해주어야함 obj의 name이 아닌 Member의 name이어야함 
		return false;
		
	}
	if(!this.phone.equals(m.phone)) {
		return false;
		
	}
	return true;
//날라오는 값에 null이 들어올수도 있음. 
//자신의 클래스 내부에서 쓰고 있기 때문에 member에 접근 가능함. 

	///복잡하게 생각하지말고 eclipse를 이용할수도 있음.  -> 이러면 equal도 만들어주고 해쉬도 만들어줌. 
	///source에 hashcode 하는 거 나옴 객체와 객체가 같다라는 의미를 뭐로 사용하겠냐고 물어보는 거임. 동호수만 같아도 같다고 인식할수도 있음 
/*
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 100;
	}
	*/
	//근데 이렇게하면 다른 것들의 해쉬값도 100이 될 수가 있음. 
		
//}*/

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	result = prime * result + ((phone == null) ? 0 : phone.hashCode());
	return result;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Member other = (Member) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	if (phone == null) {
		if (other.phone != null)
			return false;
	} else if (!phone.equals(other.phone))
		return false;
	return true;
}





/*
//public boolean equals(Object obj = new Member("홍길동","010-1111-222")) 
@Override
public boolean equals(Object obj) {
	if(obj == null) {
		return false;
	}
	Member m = (Member)obj;
	if(this.name != null && !this.name.equals(m.name)) {
		return false;
	}
	if(this.phone != null && !this.phone.equals(m.phone)) {
		return false;
	}
	return true;
}

@Override
public int hashCode() {
	// TODO Auto-generated method stub
	return 100;
}
*/

}

















class Car {
	private String name;
	private String carNumber;
	
	public Car(String name, String carNumber) {
		super();
		this.name = name;
		this.carNumber = carNumber;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", carNumber=" + carNumber + "]";
	}

	
	
	
}
	//generate toString이 source에 들어가면 있음 -> 주소값이 아니라 다른 값들을 출력해줘라고 말할 수 있음  














public class MapMain02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Member,Car> map = new HashMap<>();
		//equal값이 true이면서 해쉬값이 같아야 같다고 봄 hash 시리즈에서의 같다는 그런 의미임. 
		//해쉬코드도 같게 만들어 주어야함 
		
		
		System.out.println(new Member("홍길동","010-1111-2222").hashCode());
		System.out.println(new Member("홍길동","010-1111-2222").hashCode());
		
		System.out.println("hello".hashCode());
		System.out.println(new String("hello").hashCode());
		System.out.println(new String("hello").hashCode());
		
		//put 자체에 같은 값이 있으면 같다고 인식이 되게끔 설계가 되어있음. 덮어써버림. 
		
		
		map.put(new Member("개길동","010-1111-2222"),new Car("소나타","33가3333"));

		map.put(new Member("개길동","010-1111-2222"),new Car("소나타","33가3335"));


		
		
		
		map.put(new Member("윤길동","010-3333-4444"),new Car("K5","45나1234"));
		
		map.put(new Member("고길동","010-3333-4444"),new Car("K5","45나1234"));
		
		
		map.put(new Member("홍길동","010-1111-2222"),new Car("카니발","82다8282")); // 3명으로 인식해버리는 문제가 생김
		
		//나는 변경을 하고 싶은 것인데
		
		System.out.println("총 갯수:"+map.size());
		//데이터를 하나씩 찍어보도록 하자. 
		
		//계속 3개가 나오는 이유는 -> 해쉬코드값도 같고 equals까지도 우리가 정의해서 다 같도록 만들어주어야 함.
		
		
		Set<Entry<Member,Car>> entrys=map.entrySet();
		for(Entry<Member,Car> data:entrys) {
			Member member = data.getKey();
			Car car = data.getValue();
			
			System.out.println(member);
			System.out.println(car);
			
		}
		

	}

}
