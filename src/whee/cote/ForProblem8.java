package whee.cote;

import java.util.Scanner;

public class ForProblem8 {
	public static void main(String[] args) {
		//두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		for(int i = 1; ;i++) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a>0 && a<10 && b>0 && b<10) {
				System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
			}
			else {
				System.out.println("범위를 벗어났습니다.");
				break;
			}
		}
	}
}
