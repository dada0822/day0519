package day0519;

public class Continue1 {

	public static void main(String[] args) {

//		for (int i=1; i<=10; i++) {
//		if(i%3==0) {
//			break;
//		}
//		System.out.println(i);
//	}
	
//	for (int i=1; i<=10; i++) {
//		if(i%3==0) {
//			continue;
//		}
//		System.out.println(i);
//	}
	
	
	String s = "green computer academy";
	int count = 0;
	// charAt(인덱스)
//	for (int i=0; i<s.length(); i++) {
//		if(s.charAt(i) == 'e') {
//			count++;
//		}
//	}

	// continue 사용
	for (int i=0; i<s.length(); i++) {
		if(s.charAt(i) != 'e') {
			continue;
		}
		count++;
	}
	System.out.println(count);

	
//	test: for(int i=1; i<=5; i++) {
//		int num = 0;
//		while (true) {
//			System.out.print(++num + "\t");
//			if(num == i) {
//				System.out.println();
//				continue test;
//			}
//		}
//	}
	
	
	int max = 0;
	int num = 0;
	
	test: for(int i=1; i<=5; i++) {
		max = i;
		num = 1;
		while (true) {
			System.out.print(num + "\t");
			
			if(num == max) {
				System.out.println();
				continue test;
			}
			num++;
		}
	}

	}

}
