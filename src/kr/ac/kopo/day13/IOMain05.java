package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 	Koala.jpg -> Koala2.jpg 복사 
 */

public class IOMain05 {

	public static void main(String[] args) {
	
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
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
			//null 이면 어차피 에러남 bis가 null이 아닐때만 수행하도록 하자.
			if(bis != null) {
				try {
					bis.close();
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
			
			if(bos != null) {
				try {
					bos.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			try {
				if(fis != null)
					fis.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(fos != null)
					fos.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("파일복사가 완료되었습니다");
	}
}