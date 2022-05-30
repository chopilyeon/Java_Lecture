
package kr.ac.kopo.day13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain11 {

	public static void write() {
		
		Icecream ice = new Icecream("월드콘", 2000,"혜태");// 우선 객체 직렬화를 시키자. 
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null; //중간에 필터클래스로 object 클래스를 집어넣겠다는 의미임 
		
		try {
			fos = new FileOutputStream("iotest/object.txt");//이건 바이트로 넣겠다는 것임 
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(ice);
			
			System.out.println("object.txt 저장완료...");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(oos, fos);
		}
		
	}
	
	public static void read() {

		Icecream ice = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("iotest/object.txt");
			ois = new ObjectInputStream(fis);//묵시적형변환 중임. 무슨 객체가 들어올지 모름 car 객체일수도 있고 ice 객체일수도 있고 모름. 
			//명시적 형변환 실시 
			
			ice = (Icecream)ois.readObject(); 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			FileClose.close(ois, fis);
		}
		
		
		System.out.println(ice);
	}
	
	
	
	//굳이 제조사가 없다고 판단이 됨 -> 
	
	//멤버변수 3개중에 1개는 제외하고 싶음. company 값은 객체 직렬화에서 빼고 싶다는 생각이 들게 되었음.
	//transient 쓰면은 그 멤버변수는 읽지 않음. 
	
	public static void main(String[] args) {
		
		write();
		
		
	}
}




































