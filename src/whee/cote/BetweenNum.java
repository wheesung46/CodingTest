package whee.cote;

public class BetweenNum {
	public static void main(String[] args) {
		System.out.println(solution(3,5));
		System.out.println(solution(5,3));
	}
	
	public static long solution(int a, int b) {
		long sum = 0;
		if(a<=b){
			for (int i = a; i <= b; i++) {
				sum += i;
			}
			return sum;
		}else{
			for(int i = b; i <=a; i++){
				sum +=i;
			}
			return sum;
		}
	}
}
