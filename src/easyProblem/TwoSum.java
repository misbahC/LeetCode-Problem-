package easyProblem;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
	
	int result[]	=twoSum(new int[] {2,7,11,15,100}, 22);
	
	for (int i : result) {
		System.out.println(i);
	}
		
	}
	
	public static int[] twoSumSolution(int arr[], int target) {
		
		
		//[2,7,11,15] targer=22
		
		Map<Integer, Integer> m=new HashMap<>();
		
		int i=0;
		int complement=0;
		for(int a:arr) {
			complement=target-a;  //20, 15,
			
			 if(m.containsValue(complement)) {
				 return new int[] {complement,a};
			 }
			 m.put(i++,a);
			 
		}
		return null;
		
	}
	public static int[] twoSum(int[] nums, int target) {
    
		Map<Integer, Integer> m=new HashMap<>();
		
		int k=0;
		int complement=0;
		for (int i : nums) {
			complement=target-i;
			if (m.containsKey(complement)) {
				return new int[] {m.get(complement),k};
			}
			m.put(i, k++);
		}
		return null;
	
	
	
	
	
	}
	
	
	

}
