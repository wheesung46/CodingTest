package whee.cote;

import java.util.Scanner;

public class ForProblem6 {
	public static void main(String[] args) {
		//자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>=1 && num<=100000) {
			for(int i=num; i>=1; i--) {
				System.out.println(i);
			}
		}
		else
			System.out.println("범위를벗어났습니다.");
	}
}
