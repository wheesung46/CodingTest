package sso.cote.whileProblem;

import java.util.Scanner;

public class WhileProblem2 {
	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		
		// 입력은 여러 개의 테스트 케이스로 이루어져 있다.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a>0 && b<10) {
				System.out.println(a+b);
			}else {
				System.out.println("a와 b의 범위가 아닙니다.");
			}
		}// end while
	}
}
