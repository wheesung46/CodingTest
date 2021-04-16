package sso.cote.forProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ForProblem1 { // 2739
	public static void main(String[] args) throws IOException {
		// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num >1 || num<=9) {
			for(int i=1; i<=9; i++) {
				System.out.println(num+"*"+i+"="+gogodan(num, i));
			}//end for
		}
		
		br.close();
		
	}
	
	public static int gogodan(int num, int i) {
		return num*i;
	}
}
