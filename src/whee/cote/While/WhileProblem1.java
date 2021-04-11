package whee.cote.While;

import java.util.Scanner;

public class WhileProblem1 {
	public static void main(String[] args) {
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		//입력의 마지막에는 0 두 개가 들어온다.
		while(true) {
			Scanner sc = new Scanner(System.in);
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			if(A>0 && A<10 && B>0 && B<10) {
				if(A==0 && B==0) {
					System.out.println("종료합니다.");
					break;
				}
				System.out.println(A+B);
			}
			else if(A==0 && B==0) {
				System.out.println("종료합니다.");
				break;
			}
			else {
				System.out.println("범위를 벗어났습니다.");
				break;
			}
			
		}
	}
}
