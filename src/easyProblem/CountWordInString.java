package easyProblem;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CountWordInString {
	
	public static void main(String args[]) {
		

		  Map<String, Integer> m = new HashMap < > (); 
		
		  String sentence= "wehre do you live you";
		  
		  String[] word=sentence.split(" ");
		  
	      for (String s : word) {
			//System.out.println(s);
	    	  String w=s.toLowerCase();
	    	  
	    	  if(m.containsKey(w)) {
	    		  int count=m.get(w);
	    		  m.put(w, count+1);
	    	  }
	    	  else {
				m.put(w, 1);
			}
	      }
		
	      //to display the data 
	    Set<String>key= m.keySet(); // it will return all the key in a map in any order
	     
	     TreeSet<String> sortedKeys=new TreeSet<>(key); //to sort the key in ascending order
	     
	     for (String str : sortedKeys) {
	    	 
	    	 System.out.println("Word =" + str + " and it's count = " + m.get(str));
		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void countWord(String str) {
		
		Map<String, Integer> m=new HashMap<>();
		
	    String word[]=str.split(" ");
	    
	   // int count=0;
	    for(String w:word) {
	    	if(m.containsKey(w)) {
	    		int count=m.get(w);
	    		m.put(str, count++);
	    	}
	    	else {
				m.put(str, 1);
			}
	    }
	}
	
	
	
	
	}


