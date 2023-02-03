package easyProblem;

public class CountCharInString {
	
	
	public static int countCharInString(String s, char chr) {
		
		int i=0;
		int count=0;
		while(i<s.length()) {
			if(s.charAt(i)==chr) {
				count++;
				
			}
			i++;
		}
		return count;
		
	}
	public static void main(String args[]) {
		
		String str="i live in United States Of America";
		char c='a';
		
		int NumberOfcharInString=countCharInString(str, c);
		
		System.out.println(NumberOfcharInString);
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
