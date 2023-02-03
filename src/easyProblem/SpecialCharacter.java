package easyProblem;

public class SpecialCharacter {
	
	
	public static void main(String[] args) {
		
		
		String name= new String("USA$&@NY()[] {}123");
		
		String repString=name.replaceAll("[^a-zA-Z0-9]", ""); //replace all excpet negation 
		System.out.println(repString);
		
		String reString2=name.replaceAll("\\w", ""); //remove all letter, only special character
		
		System.out.println(reString2);
		
		String reString3=name.replaceAll("\\d", ""); //replace all number
		
		System.out.println(reString3);
		
		String reString4=name.replaceAll("\\W", ""); // Remove Special character
		
		System.out.println(reString4);
		
		String reString5=name.replaceAll("\\D", ""); //remove special character and latter
		System.out.println(reString5);
		
		String reString6=name.replaceAll("[A-z]", ""); //Remove all Letter
		System.out.println(reString6);
		
		String reString7=name.replaceAll("\\s", ""); 	// "\\s" remove space 
		System.out.println(reString7);
		
		
		
		
		
		
		
	
	}

}
