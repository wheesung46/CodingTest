package sso.cote.forProblem;

import java.util.Scanner;

public class ForProblem7 { // 11021
	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		if(T>0) {
			for(int i=0; i<5; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt(); 
				System.out.println("Case#"+(i+1)+":"+(a+b));
			}
		}else {
			System.out.println("테스트 케이스의 개수 범위가 아닙니다.");
		}
	}
}
