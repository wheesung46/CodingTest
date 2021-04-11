package whee.cote.For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ForProblem4 {
	public static void main(String[] args) throws IOException {
		// Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와
		// BufferedWriter를 사용할 수 있다.
		// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		// 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는
		// 1 이상, 1,000 이하이다.
		for (int i = 0;; i++) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			StringTokenizer st;

			int T = Integer.parseInt(br.readLine());
			// new StringTokenizer(입력받은 문자, 문자열을 나눌 구분자)
			st = new StringTokenizer(br.readLine(), " ");
			bw.flush(); // flush 버퍼에 저장된 값 출력후 버터 비움
		}
	}
}
