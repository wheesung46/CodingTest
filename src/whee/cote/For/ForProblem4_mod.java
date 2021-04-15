package whee.cote.For;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ForProblem4_mod {
	public static void main(String[] args) throws Exception{
		// Java를 사용하고 있다면, Scanner와 System.out.println 대신 BufferedReader와
		// BufferedWriter를 사용할 수 있다.
		// BufferedWriter.flush는 맨 마지막에 한 번만 하면 된다.
		// 첫 줄에 테스트케이스의 개수 T가 주어진다. T는 최대 1,000,000이다. 다음 T줄에는 각각 두 정수 A와 B가 주어진다. A와 B는
		// 1 이상, 1,000 이하이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		int T = Integer.parseInt(br.readLine());
		
		if(T>=1 && T<=1000000) {
			for(int i=0; i<T; i++) {
				String num = br.readLine();
				st = new StringTokenizer(num, " ");
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				if(A >= 1 && A <= 1000 && B >= 1 && B <= 1000) {
					bw.write((A+B) + "\n");
				}
				else {
					System.out.println("범위를 벗어났습니다.");
					break;
				}
			}
		}
		else {
			System.out.println("범위를 벗어났습니다.");
		}
		bw.flush();
		br.close();
		bw.close();
	}
}
