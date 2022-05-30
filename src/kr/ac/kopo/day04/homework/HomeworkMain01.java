package kr.ac.kopo.day04.homework;

public class HomeworkMain01 {
	
	public static void main(String[] args) {
		
		//int step=3; 으로 지정할 수도 있음. 
		
		for(int dan=2;dan<=9;dan+=3) { //dan+=step //dan +=3 처럼 3씩 증가시킬수도 있음. 
			for(int i=1;i<=9;i++) {
			
				for(int j=dan;j<=9&&j<dan+3;j++) { // and나 or을 사용할 수 있음. , 이용해서 초기값이나 증가하는 값 감소하는 값 이용할 수 있음 조건식은 and나 or 이용하자. 
					System.out.printf("%d*%d=%d\t",j,i,j*i);
				}
				System.out.println();
				
			}
		}
			/*System.out.printf("%d*%d=%d\t", dan,i,dan*i)
			System.out.printf("%d*%d=%d\t", dan,i,dan*i)
			System.out.printf("%d*%d=%d\t", dan,i,dan*i)
			*/
				
				
				//x단 을 1단 앞에 출력하고 싶으면 x*0 자리에 몇단몇단 출력하면 됨 
 				for(int dan=2;dan<=9;dan+=3) { //dan+=step //dan +=3 처럼 3씩 증가시킬수도 있음. 
					for(int i=0;i<=9;i++) {
						
						for(int j=dan;j<=9&&j<dan+3;j++) { // and나 or을 사용할 수 있음. , 이용해서 초기값이나 증가하는 값 감소하는 값 이용할 수 있음 조건식은 and나 or 이용하자. 
							System.out.printf("%d*%d=%d\t",j,i,j*i);
					}
					 if(i==0)
						 System.out.printf("***%d단***\t", args);
						 else
							 System.out.printf("%d*%d=%d\t",j,i,j*i);
						for(int j=dan;j<=9&&j<dan+3;j++) { // and나 or을 사용할 수 있음. , 이용해서 초기값이나 증가하는 값 감소하는 값 이용할 수 있음 조건식은 and나 or 이용하자. 
							System.out.printf("%d*%d=%d\t",j,i,j*i);
						}
						System.out.println();
						
						/*package kr.ac.kopo.day04.homework;

						public class HomeworkMain01 {

							public static void main(String[] args) {
								
								int step = 3;
								
								for(int dan = 2; dan <= 9; dan += step) {
									
									for(int i = 0; i <= 9; i++) {
									
										for(int j = dan; j <= 9 && j < dan + step; j++) {
											if(i == 0)
												System.out.printf("*** %d단 ***\t", j);
											else
												System.out.printf("%d * %d = %d\t", j, i, j* i);
										}
										System.out.println();
										
									}
									System.out.println();
								}
								
							}
						}

						
						
						
				
				
		}
	}
*/

