package whee.cote;

import java.util.Scanner;

public class Ifproblem4 {
	public static void main(String[] args) {
		// 양양1 음양2 음음3 양음4 범위 -1000<=x,y<=1000 x!=0
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x<=1000 && x>=-1000 && y<=1000 && y>=-1000 && x!=0 && y!=0) {
			if(x>0 && y>0) {
				System.out.println("1");
			}
			else if(x<0 && y>0) {
				System.out.println("2");
			}
			else if(x<0 && y<0) {
				System.out.println("3");
			}
			else if(x>0 && y<0) {
				System.out.println("4");
			}
		}
		else
			System.out.println("범위를벗어났습니다.");
	}
}
