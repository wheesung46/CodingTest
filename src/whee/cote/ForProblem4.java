package whee.cote;

import java.util.Scanner;

public class ForProblem4 {
	public static void main(String[] args) {
		//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
		//BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		for(int i = 0; ;i++) {
			Scanner sc = new Scanner(System.in);
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			if(a>0 && a<10 && b>0 && b<10) {
				System.out.println(a + b);
			}
			else {
				System.out.println("범위를 벗어났습니다.");
				break;
			}
		}
	}
}
