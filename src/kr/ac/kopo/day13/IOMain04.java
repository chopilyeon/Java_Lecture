package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOMain04 {

	public static void main(String[] args) {
	
			
			FileInputStream fis = null;
			FileOutputStream fos = null;
			// Buffered 도 close해야함 일반적으로 필터 클래스부터 close해야함 Buffer 부터 close를 실시하자. 
			BufferedInputStream bis = null;
			BufferedOutputStream bos = null;
			
			try {
				fis = new FileInputStream("iotest/Koala.jpg");
				bis = new BufferedInputStream(fis);
				
				fos = new FileOutputStream("iotest/Koala3.jpg");
				bos = new BufferedOutputStream(fos);
				
				long start = System.currentTimeMillis();
				
				while(true) {
					int c = bis.read();
					if(c == -1) break;
					bos.write(c);
				}
				fos.flush();
				
				long end = System.currentTimeMillis();
				
				System.out.println("소요시간 : " + (end - start) / 1000. + "초");
				
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
				try {
					fos.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			System.out.println("파일복사가 완료되었습니다");
		}
	}




		
		
		
		
		
		
	