package sso.coteWeek01;

import java.util.Scanner;

public class Ifproblem1 {
	public static void main(String[] args) {
		// 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if(num1>num2) {
			System.out.println(">");
		}
		else if(num1<num2) {
			System.out.println("<");
		}
		else
			System.out.println("==");
	}
}
