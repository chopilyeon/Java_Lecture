package kr.ac.kopo.util;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileClose {

	public static void close(InputStream is) {

		if(is != null) {
			try {
				is.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void close(OutputStream os) {
		
		if(os != null) {
			try {
				os.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(InputStream fis, InputStream is) {
		close(fis);
		close(is);
	}
	
	public static void close(OutputStream fos, OutputStream os) {
		close(fos);
		close(os);
	}
	
	public static void close(Reader r) {
		if(r != null) {
			try {
				r.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void close(Writer w) {
		if(w != null) {
			try {
				w.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}




































/*package kr.ac.kopo.util;
//13일차 수업이랑 연관됨

import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
public class FileClose {

	//fis bis 전부다 inputStream 상속받는중 -> 묵시적형변환 가능함. 
	public static void close(FileWriter fw) { // static 붙이면 굳이 객체 만들 필요 없음 
		
	
	if(fw !=null) {
		try {
			fw.close();
		}catch(Exception e) {
			e.printStackTrace();
	
		}
	}
	
	}
	public static void close(OutputStream os) {
		
		if(os!=null) {
			try {
				os.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
		
	//f는 filter임
	public static void close(InputStream fis,InputStream is) {
		close(fis);
		close(is); 
	}
		
	public static void close(OutputStream fos,OutputStream os) {
		close(fos);
		close(os);
	}
	
	public static void close(Reader r) {
		if(r!=null) {
			try {
				r.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
}
*/