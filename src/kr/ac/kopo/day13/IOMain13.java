package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 
 *koala.jpg -> koala2.jpg 복사 

 *koala.jpg는 입력장치용임. 이걸 읽어서 koala는 입력장치에서 koala2는 출력장치에서 움직여야함  
 *
 */






public class IOMain13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//koala3 쳐도 filenotfoundexception 발생할 수 있음. 	

		FileInputStream fis=null;
		FileOutputStream fos=null;
		
		BufferedInputStream bis =null;
		BufferedOutputStream bos =null;
		
		
		
		
		
		try {
			fis = new FileInputStream("Iotest/a.txt");
			bis=new BufferedInputStream(fis);
			fos = new FileOutputStream("Iotest/b.txt");
			bos =new BufferedOutputStream(fos);
			//close 2개 필요함 
			//read / 할때 나만 쓸수 있게 lock이 걸려버림 -> 외부에서 보면 0KB로 밖에 안보임.  
			
			
			// 1바이트씩만 읽어오기 때문임. while로 계속 불러 들이자. 
			while(true) {
				int c = fis.read(); // 이미지파일이 -1로 저장이 되어있어서 자동으로 -1 을 보내줌 
				System.out.println(c); //1byte씩 이동중 -> 0~256 까지만 사용중. 
				if(c==-1) break;  // ctrl + z 를 하면은 자동으로 -1을 인식하게 해줌 ctrl 따로 z 인식하는게 아님
				fos.write(c);  //이거 저장하는 거임. 읽은거 저장해 읽기 쓰기할때 multi catch하기 귀찮음 exception 으로 바꿔주자 io 에러날 수 있음 
			}
			fos.flush(); // 남아있는거 밀어주는게 좋음. 
			
			long end = System.currentTimeMillis(); 
			
			System.out.println("복사완료얌");
			//while(true); // 있으면 여기서 안끝남.  
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try { // close 각각에 try - catch문을 써야함 
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // try 문안에 fis fos가 저장되었기 때문임 
		}
		System.out.println("파일복사가 완료되었습니다");
		
		
		/*}catch(FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}*/
		//크기가 0바이트임 -> 파일만 만들어진것임 
		/*외부장치에서 외부장치로 곧장 못보냄 
		 *무조건 램을 거쳐서 가야함. 
		 *file에 있는 거 읽어서 ram에 보내고 램에서 file에 보내고 
		 *프로그램은 램에서 동작함.  
		 * 
		 */
		
		
		//에러남 filenotfound 처리해주자 예외처리해주자 
		
		
		
	}

}
