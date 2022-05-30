package kr.ac.kopo.day13;

import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URL;

public class IOMain12 {

	public static void main(String[] args) {
		//웹브라우저도 서버에서 io 써서 이런거 읽어서 갖고 오는 것임.
		//inputstream 형태로 읽어서 뿌려주는 것임. 
		//웹에서도 io형태로 작동중임. 
		
		
		try {
			URL urlObj = new URL("https://www.naver.com");
			
			
			FileWriter fw =new FileWriter("iotest/naver.html"); // 객체 만들기 위해서 파일 
			PrintWriter pw = new PrintWriter(fw);
			
			
			InputStream is = urlObj.openStream();
			//byteStream을 char도 인식하게 만들어주어야함 
			InputStreamReader isr= new InputStreamReader(is,"utf-8");
			while(true) {
				int c = is.read();
				if(c == -1) break;
				System.out.print((char)c);
				pw.print((char)c);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}

