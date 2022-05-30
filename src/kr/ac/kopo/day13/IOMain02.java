package kr.ac.kopo.day13;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InputStream is = System.in;
		InputStreamReader isr= new InputStreamReader(is);
		System.out.print("키보드 입력을 하세요. ctrl+z 입력시 종료");
		
		
		
		
		while(true) {
			try {
				int c=isr.read(); // 보면 return값이 int임 그냥 int로 받아버리면 됨. 
				if(c==-1) break;
				System.out.print((char)c);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}

}
