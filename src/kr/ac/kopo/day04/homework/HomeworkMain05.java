package kr.ac.kopo.day04.homework;

public class HomeworkMain05 {
//시작점으로도 별을 만들어낼수 있음
//별의 start가 증가하다 감소하는 형태임 
//별의 start전에는 -찍어 주면 됨 -> 이런식으로 코드를 생성함. 
	public static void main(String[] args) {

		int start = 1;
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 5; j++) {
				if(j < start) {
					System.out.print('-');
				} else {
					System.out.print('*');
				}
			}
			System.out.println();
			if(i < 5) {
				start++;
			} else {
				start--;
			}
		}
		
		/*
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= 5; j++) {
					if(j < i) {
						System.out.print('-');
					} else {
						System.out.print('*');
					}
				}
			} else {
				for(int j = 1; j <= 5; j++) {
					System.out.print(j < 10-i ? '-' : '*');
				}
			}
			System.out.println();
		}
		*/
		
		/*
		int star = 5;
		for(int i = 1; i <= 9; i++) {
			
			for(int j = 1; j <= 5-star; j++) {
				System.out.print('-');
			}
			for(int j = 1; j <= star; j++) {
				System.out.print('*');
			}
			
			System.out.println();
			if(i < 5) {
				star--;
			} else {
				star++;
			}
		}
		*/
		
		/*
		for(int i = 1; i <= 9; i++) {
			if(i <= 5) {
				for(int j = 1; j <= i-1; j++) {
					System.out.print('-');
				}
				for(int j = 1; j <= 6-i; j++) {
					System.out.print('*');
				}
				
			} else {
				for(int j = 1; j <= 9-i; j++) {
					System.out.print('-');
				}
				for(int j = 1; j <= i-4; j++){
					System.out.print('*');
				}
			}
			System.out.println();
		}
		*/
	}
}
