package whee.cote.function;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FunctionProblem1 {
	public static void main(String[] args) throws Exception{
		// 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
		// 작성해야 하는 함수는 다음과 같다.
		// Java: long sum(int[] a); (클래스 이름: Test)
		// a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
		// 리턴값: a에 포함되어 있는 정수 n개의 합
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int[] a = new int[num];
		for(int i=0; i<num; i++) {
			a[i] = (int)(Math.random() * 10000000);
		}
		System.out.println(sum(a));
		br.close();
	}
	
	public static long sum(int[] a) {
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
