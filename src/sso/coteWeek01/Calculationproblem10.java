package sso.coteWeek01;

import java.util.Scanner;

public class Calculationproblem10 { 
	public static void main(String[] args) {
		// (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
		// (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
		// 세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=2 && a<=10000 && b>=2 && b<=10000 && c>=2 && c<=10000) {
			System.out.println((a+b)%c);
			System.out.println((a%c)+(b%c)%c);
			System.out.println((a*b)%c);
			System.out.println((a%c)*(b%c)%c);
		}
		else
			System.out.println("범위를 벗어났습니다.");
	}
}