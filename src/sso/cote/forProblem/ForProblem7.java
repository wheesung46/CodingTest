package sso.cote.forProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForProblem7 { // 11021
	public static void main(String[] args) throws IOException {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		if(T>0) {
			for(int i=0; i<5; i++) {
				int a = Integer.parseInt(br.readLine());
				int b = Integer.parseInt(br.readLine());
				
				if(a>0 && a<10) {
					System.out.println("Case#"+(i+1)+":"+sum(a,b));
				}
			}
		}else {
			System.out.println("테스트 케이스의 개수 범위가 아닙니다.");
		}
		
		br.close();
	}
	
	public static int sum(int a, int b) {
		return a+b;
	}
}
