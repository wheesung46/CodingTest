package sso.cote.forProblem;

import java.util.Scanner;

public class ForProblem3 { // 8393
	public static void main(String[] args) {
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		// 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		if(n>=1 && n<=10000) {
			for(int i=0; i<=n; i++) {
				sum+=i;
			}
			System.out.println("1부터 "+n+"까지 합 : "+sum);
		}else {
			System.out.println("n의 범위가 아닙니다.");
		}
	}
}
