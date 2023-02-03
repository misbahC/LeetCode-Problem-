package easyProblem;

public class PrimeNumber {
	
	public static void main (String args[]) {
		
		int count=0;
		
		for (int i = 0; i < 50; i++) {
			for (int j = 2; j < i; j++) {
				if (i%j==0) {
					count++;
					break;
				}
			}
			if (count==0) {
				System.out.println("prime"+i);
			}
			else {
				System.out.println("not prime"+i);
				
			}
			count=0;
			
		}
		
	}
	

}
