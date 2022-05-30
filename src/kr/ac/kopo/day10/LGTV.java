package kr.ac.kopo.day10;



public class LGTV implements TV {

	private boolean power;
	private int volumeSize;
	private int channelNo;
	
	//여기에도 private static final int MAX_CHANNEL_SIZE=100; // 클래스에도 이런거 써줘도 됨. LG자체적으로 만든 채널 최대치 
	protected static final int MAX_CHANNEL_SIZE=100; //이런식으로 접근제한자 달 수도 있음. 상속받은놈들은 쓸 수 있게 됨. 
	//LG에서만 쓰고 싶은 거니까. LG티비를 상속받은 애들만 쓸 수 있음. 
	
	
	
	
	public LGTV() {
		System.out.println("LGTV를 구매했습니다");
		power=false;
		volumeSize=10;
		channelNo=3;
		
	}
	
	
	
	
	
	
	
	@Override
	
	/*public void poweron(int a ) {
		// TODO Auto-generated method stub
		
	}

* int a 저런거 들어가는 순간 오버라이드가 아님 
*/
	
	
	
	
	
	
	public void poweron() {
		power=true;
		// TODO Auto-generated method stub
		System.out.println("전원을 켭니다");
	}

	
	
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
		power=false;
		System.out.println("전원을 끕니다");
	}

	
	
	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		channelNo = ++channelNo %LGTV.MAX_CHANNEL_SIZE; // LGTV에서 정의한 상수값인지 TV에서 저의한 상수값인지 알 수 있다는 뜻임. 
		System.out.println("채널을 올립니다");
		info();
	}

	
	
	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		if(channelNo==0)
			channelNo=LGTV.MAX_CHANNEL_SIZE;
		channelNo--;
		System.out.println("음량을 낮춥니다");
		info();
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		if(volumeSize<TV.MAX_VOLUME_SIZE)//TV라는 인터페이스에서 알려주고 있음. 이래서 static을 사용함 어디에서 정의했는지 알기위해 TV.이런식으로 다 써주자.  
			volumeSize++;
		System.out.println("음량을 높입니다");
		info();
	}

	@Override
	public void volumeDown() {
		if(volumeSize>TV.MIN_VOLUME_SIZE) {
			volumeSize--;
		}
		// TODO Auto-generated method stub
		System.out.println("음량을 낮춥니다");
		info();
	}

	@Override
	public void mute() {
		volumeSize=TV.MIN_VOLUME_SIZE;
		System.out.println("음소거중입니다");
		info();
		// TODO Auto-generated method stub
		
	} 
	
	public void info() {
		System.out.println("채널번호:"+channelNo+",음량크기:"+volumeSize);
	}
	
	
	
	
	
	// 추상메소드를 갖고 있는 것임. //source 메뉴에서도 method 끌고 올 수 있음. 
	
	//주석 달아놓으면 보임. 
	//public 에는 문서화 주석 달음 
	
	//나머지에는 문서화 주석을 달고 있지 않음. 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
