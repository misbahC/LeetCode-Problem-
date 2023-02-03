package easyProblem;

import java.util.Arrays;

public class TwoArrayEqualOrNot {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		int a[]= {1,2,3,4,5,6};
		
	Boolean status=	Arrays.equals(arr, a);
	
	if (status) {
		System.out.println("equal");
	}
	else {
		System.out.println("not equal");
	}

	}

}
