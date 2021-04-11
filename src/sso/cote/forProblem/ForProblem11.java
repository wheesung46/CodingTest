package sso.cote.forProblem;

import java.io.IOException;
import java.util.Scanner;

public class ForProblem11 {
	public static void main(String[] args) throws IOException {
		// 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
		
		// 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
		// 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
		
		// -----> Bufferer로 풀어보는게 좋을거같음!
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(); // 입력 갯수
		int X = sc.nextInt(); // 비교할 수
		
		if(N>=1 && X<=10000) {
			for(int i=0; i<N; i++) { // 10개만 입력하도록 해야되나...?
				int A = sc.nextInt();
				
				if(A<X) {
					System.out.print(A+" ");
				}
			}//end for
		}else {
			System.out.println("범위가 아닙니다.");
		}
		
		sc.close();
		
	}
}
