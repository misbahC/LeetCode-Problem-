package easyProblem;

public class ReverseNumber {

	
	public static int ReverseNumber(int number) {
		
		int rev=0;
		int n=number;
		
		while(n!=0) {
			
			rev=rev*10+n%10;
			n=n/10;
		}
		return rev;
	}

	public static void main(String[] args) {
		
		int r=123456;
		System.out.println(ReverseNumber(r));
		
	}

}
