package whee.cote.For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForProblem3_mod {
	public static void main(String[] args) throws IOException {
		// n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		// 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		if(n>=1 && n<=10000) {
			for(int i=1; i<=n; i++) {
				sum += i;
			}
			System.out.println(sum);
		}else {
			System.out.println("범위를 벗어났습니다.");
		}
		br.close();
	}
}
