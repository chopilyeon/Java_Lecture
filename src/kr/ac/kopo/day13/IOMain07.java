package kr.ac.kopo.day13;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import kr.ac.kopo.util.FileClose;

public class IOMain07 {

	
	public static void write() {
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		try {		
				fos =new FileOutputStream("iotest/data.dat");
				dos =new DataOutputStream(fos);
				char c='A';
				int num = 99;  //text 파일은 99를  c로 인식. 
				double f=12.34;
				//난 케릭터를 저장했음 -> 근데 1byte로 저장이 됨. 
				//나는 2byte로 케릭터 클래스를 저장하고 싶은 것임  -> DataoutputStream을 이용해보자. 
			
				fos.write(c);
				dos.writeChar(c); // 똑같이 A가 들어가있지만 -> 이건 2Byte임. 
				//대문자 A는 65임. 공백이 있는 이유? 
				//0000 0000 0100 0011 ------------- 0000 0000은 null로 찍힘. 0100 0011 
				//둘다 넣어봐도 됨 한꺼번에 넣어보자.
				dos.writeInt(num); //이건 4바이트임. 그래서 공백이 생겨버림. 
				dos.writeDouble(f);
				//메모리의 크기만큼이 파일에 할당이 된다는 것이 중요함. 
				
				
				dos.flush();
		}
		catch(Exception e) {
			e.printStackTrace();
		}finally {
			FileClose.close(fos);
		}
		System.out.println("파일저장 완료");
		
		}
		
		public static void read(){
			
			FileInputStream fis = null;
			DataInputStream dis = null;
			
			
			
			try {
				fis= new FileInputStream("iotest/data.dat");
				dis=new DataInputStream(fis);
				
				int i = dis.read();
				char c=dis.readChar();
				int i2=dis.readInt();
				double d=dis.readDouble();
				
				
				System.out.println("첫번째 문자:"+(char)i);
				System.out.println("두번째 문자:"+c);
				System.out.println("정수 : "+i2);
				System.out.println("실수 : "+d);
				
				//내가 어떤 식으로 저장했는지에 따라 읽어오는 방식이 다름. datainput dataoutput 이거 순서가 맞아야 함. 
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				FileClose.close(dis,fis);
			}
			
			
		}
		
		
		
		
		
		
	
		public static void main(String[] args) {				
				read(); //저장한 순서 그대로 읽어와야 함. 
				write(); 
		
		
		
	
		}
	}	