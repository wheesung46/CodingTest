package sso.cote.arryProblem;

import java.util.Scanner;

public class ArrayProblem3 { //2577
	public static void main(String[] args) { 
		// 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		// 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
		// 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		
		// 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int[] arr = new int[10];
		int tmp=0;
		
		if((A>=100 && A<=1000)&& (B>=100 && B<=1000)&& (C>=100 && C<=1000)) {
			int multi = A*B*C;
			System.out.println(multi);
			
			while(multi>0) {
				tmp = multi%10; // 곱을 10으로 나눈 나머지를 tmp에 저장
				multi /= 10; // 10씩 줄어든것을 다시 곱에 저장
				System.out.println(tmp);
			
				switch(tmp) {
				case 0:
					arr[0] ++;
					break;
				case 1:
					arr[1] ++;
					break;
				case 2:
					arr[2] ++;
					break;
				case 3:
					arr[3] ++;
					break;
				case 4:
					arr[4] ++;
					break;
				case 5:
					arr[5] ++;
					break;
				case 6:
					arr[6] ++;
					break;
				case 7:
					arr[7] ++;
					break;
				case 8:
					arr[8] ++;
					break;
				case 9:
					arr[9] ++;
					break;
				}
			}
			
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]);
			}
			
		}
		
		
		
		
		
		
		
	}
}
