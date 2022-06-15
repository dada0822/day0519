package day0519;

public class Main1 {

	public static void main(String[] args) {
		
		if(args.length != 2) {
			System.out.println("값의 개수가 부족합니다.");
			System.exit(0); // 강제종료
		}
		
		String strtNum1 = args[0];
		String strtNum2 = args[1];
		
		int num1 = Integer.parseInt(strtNum1);
		int num2 = Integer.parseInt(strtNum2);

		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
		
		// 10 20 / "가" "나"
	}

}
