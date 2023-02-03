package easyProblem;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {
	
		String str []= { "JAVA","RUBY","c#","PYTHON","JAVA"};
		
		Set<String> hs=new HashSet<>();
	    
		boolean flag=false;
		
	for(String s:str) {
		if(hs.add(s)==false) {
			flag=true;
			System.out.println("duplicate");
		}
		else {
			flag=false;
		}
	}
	if(flag==false) {
		
		System.out.println("no duplicate");
	
	}
		
	}

}
