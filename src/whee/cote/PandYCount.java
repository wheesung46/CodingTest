package whee.cote;

class PandYCount {
	public static void main(String[] args) {
		Solution("weifwjeof");
	}
	
    static boolean Solution(String s){
		String lowers = s.toLowerCase();
		int cntp = 0;
		int cnty = 0;
		boolean answer = true;
		for(int i = 0; i < lowers.length(); i++) {
			if(lowers.charAt(i)=='p') {
				cntp ++;
			}
			else if(lowers.charAt(i)=='y') {
				cnty ++;
			}
		}
		if(cntp != cnty) {
			System.out.println(true);
			answer = false;
			return answer;
		}
		return answer;
    }
}
