package kr.ac.kopo.day13;
/*
 * iotest/IOMain05.java -> IOMain05.java.txt 복사 
 * 
 * 
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

import kr.ac.kopo.util.FileClose;

public class IOMain08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fr= null;
		FileWriter fw=null;
		BufferedReader br =null;
		BufferedWriter bw =null;
		
		
		////////
		
		PrintWriter pw = null;  //필터를 하나 더 써주자. 
		
		
		
		
		try {
			
			
			fr=new FileReader("iotest/IOMain05.java");
			br = new BufferedReader(fr);
			
			fw=new FileWriter("iotest/IoMain05.java.txt");
			bw=new BufferedWriter(fw);
			//pw=new PrintWriter(bw);
			//print의 더 확장된 기능을 이용해서 println print printf 를 활용할 수 있음. 
			//어느어느 파일이 대상임. 이렇게 쓸 수 있음. 
			
			
			while(true) {
				String data=br.readLine(); //엔터까지 읽어오겠다는 의미임 -> 엔터는 저장은 안됨. 엔터는 그냥 구분자로만 인식함 엔터는 들어가지 않음. 
				if(data==null)break;//문자의 끝이 null 이면 끝임. 아까 파일같은 경우는 끝이 -1이었음. 
				bw.write(data); // BufferedWriter에 String 출력하는 거있음.// 엔터전까지만 출력 버퍼. 
				bw.newLine(); //엔터를 추가시키라는 의미임. 
				//pw.println(data); 이거 쓰면 newLine() 이런거 안써도 됨. println printf print 다 쓸 수 있게 됨. 
			}
			bw.flush();
			System.out.println("파일 복사를 완료하였습니다");
		} catch(Exception e){
			e.printStackTrace();
		}finally{
			FileClose.close(br);
			FileClose.close(fr);
			FileClose.close(bw);
			FileClose.close(fw);
			FileClose.close(pw); 
		}
		
		
		
		
	}

}
