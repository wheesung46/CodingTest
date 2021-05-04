package sso.cote.StringProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProblem2 { //11720
	// N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
	// 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		if(N>=1 && N<=100) {
			
			String num = br.readLine();
			int sum = 0;
			//String[] numArr;
			
			for(int i=0; i<N; i++) {
				//numArr = num.split("");
				//result = sum(numArr);
				sum +=num.charAt(i)-'0';
				
			}
			System.out.println(sum);
		}
		
		br.close();
	}
	
	/*
	public static int sum(String[] num) {
		int sum=0;
		for(String s : num) {
			sum+=Integer.parseInt(s);
		}
		return sum;
	}
	*/
}
