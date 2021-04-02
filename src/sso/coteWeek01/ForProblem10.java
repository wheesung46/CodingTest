package sso.coteWeek01;

import java.util.Scanner;

public class ForProblem10 {
	public static void main(String[] args) {
		// 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		// 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
		
		// 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		
		Scanner sc =  new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		if(N>=1 && N<=100) { // 1부터 100까지만 입력
			for(int i=1; i<=N; i++) { // 1부터 N까지 줄
				for(int j=1; j<=N-i; j++) { // 1부터 N-i까지 공백을 만든다
					System.out.print(" ");
				}
				for(int k=0; k<i; k++) { // 공백만든 후 다음칸에 *를 표시
					System.out.print("*");
				}
				System.out.println();
			}
		}else {
			System.out.println(N+"은 범위가 아닙니다.");
		}
		
	}
}
