package easyProblem;

import java.util.Iterator;

public class ReversEachWordInString {

	public static void main(String[] args) {
		String str = "United State Of America";
		String str1="Welcome to Java and selenium";
		// Output=aciremA fO etatS detinU
		
		reverseString(str);
		System.out.println(" ");
		reverseEachWord(str1);
		
		
		
	}
	
	public static void reverseString(String str) {
		
		//String sp[] = str.split(" ");
		
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.print(str.charAt(i));
			
		}
	}
	
	public static void reverseEachWord(String str) {
		
		String words[]=str.split(" ");
		
		for(String w:words) {
			String tempString="";
			for(int i=w.length()-1;i>=0;i--){
				tempString=tempString+w.charAt(i);
			}
			System.out.print(tempString+" ");
		}
	}

}
