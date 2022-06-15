package day0519;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {


		int[] scores = {95, 81, 62};
		
		// 배열의 합계와 평균
		int sum = 0;
		
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총합 : " + sum);
		
		float avg = (float)sum/scores.length;
		// float / int > float/float = float
		System.out.println("평균 : " + avg);
		
		System.out.println("------------------------");
		
		/* scores2의 배열값 중에서 
		 * 최대값과 최소값을 찾아서 출력 */
		
		int[] scores2 = {72, 36, 85, 34, 92, 80, 64, 50};
		
		int max = scores2[0];
		int min = scores2[0];
		
		for (int i=1; i<scores2.length; i++) {
			if(scores2[i] > max) {
				max = scores2[i];
			} else if (scores2[i] < min) {
				min = scores2[i];
			}
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

		System.out.println("------------------------");
		
		int[] numArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.println(Arrays.toString(numArr));
		
		/* 숫자의 순서를 섞어서 출력 */
		
//		for(int i=0; i<10; i++) {
//			int n = (int)(Math.random()*10);
			
		for (int i=0; i<numArr.length; i++) {
			int n = (int)(Math.random()*numArr.length);
			int temp = numArr[i];
			numArr[i] = numArr[n];
			numArr[n] = temp;
			
//			int temp = numArr[0];
//			numArr[0] = numArr[n];
//			numArr[n] = temp;
		}
		
		System.out.println(Arrays.toString(numArr));
		
	}

}
