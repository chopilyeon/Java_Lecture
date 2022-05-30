package kr.ac.kopo.day13;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File fileObj=new File("iotest/a.txt"); // java io API를 살펴보자 File이라는 클래스가 존재함 -> 이 녀석의 생성자를 보면 pathname을 구성할 수 있는 것이 있음  
		//File dirObj=new File("iotest");
		//System.out.println("존재여부:"+dirObj.exists()); // 파일이 존재한다는 걸 알았음. //파일에 대한 경로인지 디렉토리에 대한 경로인지 알 수 없음 
		//System.out.println("디렉토리여부:"+dirObj.isDirectory());
		//System.out.println("파일여부:"+dirObj.isFile());// 디렉토리는 폴더임. 
		//File dirObj=new File("iotest/새폴더");
		
		
		
		
		File dirObj=new File("iotest/강아지/리트리버");// 리트리버라는 폴더를 만드는게 목적임. 근데 그전에 폴더라는게 필요함//접근 용도임 
		//File dirObj=new File("iotest/오리/리트리버");// 이거는 됨 -> 오리라는 폴더가 미리 있었기 때문임
		
		
		
		if(!dirObj.exists()) {
			dirObj.mkdirs(); // 이렇게 써야함 
		}
		
		
		
		//폴더 만드는 것 
		if(!dirObj.exists()) {
			dirObj.mkdir();
		}
		
		if(dirObj.exists()) {
			String [] list =dirObj.list(); 
			for(String data:list) {
				System.out.println(data);
				File fileobj=new File(dirObj.getName()+"/"+data);
				System.out.println(fileObj.isDirectory()?"디렉토리":"파일");
					
			}
		}
	File [] list=dirObj.listFiles(); // 파일 객체 형태로 달라는 것임 
	
	for(File f:list) {
		System.out.println(f.getName());
		System.out.println(f.isDirectory()?"디렉토리":"파일");
		
	}
	
		
		
		
		
		
		
		//만들었으니 true임. 근데 이클립스에서는 왜 안보일까? -> 실시간 반영이 아님. f를 눌러서 새로고침 해야 보임 
		
		//이런식으로 iotest 밑에 있는 a.txt의 정보를 갖고 올 수 있음. -> 이 디렉토리는 JAVA 폴더의 경로를 의미함.//상대경로임   
		//fileObj. // 절대 경로도 알 수 있음 -> 실제 D -> ------- 
		/*String fileName=fileObj.getName(); 
		String parent = fileObj.getParent();
		
		// 근데 이런 파일이 있는지 없는지 모름 
		System.out.println("파일명:"+fileName);
		System.out.println("부모:"+parent);
		System.out.println("파일 존재여부:"+fileObj.exists()); // 실제 파일의 존재 여부를 알고 싶은 것임
		//없으니까 만들어보자. 
		//java folder에 new를 눌러서 a.txt를 만들어보자.  
		long fileSize=fileObj.length();
		System.out.println("파일 크기:"+fileSize()+"byte(s)");
		System.out.println(fileObj.canRead()?"읽기가능":"읽기불가능");
		System.out.println(fileObj.canWrite()?"쓰기가능":"쓰기불가능");
		//실행가능인지 아닌지도 알 수 있음. 
		long lastTime=fileObj.lastModified(); // 밀리세컨드 단위로 나옴 
		//simpledateformat 이용해서 간단하게도 나타낼 수 있음 
		String pattern="yyyy-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println("마지막 수정시간:"+sdf.format(new Date(lastTime)));
			*/
	/* 
	 * 
	 * 교수님 코드
	 
	public class FileMain {

		public static void main(String[] args) {
		
			File dirObj = new File("iotest");
			if(dirObj.exists()) {
				
				File[] list = dirObj.listFiles();
				for(File f : list) {
					System.out.println(f.getName());
					System.out.println(f.isDirectory() ? "디렉토리" : "파일");
				}
				
//				String[] list = dirObj.list();
//				for(String data : list) {
//					System.out.println(data);
//					File fileObj = new File(dirObj.getName() + "/" + data);
//					System.out.println(fileObj.isDirectory() 
//							? "디렉토리" : "파일");
//				}
			}
			*/
			/*
			File dirObj = new File("iotest/강아지/리트리버");
			System.out.println("존재여부 : " + dirObj.exists());
			System.out.println("디렉토리여부 : " + dirObj.isDirectory());
			System.out.println("파일여부 : " + dirObj.isFile());
			
			if(!dirObj.exists()) {
				dirObj.mkdirs();
			}
			*/
		/*
			File fileObj = new File("iotest/a.txt");
			String fileName = fileObj.getName();
			String parent = fileObj.getParent();
			
			System.out.println("파일명 : " + fileName);
			System.out.println("부모 : " + parent);
			
			System.out.println("파일 존재여부 : " + fileObj.exists());
			long fileSize = fileObj.length();
			System.out.println("파일 크기 : " + fileSize + "byte(s)");
			System.out.println(fileObj.canRead() ? "읽기가능" : "읽기불가능");
			System.out.println(fileObj.canWrite() ? "쓰기가능" : "쓰기불가능");
			
			long lastTime = fileObj.lastModified();
			String pattern = "yyyy-MM-dd HH:mm:ss";
			SimpleDateFormat sdf = new SimpleDateFormat(pattern);
			System.out.println("마지막 수정시간 : " 
						+ sdf.format(new Date(lastTime)));
		*/
			
			

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
				
	}

}
