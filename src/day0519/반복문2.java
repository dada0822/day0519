package day0519;

import java.util.Scanner;

public class 반복문2 {

	public static void main(String[] args) {

		/* while문과 Scanner를 이용하여 키보드로 입력된 데이터로
		 * 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성 */
		
		Scanner scan = new Scanner(System.in);
		
//		int money = 0;
//		int bank = 0;
//		
//		while (true) {
//			System.out.println("----------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("----------------------------");
//			System.out.print("선택 > ");
//			int num = scan.nextInt();
//			
//			if (num == 1) {
//				System.out.print("예금액 > ");
//				money = scan.nextInt();
//				bank += money;
//			} else if(num == 2) {
//				System.out.print("출금액 > ");
//				money = scan.nextInt();
//				bank -= money;
//			} else if (num == 3) {
//				System.out.println("잔고 > " + bank);
//			} else if (num == 4) {
//				System.out.println("프로그램 종료");
//				break;
//			} else {
//				System.out.println("숫자를 잘못 입력했습니다.");
//			}
//		}

		
		// 강사님1
		
//		int balance = 0;
//		
//		end : while (true) {
//			System.out.println("----------------------------");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("----------------------------");
//			System.out.print("선택 > ");
//			int menu = scan.nextInt();
//			
//			switch(menu) {
//			case 1:
//				System.out.print("예금액 > ");
//				balance += scan.nextInt();
//				break;
//			case 2:
//				System.out.print("출금액 > ");
//				balance -= scan.nextInt();
//				break;
//			case 3:
//				System.out.println("잔고 > " + balance);
//				break;
//			case 4:
//				break end; // 이름을 붙여줌으로써 for문 탈출
//			} 
//		}
//		System.out.println("프로그램 종료");
		
		// 강사님2
		int balance = 0;
		boolean run = true;
		
		while (run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.print("선택 > ");
			int menu = scan.nextInt();
			
			switch(menu) {
			case 1:
				System.out.print("예금액 > ");
				balance += scan.nextInt();
				break;
			case 2:
				System.out.print("출금액 > ");
				balance -= scan.nextInt();
				break;
			case 3:
				System.out.println("잔고 > " + balance);
				break;
			case 4:
				run = false;
				break; // switch문 빠져나가기
			} 
		}
		System.out.println("프로그램 종료");
		
		scan.close();
	}

}
