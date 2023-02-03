package easyProblem;

public class ArmstrongNumber {
	
	public static boolean check(int input) {
		int sumOfPower=0;
		int temp=input;
		
		int digitCount=digitCouts(input);
		
		while (temp!=0) {
			int t=temp%10;
			sumOfPower=(int) (sumOfPower+Math.pow(t, digitCount));
			temp=temp/10;
		}
		if (sumOfPower==input) {
			return true;
			
		}
		return false;
	}
	
	public static int digitCouts(int number) {
		 return (int) Math.floor(Math.log10(number) + 1);
	}
	
	
	public static void main(String args[]) {
		
		System.out.println(check(408));
	}
	
	

}
