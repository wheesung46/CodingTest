package whee.cote.Array;

import java.util.Scanner;

public class ArrayProblem1 {
	public static void main(String[] args) {
		// N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		// 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
		// 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] num = new int[N];

		if (N >= 1 && N <= 1000000) {
			for (int i = 0; i < N; i++) {
				int temp = sc.nextInt();

				if (temp >= -1000000 && temp <= 1000000) {
					num[i] = temp;
				}
			}
			int max = num[0];
			int min = num[0];

			for (int j = 1; j < num.length; j++) {
				if (max < num[j]) {
					max = num[j];
				}

				if (min > num[j]) {
					min = num[j];
				}
			}
			System.out.println(min + " " + max);
		}
		sc.close();
	}
}
