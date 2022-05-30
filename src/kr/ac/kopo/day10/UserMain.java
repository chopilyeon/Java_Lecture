package kr.ac.kopo.day10;

public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//LGTV tv=new LGTV();
		//LGTV tv=new SamsungTV(); // 이건 에러남 
		//TV tv = new LGTV(); // 이러면 됨 -> 알아서 오버라이딩 된 거 호출할 수 있음. 
		TV tv = new SamsungTV();
		tv.poweron();
		tv.channelDown();
		tv.volumeUp();
		tv.channelUp();
		tv.channelDown();
		tv.poweron();
		tv.powerOff();
		
		
		
		
		
	}

}
