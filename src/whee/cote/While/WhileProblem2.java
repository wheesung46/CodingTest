package whee.cote.While;

import java.util.Scanner;

public class WhileProblem2 {
	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		Scanner sc = new Scanner(System.in);
		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A > 0 && A < 10 && B > 0 && B < 10) {
				System.out.println(A + B);
			} else {
				System.out.println("범위를 벗어났습니다.");
				break;
			}

		}
	}
}
