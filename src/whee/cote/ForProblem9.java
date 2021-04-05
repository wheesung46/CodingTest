package whee.cote;

import java.util.Scanner;

public class ForProblem9 {
	public static void main(String[] args) {
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제 
		//첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>=1 & num<=100) {
			for(int i=1; i<=num; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}
		}
		else {
			System.out.println("범위에서 벗어났습니다.");
		}
	}
}
