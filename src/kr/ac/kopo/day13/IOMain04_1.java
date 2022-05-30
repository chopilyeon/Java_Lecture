package kr.ac.kopo.day13;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;

import kr.ac.kopo.util.FileClose;

/*
 	콘솔모드에서
 	java IOMain04_1 Koala.jpg Koala2.jpg 입력시 
 	
 	Koala.jpg -> Koala2.jpg 
 	
 	//arguments 에 대해 알자............................ 
 	
 	
 	
 */

public class IOMain04_1 {

	public static void main(String[] args) { // arguments가 기억을 함. run configuration 에서 뭘 쳐야함 -> 이거 사진에 있다 
	
		System.out.println("args:"+Arrays.toString(args));
		
		
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {//args 에 도스창으로 하듯이 하는거 보여주려고 args에 저장한 것임 이렇게도 할 수 있다. 
			//fis = new FileInputStream("iotest/Koala.jpg");
			fis = new FileInputStream(args[0]);
			bis = new BufferedInputStream(fis);
			
			//fos = new FileOutputStream("iotest/Koala3.jpg");
			fos = new FileOutputStream(args[1]);
			
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
			
			FileClose.close(bis, fis);
			FileClose.close(bos, fos);
			
//			FileClose.close(bis);
//			FileClose.close(bos);
//			
//			FileClose.close(fis);
//			FileClose.close(fos);
		}
		/*
		} finally {
			
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
	*/	
		System.out.println("파일복사가 완료되었습니다");
	}
}










