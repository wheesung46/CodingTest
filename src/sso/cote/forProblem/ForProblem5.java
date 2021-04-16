package sso.cote.forProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForProblem5 { // 2741
	public static void main(String[] args) throws IOException {
		// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n<=100000) {
			for(int i=1; i<=n; i++) {
				System.out.println(i);
			}//end for
		}//end if
		
		br.close();
	}
}
