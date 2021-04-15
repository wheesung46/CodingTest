package whee.cote.For;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ForProblem5_mod {
	public static void main(String[] args) throws Exception{
		// 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N>0 && N<=100000) {
			for(int i=1; i<=N; i++) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("범위를 벗어났습니다.");
		}
		br.close();
	}
}
