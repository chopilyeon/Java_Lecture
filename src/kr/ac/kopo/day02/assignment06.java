package kr.ac.kopo.day02;

public class assignment06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int upperCnt='Z'-'A'+1;
		int lowerCnt='z'-'a'+1;
		
		char ch= 'B';
		if(ch>='A'&&ch<='Z') {
			ch=(char)(ch+('a'-'A'));
			
		}else if(ch>='a'&&ch<='z') {
			ch=(char)(ch-('a'-'A'));

		}

	}
}