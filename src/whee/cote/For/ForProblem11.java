package whee.cote.For;

import java.util.Scanner;

public class ForProblem11 {
	public static void main(String[] args) {
		//정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		//첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		//둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int num = sc.nextInt();
		int a[] = null;
		for(int i=0; i<count; i++) {
			a[i] =  sc.nextInt();
		}
		for(int j=0; j<count; j++) {
			if(a[j]<num) {
				System.out.println(a[j]);
			}
		}
	}
}