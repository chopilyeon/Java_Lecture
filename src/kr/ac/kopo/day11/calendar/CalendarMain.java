package kr.ac.kopo.day11.calendar;

public class CalendarMain {

	public static void main(String[] args) {
		
		
		//view.process 를 여기서 반복하던지 process 내부에서 반복해야함 인스턴스 객체를 만드는 행위를 반복하면 x 
		CalendarView view = new CalendarView();
		view.process(); 
		
	}

}
