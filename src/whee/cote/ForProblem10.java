package whee.cote;

import java.util.Scanner;

public class ForProblem10 {
	public static void main(String[] args) {
		//첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제  첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		//하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>=1 && num<=100) {
			for(int i=0; i<num; i++) {
				for(int j=1; j<=num; j++) {
					if(num-i<=j) {
						System.out.print("*");						
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		}
		else {
			System.out.println("범위를 벗어났습니다.");
		}
	}
}
