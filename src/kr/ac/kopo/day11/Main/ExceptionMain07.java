package kr.ac.kopo.day11.Main;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionMain07 {
	
	

	//이렇게 한번에 묶어서 예외처리 할 수도 있음. 
		public static void main(String[] args) {
			
			try {
				c();
				d();
				e();
			} catch(Exception e) {
				e.printStackTrace();
			}
			
			try {
				b();
			} catch(FileNotFoundException | ArrayIndexOutOfBoundsException e) {
				e.printStackTrace();
			}
			a();
			
		}
		
		public static void f() throws Exception {
			
		}
		
		public static void c() throws Exception {
			f();
		}
		
		public static void d() throws Exception {
			
		}
		
		public static void e() throws Exception {
			
		}
		
		public static void b() throws FileNotFoundException, ArrayIndexOutOfBoundsException {
			int[] arr = new int[3];
			System.out.println(arr[4]);
			FileReader fr = new FileReader("a.txt");
		}
		
		public static void a() {
			
			try{
				String str = null;
				System.out.println(str.length());
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}





