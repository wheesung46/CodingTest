package whee.cote.For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForProblem1_mod {
	public static void main(String[] args) throws IOException {
		// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		// 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		if(N>=1 && N<=9) {
			for(int i=1; i<=9; i++) {
				System.out.println(N + " * " + i + " = " + (N*i));
			}
		}
		else {
			System.out.println("범위를 벗어났습니다.");
		}
	}
}
