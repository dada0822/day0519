package day0519;

public class Debugging {

	public static void main(String[] args) {

		// F5(step into) : 한 문장씩 실행. 메서드를 만나면 메서드로 진입 안 함
		// F6(step over) : 한 문장씩 실행. 메서드를 만나면 메서드 안으로 진입
		int i = 0;
		for(i=1; i<=10; i++) ;{
			System.out.println("현재 숫자는 " + i);
		}

	}

}
