package sso.cote.StringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProblem3 { // 10809
	public static void main(String[] args) throws IOException {
		// 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각각의 알파벳에 대해서, 단어에 포함되어 있는 경우에는 처음 등장하는 위치를, 포함되어 있지 않은 경우에는 -1을 출력하는 프로그램을 작성하시오.
		// 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으며, 알파벳 소문자로만 이루어져 있다.
		
		// 각각의 알파벳에 대해서, a가 처음 등장하는 위치, b가 처음 등장하는 위치, ... z가 처음 등장하는 위치를 공백으로 구분해서 출력한다.
		// 만약, 어떤 알파벳이 단어에 포함되어 있지 않다면 -1을 출력한다. 단어의 첫 번째 글자는 0번째 위치이고, 두 번째 글자는 1번째 위치이다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String S = br.readLine();
		
		int[] arr = word(S);
		
		for(int val:arr) {
			System.out.print(val+" ");
		}

		
		br.close();
	}
	
	public static int[] word(String S) {
		int[] arr = new int[26];
		
		// -1로 초기화
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1; // 처음엔 일단 다 입력되지 않았으므로 -1로 기본설정
		}
		
		for(int i=0; i<S.length(); i++) {
			char ch = S.charAt(i); // 문자열을 하나씩 문자를 받음 -> 문자를 추출
			
			if(arr[ch-'a'] == -1) { // arr 원소 값이 -1인 경우에만 초기화 (동일 문자가 포함되어있는 경우 처음 나타난 위치로)
				arr[ch-'a'] = i;
			}
		}
		
		return arr;
		
		
	}
}
