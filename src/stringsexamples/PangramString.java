package stringsexamples;

import java.util.*;

public class PangramString {
	
	public static final String TAG= PangramString.class.getSimpleName();
	Set<Integer> sampleSet = new HashSet<Integer>();
	
	public static void main(String [] args) {
		System.out.println(TAG);
		
		PangramString ps = new PangramString();
		String str = "The quick brown fox jumps over the lazy dog";
		
		for(int i =97 ; i< 123 ; i++)
			ps.sampleSet.add(i);
			
		System.out.println(ps.sampleSet);
		boolean pangramStr = ps.isPangramString(str);	
		
		if(pangramStr)
			System.out.println("Its Pangram String");
		else 
			System.out.println("Its not Pangram String");
		
		}
	
	public boolean isPangramString(String str) {
		boolean[] mark = new boolean[26]; 
		  
        // For indexing in mark[] 
        int index = 0; 
  
        // Traverse all characters 
        for (int i = 0; i < str.length(); i++) 
        { 
            // If uppercase character, subtract 'A' 
            // to find index. 
        	
        	System.out.println();
            if ('A' <= str.charAt(i) &&  
                    str.charAt(i) <= 'Z') 
            {
            	
                index = str.charAt(i) - 'A'; 
                System.out.println("Upper Charecters"+index);
            }
                // If lowercase character, subtract 'a' 
                // to find index. 
            else if('a' <= str.charAt(i) &&  
                        str.charAt(i) <= 'z') 
            {
            	             
                index = str.charAt(i) - 'a'; 
                System.out.println("Lower Charecters"+index);
            }
  
            // Mark current character 
            mark[index] = true; 
        } 
  
        // Return false if any character is unmarked 
        for (int i = 0; i <= 25; i++) 
            if (mark[i] == false) 
                return (false); 
  
        // If all characters were present 
        return (true); 
  
	}

}
