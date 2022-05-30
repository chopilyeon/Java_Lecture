package kr.ac.kopo.day06.method;

public class MethodMain01 {
	
	/*
	
	메소드명([파라미터]){
		문장;
		문장;
		
		
		
	}
    */
	
	//이건 메소드의 정의를 할 때임. 
 // 메소드는 소문자로 시작
	static void printStar(){ //파라미터 모르면 안에 비워놓자 void는 반환값 // 일단은 static 몰라도 됨   
		System.out.println("**********");
		
	
		
		
		/*static void printStar(int cnt){ //파라미터 모르면 안에 비워놓자 void는 반환값 // 일단은 static 몰라도 됨   
			
		
	for (int i=0;i<cnt;i++){
		System.out.print("*");
	}
	System.out.println();
  }
*/	
		
		

		
		//만약 우리가 prinStar("*",10); 이라는 값을 보내버리고 싶으면?
		
		
		//char=*을 받는 것이고 숫자는 10을 받는 것임. 
		
		//char를 안넣는다던가 int값을 안넣게되면 에러가 발생하게 됨. 
		
		
		/*static void printStar(char ch,int cnt){ ,로 구분한다는 사실을 명심하자.
		결론은 내가 뭐가 필요한지 일단 알아야 함. 전달할 값이 있는지 확인을 해야 함.  
		
		
		
	for (int i=0;i<cnt;i++){
		System.out.print("*");
		System.out.print(ch);
	}
	System.out.println();
  }
*/	
		
		//printf() - > 이것도 메소드임 
		// 첫번째 string, int 형이 필요하게 된 것임. 
		//println("bye"); 이건 확인해보면 파라미터가 String으로 되어 있음 
		//println(12.45); 이것도 확인해보면 파라미터가 double로 되어 있음 print는 가변인자임. 
		
		
		//Random r = new Random(); 
		
		//r.nextInt(10) nextInt 라는 메소드 안에 파라미터 10이 필요한 것임 그래서 확인해보면 int로 설정이 되어 있음
		//nextInt는 우리가 만든게 아니므로 확인해봐야함. 
		//매개변수 파라미터 일단 같다고 인식하자  매개변수는 매개체로 쓰이는 변수임 파라미터 = 매개변수 
		
		
			
			
			
		
		
		
		
		/*만약 메소드안에 int cnt=10; 이라는 변수가 있다면 이것은 printStar 가 갖고 있는 변수인 것임. 
		이 프린트스타 다 돌면 없어짐 
		즉  method 안에 있는 변수들은 이 method안에 있을 때만 쓸 수 있는 것임. 
		
		*메소드 안의 변수는 계속 유지할수 있는 것이 아님. 
		*main이 printstar라는 method를 호출하고 있음 main -호출자 // printstar 는 피호출자. 
		*printstar 는 main method에 종속적임.  
		*
		*하나의 메소드가 누구의 관점으로 보느냐에 따라 호출자 피호출자가 될수가 있음. 
		*printstar 안의 변수와 main안에 있는 변수는 서로 독립적임. 
		*
		*main안에 있는 cnt 나 printstar 안에 있는 cnt 다 다르게 인식함. 
		*method와 method는 다 독립적이게 됨. 
		*
		*서로 다른 메소드 안의 변수들을 서로 전달하고 받기 위해서는 반환형과 파라미터를 이용해야함 
		*
		*파라미터는 호출자 메소드가 피호출자 메소드에게 자신의 변수를 전달하기 위해서 만들어진 것임. 
		*반환값은 피호출자 메소드가 호출자 메소드에게 자신의 변수를 전달하기 위한 수단 
		*void 란 없다라는 뜻임
		*
		*/
		

		
		/*for (int i=0;i<10;i++){
				System.out.print("*");
			}
			System.out.println();
		  }
		*/
		
		//별찍는 횟수를 제어하고 싶음. 
		
		
		
		
		
		//return에 대해 알아보자 *과 10 이라는 숫자를 받아서 보내보자 -> main에 어떤 연산을 거쳐서 보내보자 
		
		// 피호출자인 prinStar가 호출자인 main 에게 전달하고 싶다는 것임
		
		//return 이라는 키워드를 사용함 -> 나를 호출했던 main 으로 돌아가고 싶어요임. 
	
		//return 은 무조건 복귀임 
		
		
		/*
		static void aaa() {
			boolean bool = true;
			System.out.println("A");
			System.out.println("B");
			
			if(bool) {
				return;
			}
			
			System.out.println("C");
			System.out.println("D");
		}
		
		//저러면 CD 출력 안됨 
		
		/*
		static void aaa() {
			System.out.println("A");
			System.out.println("B");
			
			
			System.out.println("C");
			System.out.println("D");
		 /////////////////////////////return; 이 써있지 않음. -> 생략되어 있지만 보낼는 무조건 모든 메소드 안에 들어있음 그렇기 때문에 작동하는 것임
		}
		
		
		하지만 우리의 목적은 그냥 돌아가면 안됨 
		
		return 뒤에 뭘 붙여주자 
			static void aaa() {
			System.out.println("A");
			System.out.println("B");
			
			
			System.out.println("C");
			System.out.println("D");
	
			return(전달 값);
			
			return ch+cnt;  이런식으로 쓰는 것임
			
			void는 반환할 값이 없다는 의미 였으므로 
			
			void를 이제 바꿔주자. 
			
			데이터 타입으로 써줘야함
			이런식임 
			
			그러면 main 입장에서도 return 된 값을 받아서 기억해야함. 
			
			
			
			피호출자가 받을수 있는 값은 여러개 . 하지만 호출자가 피호출자에게 받을수 있는 return 값은 1개입니다. 
			
			int code = printStar('A',10); =은 1:1 대응이므로 return값은 1개만 전달이 되어야 함. 
			
			피호출자가 받을수 있는 값은 여러개 . 하지만 호출자가 피호출자에게 받을수 있는 return 값은 1개입니다. 
			
			
			같은형태 여러개 보내려면 배열 
			
			다른형태면 ? collection 을 보내자~! 
			
			
			
			
			int [] a=new int [] {2,3,4,5}
			
		/*String[] strArr=new String[3]; 이므로 어차피 주소값을 갖고 있으므로 
		 *
		 *
		 *
		 *return new string[3]; 	
		 * 
		 * 
		 * 
		 * String[] strArr={"태진아","가능"}
		 * 
		 * 
		 * new Singer[]
		 */
			
			 
			 static int aaa(){
			 
			 }
		
		*/	
		
		
		
		
		
		
	
	
	
	
	//String[] args를 받아와라. 
	public static void main(String[] args) { // main method가 자바의 시작을 알림  //main이 호출자에게 전달할건 없음 그래서 void /// String[] args를 썻으므로 
		// TODO Auto-generated method stub
		printStar(); //이건 문장을 수행할때임 void 안써도 됨 그냥 (); 만 하면 됨. 메소드의 호출부 // 메소드를 호출한 셈임 
		System.out.println("Hi");
		printStar(); 
		// 이러면 정의된 것만 고치면 됨. -> 하나만 수정하면 다 수정이 됨. 수정에 대한 노가다를 줄일 수가 있음. 
		
		//객체지향은 추후에 이해하자. 
		
		
		//printStar(10); // 10이라는 값을 넣고 싶다 10이라는 숫자를 printStar 라는 메소드에 넣어버리고 싶다. 
		
		//printStar(20); // 20이라는 값을 넣고 싶다 20번 호출하게 끔  static void PrintStar(int cnt) 로 저장이 되어 있음 즉 20이라는 숫자를 int cnt로 박아줘야 함. 
						
					   //20이라는 값을 보내즈아 
		
		
		
	
		/*객체지향형의 방식 
		
		
		
		class 강아지{
			
			void 잠을잔다() {
		
			}
			void 목욕한다() {
			}

		class 고양이{
				
			void 잠을잔다() {
				System.out.println("고양이가 잠을 잡니다");
			
			}
			void 목욕한다() {
				System.out.println("고양이가 냐옹합니다");
			}
		
		
		*/
		
		
		
		
		
		/*Scanner 같은 경우는 정수일때는 nextInt() 
		 * 문자일때는 nextLine()  
		 * 
		 * 이런식으로 받아버릴 수 있음. 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		 //절차지향형은 이렇게 만듦
		/*dogsleep(){
			강아지가 잠을 잔다
		}
		
		dogwash(){
			강아지 목욕한다
		}
		
		catsleep(){
			고양이가 잠을 잔다
		}
		*/	
		}
		
		 	 
		 }
		

	}

