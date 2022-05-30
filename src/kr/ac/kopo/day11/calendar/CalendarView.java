package kr.ac.kopo.day11.calendar;

public class CalendarView {
	
	
	
		
		private Scanner sc = new Scanner(System.in);
				
				
		private int getInt(String msg) {
			System.out.print(msg);
			return Integer.parseInt(sc.nextLine());
		}
		
		public void process() {
			CalendarUtil util=new CalendarUtil();
			loop:while(true) {
			int type = getInt("항목을 선택하세요(1.특정년도 2.특정월 3.종료):");
			switch(type) {
			case 1:
				int year = getInt("년도를 입력하세요:");
				//System.out.println("특정년도 선택");getInt 함수에 이미 만들어놈.
				util.showByYear(year);
				
				break;
			case 2:
				year=getInt("년도를 입력하세요:");
				month=getInt("월을 입력하세요:");
				util.showByMonth(year,month);
				//System.out.println("특정월 선택");
				break;
			case 3:
				System.out.println("종료 선택");
				System.exit(0); // ~이유 때문에 종료한다는 의미 0이 붙으면 정상적으로 종료한다는 의미임 // class 명으로 접근하기 때문에 static  
				break loop;// 반복문 빠져 나가는 것임. 근데 이게 종료를 의미하지 않을 수도 있음. 밑에 다른 명령어가 있을 수 있음 // 우리가 만든 코드에선 상관 없음. 
				//접근제한자가 public 우리 패키지안에 system이 없는데 쓰고 있으므로 public임 . 
			}
	}

}
