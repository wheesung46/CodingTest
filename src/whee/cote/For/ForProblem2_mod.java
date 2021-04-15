package whee.cote.For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ForProblem2_mod {
	public static void main(String[] args) throws IOException {
		// 수정
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
		// 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st = null;
		for (int i = 0; i < T; i++) {
			String num = br.readLine();
			st = new StringTokenizer(num, " ");

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			if (A > 0 && A < 10 && B > 0 && B < 10) {
				bw.write((A + B) + "\n");
			} else {
				System.out.println("범위를 벗어났습니다.");
				break;
			}
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
