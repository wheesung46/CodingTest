package sso.cote.arryProblem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrayProblem7 { // 4344
	public static void main(String[] args) throws IOException {
		// 대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
		
		// 첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
		// 둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
		
		// 각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수 C
		int count = 0;
		
		int[] arr = null;
		int sum = 0;
		int avg = 0;
		
		int avgCount = 0;
		
		double ratio = 0;
		double[] ratioArr = new double[testCase];
		
		while(count<testCase) { //C 만큼 테스트 케이스 받기
			StringTokenizer st = new StringTokenizer(br.readLine()); 
			
			int eachCase = Integer.parseInt(st.nextToken()); // 각 테스트 케이스마다 학생의 수 N
			
			arr = new int[eachCase];
			
			for(int i=0; i<arr.length; i++) { // 점수를 배열에 담고 합을 구함
				arr[i]= Integer.parseInt(st.nextToken());
				sum += arr[i];
			}
			avg = sum/eachCase; // 점수 평균
			
			for(int i=0; i<arr.length; i++) { // 평균 넘는 수
				if(arr[i]>avg) avgCount++;
			}
			
			ratio =  Math.round((double)avgCount / (double)eachCase*(double)100); //?
			ratioArr[count] = ratio;
			
			count++;
		}//end while
		
		for(int i=0; i<testCase; i++) {
			System.out.format("%.3f%%%n",ratioArr[i]);
		}
		
		/*
		for(int i=0; i<testCase; i++) { //C 만큼 테스트 케이스 받기
			int N = sc.nextInt(); // 각 테스트 케이스마다 학생의 수 N
			int[] arr = new int[N];
			double sum = 0;
			double avg = 0;
			
			if(N>=1 && N<=1000) { // N(1 ≤ N ≤ 1000, N은 정수)
				for(int j=0; j<N; j++) { // N만큼 점수 받기
					int score = sc.nextInt();
					
					if(score>=0 && score<=100) {
						arr[j] = score; // 점수를 배열에 담음
					}//end if
				}// end for
				
				for(int k=0; k<arr.length; k++) {
					sum += arr[k];
				}// end for
				System.out.println(sum/arr.length);
				avg = Math.round((sum/arr.length)/1000.0); // **소수점 n번째 만큼 반올림
			}// end if
			System.out.println(avg+"%");
		}// end for
		*/
		
		br.close();
		
	}
}
