package whee.cote;

import java.util.Scanner;

public class problem9{
	public static void main(String[] args) {
		Scanner num1 = new Scanner(System.in);
		int a = num1.nextInt();
		int b = num1.nextInt();
		if(a>=1 && a<=10000 && b>=1 && b <=10000) {
			System.out.println(add(a,b));
			System.out.println(sub(a,b));
			System.out.println(mul(a,b));
			System.out.println(dev(a,b));
			System.out.println(trash(a,b));
		}
		else
			System.out.println("두 수는 1보다 크거나같고 10000 보다 작거나같아야 합니다.");
	}
	
	public static int add(int a,int b) {
		int result = a + b;
		return result;
	}
	public static int sub(int a, int b) {
		int result = a - b;
		return result;
	}
	public static int mul(int a, int b) {
		int result = a * b;
		return result;
	}
	public static int dev(int a, int b) {
		int result = a / b;
		return result;
	}
	public static int trash(int a, int b) {
		int result = a % b;
		return result;
	}
}
