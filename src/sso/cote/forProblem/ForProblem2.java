package sso.cote.forProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForProblem2 { // 10950
	public static void main(String[] args) throws IOException {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		if(T>0) {
			for(int i=0; i<T; i++) {
				int a = Integer.parseInt(br.readLine());
				int b = Integer.parseInt(br.readLine());
				
				if(a>0 && b<10) {
					System.out.println(add(a,b));
				}
			}//end for
		}else {
			System.out.println("개수 범위가 아닙니다.");
		}
		
		br.close();
		
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
}
