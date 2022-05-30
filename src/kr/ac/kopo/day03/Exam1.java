package kr.ac.kopo.day03;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
				
			
		}
			System.out.print('\n');
	}

	
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(j);
			}
		System.out.print("\n");
		}
		
		
		
		
		
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(j+i-1);
			}
		System.out.print("\n");
		}
		
		
		System.out.print("\n");
		
		for(int i=5;i>=1;i--) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+j-1);
			}
		System.out.print("\n");
		}
		
		
		System.out.println("\n");
		
		
		
		for(int i=1;i<=5;i++) {
			for(int j=6-i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		
		
		
		
		System.out.println("\n");
		
		
		//blockscope 안에서 i를 지정했으므로 그안의 이중 for문이어도 살아있게 됨 
		for(int i=1;i<=5;i++) {
			for(int j=i;j<=5;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
		
		
		
		
		
		
		
		System.out.println("\n");
		
		
		//임의의 i열부터 별을 찍음 -> 이걸 이용해서 if문을 사용해보자.  
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(j<i) {
					System.out.print('-');
				}else {
					System.out.print('*');
				}
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		
		
		
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print('-');
			}
			for(int j=1;j<=6-i;j++){
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		
		
		System.out.println();
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print("-");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		
		/*for(int i=1;i<=9;i++) {
			if(i<=5) {
				for(int j=1;j<=i;j++) {
					System.out.print('*');
				}
			}else {
				for(int j=1;j<=10-i;j++)
					;
				System.out.print('*');
			}
			System.out.println();
		}
		for 뒤에 ;가 붙으면 그냥 for 이 끝내라는 뜻이므로 쓰면 안됨 뒤에 명령문을 시행 안함. 
		*/  
		
		for(int i=1;i<=9;i++) {
			if(i<=5) {
				for(int j=1;j<=i;j++) {
					System.out.print('*');
				}
			}else {
				for(int j=1;j<=10-i;j++)
					;
				System.out.print('*');
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		/*for(int i=1;i<=5;i++) {
			for(int j=6-i,j>=1;j--) {
				System.out.println();
			}
		}
		*/
		
		
		
		
		
	}
}