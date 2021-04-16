package sso.cote.forProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForProblem3 { // 8393
	public static void main(String[] args) throws IOException {
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		// 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n>=1 && n<=10000) {
			System.out.println("1부터 "+n+"까지 합 : "+sum(n));
		}else {
			System.out.println("n의 범위가 아닙니다.");
		}
		
		br.close();
	}
	
	public static int sum(int n) {
		int sum = 0;
		
		for(int i=0; i<=n; i++) {
			sum+=i;
		}
		
		return sum;
	}
}
