package sso.cote.arryProblem;

import java.util.Scanner;

public class ArrayProblem4 { // 3052
	public static void main(String[] args) {
		// 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
		// 수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		
		// 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10]; // 42로 나눈 나머지 배열
		int cnt=1; // 서로 다른 값 갯수 (무조건 하나는 존재하기에 1로 초기화해줌)
		
		for(int i=0; i<10; i++) { // 10개 까지 입력받고
			int num = sc.nextInt();
			
			if(num<=1000 && num>0) { // 입력받을 조건
				arr[i]=num%42; // 입력받은 수를 42로 나눈 나머지를 배열에 담는다 
			}// end if
		}//end for
		
		
		for(int i=1; i<arr.length;i++) { 
			if(arr[0] != arr[i]) { // 배열의 요소가 서로다른지 체크
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
}
