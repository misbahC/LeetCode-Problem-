package easyProblem;

public class FibonacciSequence {

public static void main(String[] args) {
		
	/*
	 * //1 2 3 5 8 13 21 34 55 89 144
	 */
	
	    int first=0,second=1,fibo=0;
	    
		for(int i=0; i<=10; i++) {
			fibo=first+second;
			System.out.println(fibo);
			first=second;
			second=fibo;
		}
		
	}
}
