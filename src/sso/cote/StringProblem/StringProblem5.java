package sso.cote.StringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProblem5 { // 1157
	// 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
	
	// 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
	// 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		
		char ch = wordTest(s);
		System.out.print(ch);
		
		br.close();
	}
	
	public static char wordTest(String s) { 
		int[] arr  = new int[26]; // 영문자 갯수 26개
		
		for(int i=0; i<s.length(); i++) {
			if('A'<=s.charAt(i) && s.charAt(i)<='Z') { // 대소문자 범위
				arr[s.charAt(i)-'A']++;
			}else { // 소문자 범위
				arr[s.charAt(i)-'a']++;
			}
		}
		
		int max = -1;
		char ch = '?';
		
		for(int i=0; i<26; i++) {
			if(arr[i]>max) {
				max=arr[i];
				ch = (char)(i+65); // 대문자로 출력해야하므로 65를 더해줌
			}else if(arr[i]==max) {
				ch='?';
			}
		}
		
		return ch;
	}
}
