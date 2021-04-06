package whee.cote;

import java.util.Scanner;

public class CalculationProblem11 {
	public static void main(String[] args) {
		//(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
		//(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int a = num1 * (num2%10);
		int b = num1 * ((num2/10)%10);
		int c = num1 * (num2/100);
		int d = num1 * num2;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
