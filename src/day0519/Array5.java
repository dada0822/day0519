package day0519;

public class Array5 {

	public static void main(String[] args) {
		
//		System.out.printf("%4d\n", 1000);
//		System.out.printf("%4d", 30); // 네자리의 형태로 맞춰줌
//		
//		System.out.printf("%5.1f\n", 100.12345); // 실수 %f
//		System.out.printf("%4d", 30);

		// 성적 입력
		int[][] score = {
						{100,100,100},
						{90,95,97},
						{80,85,91},
						{60,65,70},
						{50,55,60}
		};
		
		// 과목별 합계
				int korTotal = 0, engTotal = 0, mathTotal = 0; 
				
				System.out.println("번호    국어   영어   수학     총점    평균");
				System.out.println("======================================");
				
				// score.length : 행의 개수 총 5개
				for(int i=0; i<score.length; i++) {
					
					int sum = 0; // 개인별 총점
					float avg = 0.0f; // 개인별 평균
					
					System.out.printf("%3d", i+1);
					
					korTotal += score[i][0];
					engTotal += score[i][1];
					mathTotal += score[i][2];
					
					// score[i].length : score 내의 하나의 배열 내의 값 개수(열 개수)
					for(int j=0; j<score[i].length; j++) {
						System.out.printf("%6d", score[i][j]);
						sum += score[i][j];
					}
					
					avg = (float)sum/score[i].length;
					System.out.printf("\t%6d\t%6.1f\n",sum, avg);
				}
				System.out.println("======================================");
				System.out.printf("총점: %4d %5d %5d", korTotal, engTotal, mathTotal);
				
	}

}
