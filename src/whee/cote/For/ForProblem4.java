package whee.cote.For;

import java.io.BufferedReader;

public class ForProblem4 {
	public static void main(String[] args) {
		//Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와 BufferedWriter를 사용할 수 있다. 
		//BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		//첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는 1 이상, 1,000 이하이다.
		for(int i = 0; ;i++) {
			BufferedReader num1 = new BufferedReader(num1);
			//BufferedReader num2 = new BufferedReader(num2);
			int a = num1.read();
			int b =0 ;
			//int b = num2.read();
			if(a>0 && a<10 && b>0 && b<10) {
				System.out.print(a + b);
			}
			else {
				System.out.println("범위를 벗어났습니다.");
				break;
			}
		}
	}
}
