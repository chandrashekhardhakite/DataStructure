package stringsexamples;

import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("chandra");
		ReverseString reverseString = new ReverseString();
		String str = "chandra";
//		option 1
		reverseString.reverseStr1(str);
//		option 2
		reverseString.reverseStr2(str.toCharArray());
//		option 3
		reverseString.reverseStr3(str.toCharArray());
//		option 4
		reverseString.reverseStr4(str.toCharArray());
//		option 5
		reverseString.reverseStr5(str);

	}

//	option 1
	public void reverseStr1(String str) {
		// TODO Auto-generated method stub
		StringBuilder builderStr = new StringBuilder();
		builderStr.append(str);
		builderStr.reverse();
		System.out.println("Reverse String1 - " + builderStr);
	}

//	option 2	
	public void reverseStr2(char[] ch) {
		// TODO Auto-generated method stub
		StringBuilder builderStr2 = new StringBuilder();
		for (int i = ch.length - 1; i >= 0; i--) {
			builderStr2.append(ch[i]);
		}
		System.out.println("Reverse String2 - " + builderStr2);
	}

	// option 3
	public void reverseStr3(char[] temparray) {

		int left, right = 0;
		right = temparray.length - 1;

		for (left = 0; left < right; left++, right--) {
			// Swap values of left and right
			char temp = temparray[left];
			temparray[left] = temparray[right];
			temparray[right] = temp;
		}

		System.out.print("\nReverse String3 - " + new String(temparray));

	}

	// option 4
	public void reverseStr4(char[] temparray) {
		List<Character> tempList = new ArrayList<Character>();
		StringBuilder builderStr2 = new StringBuilder();
		for (char c : temparray)
			tempList.add(c);
		Collections.reverse(tempList);
		for (char c : tempList)
			builderStr2.append(c);
		System.out.println("\nReverse String4 - " + builderStr2);

	}

	// option 5 recursion
	public void reverseStr5(String str) {
		if (str == null || str.length() <= 1) {
			System.out.println("\nReverse String5 - " + str);
		} else {
			System.out.print(str.charAt(str.length() - 1));
			reverseStr5(str.substring(0, str.length() - 1));
		}

	}
}
