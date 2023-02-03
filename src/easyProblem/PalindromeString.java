package easyProblem;

public class PalindromeString {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("abba"));
		

	}
	
	public static boolean isPalindrome(String str)
	{
		String newString="";
		
		for (int i = str.length()-1; i >=0; i--) {
			
			newString=newString+str.charAt(i);
		}
		if (str.equals(newString)) {
			return true;
		}
		return false;
		
	}

}
