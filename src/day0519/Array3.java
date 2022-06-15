package day0519;

public class Array3 {

	public static void main(String[] args) {

		// 2차원 배열 선언 1번 방법
		int[][] arr1 = new int[][] {{10,20,30},{40,50,60}};
		
		// 2차원 배열 선언 2번 방법
		int[][] arr2 = {{11,22,33},{44,55,66}};
		
		// 2차원 배열 선언 3번 방법(많이 씀!)
		int[][] arr3 = {
				{10,20,30},
				{40,50,60,100}, // 가변배열
				{70,80,90}		
		};
		System.out.println(arr3[1][3]);
		
		int [][] arr4 = {
						{11,12,13,14,15},
						{22,23,24},
						{46,47,48,48},
						{88,99}
		};
		
		System.out.println(arr4[2][1]);
		System.out.println(arr4.length);
		System.out.println(arr4[3].length);
	}
}
