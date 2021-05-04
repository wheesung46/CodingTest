package sso.cote.StringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProblem1 { // 11654
	public static void main(String[] args) throws IOException {
		// 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
		// 알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int code = asciiCode(br.readLine().charAt(0));
		// charAt() : String으로 지정된 문자열 중에서 한 글자만 선택해서 char타입으로 변환해주는 함수
		
		System.out.println(code);
		br.close();
	}
	
	public static int asciiCode(char codeString) {
		
		return (int)codeString;
	}

}
