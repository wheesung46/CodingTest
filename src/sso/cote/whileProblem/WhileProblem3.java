package sso.cote.whileProblem;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class WhileProblem3 { // 1110
	public static void main(String[] args) throws IOException {
		// 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 
		// 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.  
		// 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
		// 26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
		// 위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
		// N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
		//55 -> 3
		//1 -> 60
		
		// 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); // 0<=N<=99
			
		int originNum=N;
			
		int firstNum = 0;
		int secondNum = 0;
		int sum = 0;
		int sumSecondNum = 0;
			
		int i = 0 ;
			
			if(N>=0 && N<=99) {
				
				if(N<10) { // N이 10보다 작으면
					N = Integer.parseInt("0"+N); // N=2; tmp=20
				}
				
				while(true){
					// N이 10보다 크면 (ex- 26)
					firstNum = (N/10)%10; // 2
					secondNum = N%10; // 6
					sum = firstNum + secondNum; // 2+6=8
					sumSecondNum = sum%10;
					
					N = Integer.parseInt(Integer.toString(secondNum)+Integer.toString(sumSecondNum)); //68
					i++;
					
					if(N == originNum) {
						break;
					}//end if
				}//end while
				System.out.println("길이 : "+i);
				
				bw.write(Integer.toString(i));
				bw.flush();
				
				br.close();
				bw.close();
				
			}else {
				System.out.println("범위가 아닙니다.");
			}
	}
}
