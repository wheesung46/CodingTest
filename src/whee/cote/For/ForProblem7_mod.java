package whee.cote.For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ForProblem7_mod {
	public static void main(String[] args) throws Exception{
		// 테스트 케이스 개수 T가 주어진다.
		// 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오. (0 < A, B < 10)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		
		if(T>0) {
			for(int i=1; i<=T; i++) {
				String num = br.readLine();
				st = new StringTokenizer(num, " ");
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				if(A > 0 && A<10 && B>0 && B<10) {
					bw.write("Case #" + i + ": " + (A+B) + "\n");
				}
				else {
					System.out.println("범위를 벗어났습니다.");
					break;
				}
			}
		}else {
			System.out.println("범위를 벗어났습니다.");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
