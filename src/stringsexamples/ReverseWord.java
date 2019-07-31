package stringsexamples;

import java.util.Vector;
import java.util.regex.Pattern;

/**
 * @author chandra ReverseWord class to find the reverse word from the given
 *         string
 */
public class ReverseWord {
	final static String TAG = ReverseWord.class.getSimpleName();
	String str = "Welcome to geeksforgeeks";

	public static void main(String args[]) {

		System.out.println(TAG);
		ReverseWord rw = new ReverseWord();
		String reverseWordsString1 = rw.ReverseWord1();
		System.out.println("option 1 output -- " + reverseWordsString1);
		String reverseWordsString2 = rw.ReverseWord2();
		System.out.println("option 2 output -- " + reverseWordsString2);

	}

	private String ReverseWord1() {
		// TODO Auto-generated method stub

		char[] chArray = str.toCharArray();
		Vector<String> tempStrWords = new Vector<String>();
		String tempStr = "";
		for (int i = 0; i < chArray.length; i++) {
			tempStr += Character.toString(chArray[i]);
			tempStr = tempStr.trim();
			if (chArray[i] == ' ' || i == chArray.length - 1) {
				tempStrWords.add(tempStr);
				tempStr = "";
			}
		}
		String outputStr = "";
		for (int i = (tempStrWords.size()) - 1; i >= 0; i--) {
			outputStr += " " + tempStrWords.get(i);
		}
		return outputStr;
	}

	private String ReverseWord2() {

		
		//It will get the space pattern and split the string as per pattern also remove the spaces
		Pattern pattern = Pattern.compile("\\s");
		
		// splitting String str with a pattern
		// (i.e )splitting the string whenever their
		// is whitespace and store in temp array.
		String[] temp = pattern.split(str);
		
		

		String outputStr = "";
		for (int i = (temp.length) - 1; i >= 0; i--) {
			outputStr += " " + temp[i];
		}
		return outputStr;
	}

}