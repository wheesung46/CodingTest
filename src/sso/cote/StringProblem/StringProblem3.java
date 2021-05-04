package sso.cote.StringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProblem3 { // 10809
	public static void main(String[] args) throws IOException {
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine().toLowerCase();
		
		word(S);

		
		br.close();
	}
	
	public static void word(String S) {
		int[] wordCnt = new int[26];
		
		for(int i=0; i<S.length(); i++) {
			wordCnt[i] = -1; // 처음엔 일단 다 입력되지 않았으므로 -1로 기본설정
			
			char c = S.charAt(i); // 문자열을 하나씩 문자를 받음
			int tmp = (int)c;
			tmp-=97;
			if(wordCnt[tmp] == -1) {
				wordCnt[tmp]=i;
			}
		}
		
		for(int i=0; i<wordCnt.length;i++) {
			System.out.println(wordCnt[i]);
		}
		
	}
}
