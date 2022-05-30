package kr.ac.kopo.day10;



public interface TV {
	int MIN_VOLUME_SIZE=0;
	
	/*public static final 이것도 자동으로 생성 interface에서는 자동으로 생성이 됨 */int MAX_VOLUME_SIZE=50; 
	//static 이 필요한 이유? 
	
	
	
	
	/*
	 * 전원을 켜는 기능
	 * 
	 */
	
	
	/* public abstract 생략이 되었을 뿐임. interface에서는 그냥 자동으로 만들어줌  */void poweron();
	void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
	
	
}
