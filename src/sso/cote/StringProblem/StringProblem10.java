package sso.cote.StringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProblem10 { // 1316
	// 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
	// kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
	// 단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
	
	// 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
	// 첫째 줄에 그룹 단어의 개수를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int cnt = 0;
		for(int i=0; i<N; i++) {
			if(test(br.readLine())){
				cnt++;
			}
		}
		
		System.out.println(cnt);
		
		br.close();
	}
	
	public static boolean test(String word) {
		boolean[] check = new boolean[26];
		int prev = 0;
		
		for(int i=0; i<word.length(); i++) {
			int now = word.charAt(i); // i번째 문자 저장 (현재 문자)
			
			// 앞선 문자와 i번째 문자가 같지 않으면
			if(prev != now) { 
				// 해담 문자가 처음 나오면
				if(check[now-'a'] == false) {  
					check[now-'a'] = true; // true로 바꿔줌
					prev = now;
				}
				// 해당 문자가 이미 나온적이 있으면 (그룹단어가 아니면!) => check[now-'a'] == true 일때!
				else {
					return false; // 함수 종료
				}
			}
			// 앞선 문자와 i번째가 문자가 같다면 (연속된 문자)
			else {
				continue;
			}
		}
		
		
		return true;
	}
}
