package kr.ac.kopo.day03;

public class exam4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print('-');
			}
			for(int j=1;j<=6-i;j++){
				System.out.print('*');
			}
			System.out.println();
		}

	}

}
