package sso.coteWeek01;

import java.util.Scanner;

public class ForProblem2 {
	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		if(T>0) {
			for(int i=0; i<T; i++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				System.out.println("A+B="+(a+b));
			}//end for
		}else {
			System.out.println("개수 범위가 아닙니다.");
		}
		
//		else {
//			System.out.println("테스트 케이스의 개수를 초과했습니다.");
//		}
		
	}
}
