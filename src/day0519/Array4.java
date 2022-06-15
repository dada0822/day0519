package day0519;

public class Array4 {

	public static void main(String[] args) {

		int[][] score = {
				{10,20,30},
				{40,50,60},
				{70,80,90},
				{11,22,33}
		};
		
		// score.length : 2차원 배열 score의 길이 4개
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
			System.out.printf("score[%d][%d] = %d\n",i, j, score[i][j]);
			}
		}
		
		// 전체 합계
		int sum = 0;
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[i].length; j++) {
			sum += score[i][j];
			}
		}
		
		System.out.println("sum : " + sum);
		
	}

}
