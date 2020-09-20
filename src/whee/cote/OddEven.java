package whee.cote;

public class OddEven {
	public static void main(String[] args) {
		OddEven(3);
		System.out.println(OddEven(4));
	}
	
	public static String OddEven(int num) {
        String answer = "";
        
        if(num%2 == 0 || num == 0){
        	answer = "Even";
        }
        else{
        	answer = "Odd";
        }
        return answer;
    }
}
