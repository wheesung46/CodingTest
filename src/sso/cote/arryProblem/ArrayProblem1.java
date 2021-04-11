package sso.cote.arryProblem;

import java.util.Scanner;

public class ArrayProblem1 { // 10818
	public static void main(String[] args) {
		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

		// 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
		// 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] num = new int[N]; // 배열을 N 갯수 만큼 초기화

		if (N >= 1 && N <= 1000000) { // (1 ≤ N ≤ 1,000,000)

			for (int i = 0; i < N; i++) { // 입력받은 만큼 배열에 담기
				int tmp = sc.nextInt();

				if (tmp >= -1000000 && tmp <= 1000000) {
					num[i] = tmp;
				} // end if
			} // end for

			int max = num[0]; // 최대
			int min = num[0]; // 최소

			for (int j = 1; j < num.length; j++) {
				if (max < num[j]) {
					max = num[j];
				} // end if

				if (min > num[j]) {
					min = num[j];
				} // end if
			} // end for

			System.out.println("최대 : " + max + ", 최소 : " + min);

		} // end if

		sc.close();

	}
}
