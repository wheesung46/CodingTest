package whee.cote;

import java.util.Scanner;

public class ForProblem3 {
	public static void main(String[] args) {
		//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		if(num>=1 && num<=10000) {
			for(int i = 1; i<=num; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		else
			System.out.println("범위를 벗어났습니다.");
	}
}
