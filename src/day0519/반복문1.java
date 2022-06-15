package day0519;

import java.util.Scanner;

public class 반복문1 {

	public static void main(String[] args) {

		/* 숫자를 입력받아서
		 * 그 숫자가 소수인지 아닌지를 판단하는 코드를 작성하시오.
		 * 소수(1과 자기 자신을 제외한 나머지 숫자로 나누었을 때
		 * 나누어 떨어지지 않는 수 ex) 5) */
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요! > ");
		int num = s.nextInt();
		
		for(int i=2; i<=num; i++) {
			if(num == i) {
				System.out.println("소수입니다.");
			} else if (num%i==0) {
				System.out.println("소수가 아닙니다.");
				break;
			}
		}
		
		s.close();

	}

}
