
public class Test {
	
	public static int countWords(String s) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		return count+1;
	}

	public static void main(String[] args) {
		//System.out.println("Test");
		System.out.println();
		String kev = "Kevin Lyttle";
		System.out.println(Test.countWords(kev));
	}

}
