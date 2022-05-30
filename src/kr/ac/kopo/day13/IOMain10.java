package kr.ac.kopo.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

public class IOMain10 {
	
	public static void write() {
		Icecream ice =new Icecream("비비빅",1000,"혜태");
		
		
		FileOutputStream fos = null;
		DataOutputStream dos= null;
		
		

		
		try {
			
			fos=new FileOutputStream("iotest/icecream.txt");
			dos=new DataOutputStream(fos); 
			
			//write에 관련된 메소드 겁나 많음. 
			dos.writeUTF(ice.getName()+"#"+ice.getPrice());
			//dos.writeUTF(ice.getName()); // 이렇게 동시에 치면 에러발생 왜? 
			//dos.writeInt(ice.getPrice());
			
			dos.flush();
			
			System.out.println("icecream.txt에 저장완료...");
			
		}catch (Exception e) {
			e.printStackTrace();
		}finally{
			FileClose.close(dos,fos);
		}
		
	
	}

	
	public static void read() {
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			
			fis=new FileInputStream("iotest/icecream.txt");
			dis=new DataInputStream(fis);
			
			
			String[] data=dis.readUTF().split("#");
			
			System.out.println(Arrays.toString(data));
			String name = data[0];
			int price = Integer.parseInt(data[1]);
			//Icecream ice = new Icecream(name,price,company);
			//System.out.println("로딩된 아이스크림:"+ice);
			
			//Icecream ice= new Icecream(data[0],data[1]);
			
			
			
			//String data=dis.readUTF();
			//data.split("#");
			//System.out.println(data);
			
			
			
		}catch(Exception e) {
			
		}finally {
			FileClose.close(dis,fis);
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		read();
		
		
		
		
	//	write(); 
		//아이스크림 객체지만 내가 실제 알고 싶은 것은 브랜드와 가격임. 
		
		//dataoutputString을 이용해보자. 
		
		
		
		
	}
	
	
}
