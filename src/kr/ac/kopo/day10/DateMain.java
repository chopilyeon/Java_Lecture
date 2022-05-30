package kr.ac.kopo.day10;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//simpleDateFormat// 더 간단하게 현재 시간정보를 알고 싶은 거임. 
		String pattern = "yyyy-MM-dd hh:mm:ss(E)";  
		String pattern = "yyyy년도 MM월 hh시 mm분 ss초(E요일)";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		System.out.println(sdf.format(new Date(pattern))); // 지금 시간을 넣어서 위의 pattern으로 가르쳐주세요 하는 것임 
		//데이트 형식으로 뿌려야 됨 
		
		
		
		
		
		// 자
		Calendar c = Calendar.getInstatnce();
		System.out.println(c); 
		
		
		int year = c.get(1);
		int year = c.get(Calendar.Year); // 이렇게 써도 파라미터1이 날라감 
		
		int month = c.get(2); 
		int month = c.get(Calendar.MONTH)+1;
		int date = c.get(Calendar.DAY_OF_MONTH); //이렇게 써주자 
		int day=c.get(Calendar.DAY_OF_WEEK); // 얘는 1부터 7까지 나옴. 
		//이런식으로 배열에 공백을 만들어줌. 
		/*String[] week = {"", "일", "월", "화", "수", "목", "금", "토"};
		System.out.println("오늘은 " + year + "년 " + month + "월 "
				+ date + "일(" + week[day] + ")입니다"); 
		*/
		
		
		//2020년 5월 20일 요일???? 이걸로 변경하고 싶음 Set method를 사용함.
		
		
		c.set(2020,5-1,20); // 이렇게 해야함 . 0~11 을 월로 인식하기 때문임. 
		day=c.get(Calendar.DAY_OF_WEEK);
		System.out.println("2020/5/20"+week[day]+"요일");
		
		
		//-------------------------------------------------------------------------------------------
		
		
		
		
		
		Int lastday=c.getActualMaximum(Calendar.Date);
		System.out.println(lastday); 
		
		//밑의 과정은 Date로 형변환 시키는 것임. 
		
		Date d = c.getTime();
		System.out.println(d);
		
		
		
		
		
		
		
		System.out.println();
		
		
		
		
		//d.getDay() ; 얘는 0부터 6까지 나옴 
		
		
		//확인해보면 DATE 도 5값 // DAY OF MONTH도 5값임  
		
		//인간은 이거 못 외움
		
		
		//Calendar 클래스 안에 상수변수가 있음. 
		//2가 필요하면
		
		
		
		
		
		
		
		
		
		
		//그냥 Calendar라고 하는 것에 의해서 쓰이고 있구나 하는 것임.
		//내부적으로는 묵시적형변환 +@@@@@ 뭐 이런것들이 돌아가고 있을 것임. 
		
		
		
		Date d= new Date(); // Date 밑에 마우스 커서 갖다 대면은 sql 도 나오고 date도 나옴. sql은 DB관련임 
		
		
		System.out.println(d);// 왜 주소가 아닌 이상한 값들이 찍힐까?
		//ice cream은 오브젝트에 있는 tostring을 반환한것 
		
		//Date 메소드에 toString 이 오버라이딩 되어 있음 -> 주소값 말고 다른거 찍으라고. 
		
		
		//toString 이 println에 참조변수 찍으면 내부적으로 그렇게 하라고 설계되어 있음 
		
		//출력할때 어떤 객체의 변수를 찍으라고 하면은 실제는 d를 호출하는게 아니라 d.toString() 이라는 다른 값을 호출해버림 
		
		Icecream ice =new Icecream();
		System.out.println(ice); 
		System.out.println(ice.toString());// 모든 클래스는 object라는 클래스를 상속 중  있네.  ice가 상속받은 object의 method 임 
		//밑에 커서 갖다 대보면 object class가 갖고 있음 
		//toString이 object값을 date클래스가 오버라이딩 했음. -> 그래서 주소값이 나오지 않는 것임.  
		//String으로 str 만들어서 찍으면 문자열이 찍힘 -> toString overriding 한 것임. 
		
		
		//오늘은 2022년 3월 23일(수)입니다. 
		int year =d.getYear() +1900 ;//관통하는 선이 deplicated 되었다는 뜻임. // 1900년에서부터 얼만큼 차이가 나는지 나오기 때문임.  
		int month=d.getMonth() +1;
		int date=d.getDate();
		int day=d.getDay();
		
		class Date{
			private int year;
			private int month; 
		}
		로 되어있는 것임 
		
		Date d = new Date();
		d.year 는 안됨 -> private라 
		변수들은 메소드를 통해서 제공 받아야함. 
		이래서 이런 메소드가 만들어짐 
		public int getYear() {
			retrun year;
		}
		 
		Date d = new Date();
		d.year 
		d.year=2000; 이게 불가능해서 이런 메소드가 생김
		
		public void setYear(int year) {
			this.year=year;
		}
		
		get하거나 set하긴 메소드가 필요함 
		
		외부에서 못고치게하려면 set 메소드를 안만들면 됨. 
		
		public으로 하면 남들도 보고 수정도 가능해져 버림. 
		
		보통 get이나 set 이 보이면 아 그런 멤버변수가 있구나! 생각할 수 있음.  
		
		
		Date랑 달리 Calendar 는 get이란 키워드만 사용함. 
		
		
		get(1) -> year를 return 하게 해준다 
		get(2) -> month를 return하게 해준다 이런식을 정의되어 있는 것임. 
 		get(3)
		
		
		abstract class Calendar{
			public static final int YEAR=1;
			public static final int MONTH=2;
		}
		
		get(1)
		get(Caelendar.YEAR)로 접근하겠다가 핵심임. 
		
		그러면 get() 은 연월일들을 뽑아 내는 것임. 
		
		수정하는 것은 set이 됨. 
		
		
		
		
		type name = new type();
		
		
		
		type name = new type();
		
		
		
		String[] week = {"일","월","화","수","목","금","토"};
		
		//월화수목금토일을 0부터 6까지로 표현하기 때문임. 
		System.out.println("오늘은"+year+"년"+month+"월"+date+"일("+week[day]+")입니다"); // 기준이 1900년임.  
		
			
		
		//오늘은 2022년 3월 23일(수)입니다
		
		
		
		
		
		

	}

}
