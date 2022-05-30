package kr.ac.kopo.day11.Main;

public class Exception07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		a();
		try {
			b(); // 1. b 실행하다가 
		}//catch(FileNotFoundException|ArrayIndexOutofBoundsException e -> 이걸 그냥 Exception e 로 받아버림 <<상속>>){
		catch(Exception e) { //3. 에러 잡아버림 
			e.printStackTrace();
		}
	
		a();
		
		
	public static void b() {
		FileReader fr = new FileReader("a.txt"); //여기에는 throw가 설계되어 있음 반드시 try catch가 있어야 한다는 것임. 
	
} // 원래는 try catch 해야함 

	/*설계할때 
	 * 
	 * interface AAA{
	 * void info();
	 * void connect() throws Exception; 이런식으로 설계해버리면 예외처리 하라는 소리임. 
	 * 
	 * 
	 * 
	 * 
	 
	class ABC implements AAA{
		
		@override
		public void connection() throws Exception{
			// override 할때 throws도 붙여주자
		}
	}
	
	ABC obj =new ABC();
	try {
		obj.connect();
	}catch(Exception e) {
	} // 이거 안치면 에러남 
	
	*
	*/
	
	
	public static void c() thorws Exception()
	
	
	public static void c() throws Exception{
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void b() throws FileNotFoundException{ // 사람들이 예외처리 과연 할까?... 메소드를 호출하는 사용자는 반드시 try-catch 문장이 필요하게 됨. 
		FileReader fr = new FileReader("a.txt");
	//2. 에러남
	
	

} // 원래는 try catch 해야함 -> throws로 날려 버림 
	
	

	public static void b() throws FileNotFoundException{
		int[] arr= new int[3];
		System.out.println(arr[4]); // 이걸 b가 처리할 수 없음 -> 그러면 강제종료함.  // 얘가 보낸 에러는 filenotfound 에러임 배열의 에러를 처리하지 못함
		
		
		///ArrayIndexOutofBoundsException e 이거 추가해줌. 
		FileReader fr = new FileReader("a.txt");
	//2. 에러남
	

		public static void b() throws FileNotFoundException,ArrayIndexOutofBoundsException{ // 이렇게 ArrayIndexOutofBoundsException 이거 추가해줌. 
			int[] arr= new int[3];
			System.out.println(arr[4]); // 이걸 b가 처리할 수 없음 -> 그러면 강제종료함.  // 얘가 보낸 에러는 filenotfound 에러임 배열의 에러를 처리하지 못함
			// 배열을 처리하는 걸 추가해줘야함 
			FileReader fr = new FileReader("a.txt");

		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void a() {
		
		try {
			String str=null;
			System.out.println(str.length());
		}catch(Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
	}
	
	/// 이렇게 throw를 한번에 묶을 수 있음. 
	
	
	try {
		c();
		d();
		e();
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
	
	
	
	
}
