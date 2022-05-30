package kr.ac.kopo.day05;

public class ArrayMain07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] ar= new int[3][];
		
		for(int[] arr:ar) {
			System.out.println(arr);
			for(int i =0; i<ar.length;i++) {
				ar[i]=new int[(int)(Math.random()*3)+2];
				//ar[i]=new int[3+i] // 매번 다른 갯수의 1차원  배열이 만들어지게 됨  
			}
			
			// 이러면 차례로 각 배열의 원소값들을 뱉어낼 수 있음 
			for(int i=0;i<ar.length;i++) {
				for(int j=0;j<ar[i].length;j++) {
					ar[i][j]=i*10+(j+1);
					System.out.printf("ar[%d][%d],i,j );
				}
				System.out.println();
			}
			//1.5버전의 for 문 사용해보자 
			for(int[] arr:ar) {
				for(int num:arr) {
					System.out.print(num+" ");
				}
				System.out.println();
			}
			
			for(int i=0;i<ar.length;i++) {
				for(int num:ar[i]) {
					System.out.print(num+" ");
				}
				System.out.println();
			}
			
		
			
			
			
			
		}

	}

}
