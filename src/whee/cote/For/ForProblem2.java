package whee.cote.For;

import java.util.Scanner;

public class ForProblem2 {
	public static void main(String[] args) {
		// 수정
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		for (int i = 0;; i++) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a > 0 && a < 10 && b > 0 && b < 10) {
				System.out.println(a + b);
			} else {
				System.out.println("범위를 벗어났습니다.");
				break;
			}
		}
	}
}
