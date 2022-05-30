package kr.ac.kopo.day11.calendar;

import java.util.Calendar;

public class CalendarUtil {
	
	
	
	
	private Calendar c; 
	
	public CalendarUtil() {
		c=Calendar.getInstance(); // 매번 현재에 대한 정보를 갖고 오는 게 아니므로 이렇게 써도 괜찮음 생성자에 써버리자. 이렇게 하면 현재에 대한 정보를 얻게 됨. 
	}
	
	
	
	public void showByYear(int year) {
		for(int month=1;month<=12;month++) {
			showByMonth(year,month);
		}
	}
	//순서도 상관 없음 -> class 자체를 loading 해버리므로
	//1일이 언제인지. 마지막날이 언제인지 알아야 함. 
	//Calendar에는 set 할 수 있는 method가 존재함. 
	public void showByMonth(int year,int month) {
		System.out.println("<"+year+"년"+month+"월>");
		//Calendar c = Calendar.getInstance(); 
		
		
		// year/month/1
		c.set(year,month-1,1);
		int week = c.get(Calendar.DAY_OF_WEEK);
		int lastDay=c.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		showByDay(week,lastDay);
		
	}
	
	
	
	
	// 이 자체 메소드만을 쓸 일은 거의 없을 거 같으므로 이렇게 씀. 
	private void showByDay(int week,int lastDay) {
		
		
		System.out.println(")
		
		System.out.println("--------------------------------------------------------------------");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("-------------------------------------------------------------------------------");
		int cnt=0;
		for(int i=1;i<week;i++) {
			System.out.print("\t");
			++cnt;
		}
		for(int date=1;date<=lastDay;date++) {
			System.out.println(date+"\t");
			if(date==lastDay||++cnt%7==0) { // 이렇게 해도 되는데 계속 물어보는 형태를 취하게 됨. 
				System.out.println();
			}
		}
		if(cnt %7 !=0) {
			//System.out.println(); //if(date==lastDay||++cnt%7==0) { // 이렇게 해도 되는데 계속 물어보는 형태를 취하게 됨. 
			System.out.println();
			//위에거 대신 if문 써서 이렇게 써도 됨 합집합으로 써버리면은 계속 물어봐야 됨. 자리 바뀌면? 
		}
		System.out.println("------------------------------------------------------------------------");
		
		
		
	}
	
	
	

}
