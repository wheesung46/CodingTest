package sso.cote.ifProblem;

import java.util.Scanner;

public class Ifproblem2 { // 9498
	public static void main(String[] args) {
		// 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score>=0 && score<=100) {
			if(score>=90 && score<=100) {
				System.out.println("점수 : A");
			}else if(score>=80 && score<=89) {
				System.out.println("점수 : B");
			}else if(score>=70 && score<=79) {
				System.out.println("점수 : C");
			}else if(score>=60 && score<=69) {
				System.out.println("점수 : D");
			}else {
				System.out.println("점수 : F");
			}
		}else {
			System.out.println("점수가 아닙니다.");
		}
		sc.close();
	}
}
