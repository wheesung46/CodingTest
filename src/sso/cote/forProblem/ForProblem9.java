package sso.cote.forProblem;

import java.util.Scanner;

public class ForProblem9 { // 2438
	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if(N>=1 && N<=100) {
			for(int i=0; i<=N; i++) {
				for(int j=0; j<i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
				
		}else {
			System.out.println("N의 범위가 아닙니다.");
		}
	}
}
