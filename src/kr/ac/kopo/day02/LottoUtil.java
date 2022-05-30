package kr.ac.kopo.day02;
import java.util.Random;
/**
 * 로또와 관련된 여러가지 기능 클래스
 * 
 * @author DA
 *
 */
public class LottoUtil {
	/**
	 * 오늘의 로또 확률을 알려주는 메소드
	 */
	
	public void todayProbability() {
		
		Random r = new Random();
		int p = r.nextInt(101); // 임의의 정수형의 난수를 생성하겠다는 뜻임. 범위를 지정할수도 있음. 0~100 사이의 변수만 추출할수 있다는 의미임. -> 어떤 값을 101로 나눠라 -> 즉 나머지는 0~100까지만 나오게 됨 
		
		System.out.println("오늘의 로또 확률은"+p+"%입니다");
	}

}
