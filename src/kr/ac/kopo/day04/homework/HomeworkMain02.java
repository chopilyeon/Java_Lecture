package kr.ac.kopo.day04.homework;

public class HomeworkMain02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int snail=0,hour=0;
		
		while(snail<100) {
			snail+=5;
			snail+=snail<50?-1:-2; //snail이 50보다 작으면 -1로 결정. 
			System.out.println("["+ ++hour+"시간후]달팽이가 올라간 총 높이:"+snail+"M");
		}
		
		
/*    while((snail+=5)<100){
 * 			snail+=snail<50?-1:-2;
 * 			System.out.println("["+ ++hour +"시간후] 달팽이가 올라간 총 높이:"
 *											+snail+"M");
 *	  }
 */
		
		
		
		
		
	}

}
