package whee.cote.For;

import java.util.Scanner;

public class ForProblem1 {
	public static void main(String[] args) {
		// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num >= 1 && num <= 9) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(num + " * " + i + " = " + num * i);
			}
		} else
			System.out.println("범위를 벗어났습니다.");
	}
}
