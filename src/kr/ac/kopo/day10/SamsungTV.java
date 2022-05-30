package kr.ac.kopo.day10;

public class SamsungTV implements TV {

	/*public SamsungTV() {
		
	}
	*/
	@Override
	public void poweron() {
		// TODO Auto-generated method stub
		System.out.println("TV전원  ON");
	
	}
	
	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("MUTE..");
	}

	@Override
	public void channelUp() {
		// TODO Auto-generated method stub
		System.out.println("MUqqeewq");
	}

	@Override
	public void channelDown() {
		// TODO Auto-generated method stub
		System.out.println("MUTE....");
	}

	@Override
	public void volumeUp() {
		
		// TODO Auto-generated method stub
		System.out.println("MUTE....");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("MUTE....");
	}

	@Override
	public void mute() {
		System.out.println("MUTE....");
		// TODO Auto-generated method stub

	}

}
