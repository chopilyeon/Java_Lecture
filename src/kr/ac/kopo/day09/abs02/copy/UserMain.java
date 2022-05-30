package kr.ac.kopo.day09.abs02.copy;




/*프린터를 선택하세요(1.Lg2.Samsubg)=>1
 * LG프린터에서 출력합니다
 * 
 * 프린터를 선택하세요(1.lg 2. Samsung)=>2
 * Samsung프린터에서 출력합니다 
 * 
 * 
 * 
 * 
 */


public class UserMain {

	public static void main(String[] args) {
		
		
		Menu Menu=new Menu();
		
		menu.process(); // process 란 method는 정의되어 있지 않음 -> 이클립스에서 이걸 고칠수 있는 2가지 방식을 제안해줌. 그러면 만들어줌. 
		
		//일반적인 사용자들은 메뉴라는 인스턴스 객체에서 process 쓰면 ~~가 나오더라. 내부적으로는 process 는 복잡하게 돌아가고 있음 
		
		//사용자들은 근데 알필요 없음. sellect 있고 뭐 다른거 있고 !~~ 사용자들은 모름 
		
		// private로 메소드를 묶어버리면 내부적으로만 사용할 수 있음

	}

}
