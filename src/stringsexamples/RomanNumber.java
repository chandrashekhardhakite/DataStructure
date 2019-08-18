package stringsexamples;

import java.util.HashMap;

public class RomanNumber {
	
	public static void main(String[] args) {
		System.out.println("main");
		
		String romanStr = ("III");
		String romanStr1 = ("LVIII");
		
	 int toatal =  getRomanMNumber(romanStr);
	 System.out.println("Total : "+toatal);
	}

	private static int getRomanMNumber(String romanStr1) {
		
		char []roamnCharArray = romanStr1.toUpperCase().toCharArray();
		HashMap<Character, Integer> romanHashMap = new HashMap<Character, Integer>();
		romanHashMap.put('I', 1);
		romanHashMap.put('V', 5);
		romanHashMap.put('X', 10);
		romanHashMap.put('L', 50);
		romanHashMap.put('C', 100);
		romanHashMap.put('D', 500);
		romanHashMap.put('M', 1000);
		
		int thisValue = 0;
		int lastValue= 0;
		int total =0;
		
		for (int i = roamnCharArray.length -1; i >= 0 ; i--) {
			thisValue = romanHashMap.get(roamnCharArray[i]);
			if(thisValue <lastValue) {
				total -=thisValue;
			}else{
				total += thisValue;
			}
				lastValue = thisValue;	
			
		}
		return total;
		
	}

}
