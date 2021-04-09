package whee.cote;

import java.util.Scanner;

public class ArrayProblem3 {
	public static void main(String[] args) {
		//세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
		//예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
		//계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		//첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
		//첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 
		//마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		if(A>=100 && A<1000 && B>=100 && B<1000 && C>=100 && C<1000) {
			int count = 0;
			int num1 = A*B*C;
			int num2 = A*B*C;
			int count_0 = 0;
			int count_1 = 0;
			int count_2 = 0;
			int count_3 = 0;
			int count_4 = 0;
			int count_5 = 0;
			int count_6 = 0;
			int count_7 = 0;
			int count_8 = 0;
			int count_9 = 0;
			for(int i=0; num1/10!=0; i++) {
				num1 = num1/10;
				count ++;
			}
			int[] array = new int[count+1];
			for(int j=0; num2/10!=0; j++) {
				num2 = num2/10;
				array[j] = num2%10;
			}
			for(int k=0; k<array.length; k++) {
				System.out.println(array[k]);
				if(array[k] == 0) { count_0++; }
				if(array[k] == 1) { count_1++; }
				if(array[k] == 2) { count_2++; }
				if(array[k] == 3) { count_3++; }
				if(array[k] == 4) { count_4++; }
				if(array[k] == 5) { count_5++; }
				if(array[k] == 6) { count_6++; }
				if(array[k] == 7) { count_7++; }
				if(array[k] == 8) { count_8++; }
				if(array[k] == 9) { count_9++; }
			}
			System.out.println(count_0 + "개");
			System.out.println(count_1 + "개");
			System.out.println(count_2 + "개");
			System.out.println(count_3 + "개");
			System.out.println(count_4 + "개");
			System.out.println(count_5 + "개");
			System.out.println(count_6 + "개");
			System.out.println(count_7 + "개");
			System.out.println(count_8 + "개");
			System.out.println(count_9 + "개");
		}
		else {
			System.out.println("범위를 벗어났습니다.");
			sc.close();
		}
	}
}
