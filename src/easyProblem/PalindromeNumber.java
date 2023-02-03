package easyProblem;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(333));
		

	}
	
	public static boolean isPalindrome(int number)
	{
		int reverse=0;
		int n=number;
		while(n!=0) {
			reverse=reverse*10+n%10; //this is how we can append the number
			n=n/10;
		}
		if (reverse==number) {
			return true;
		}
		
		return false;
		
	}
}
