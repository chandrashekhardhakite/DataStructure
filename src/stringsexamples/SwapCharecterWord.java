package stringsexamples;

public class SwapCharecterWord {

	public static void main(String[] args) {

		SwapCharecterWord swapCharecterWord = new SwapCharecterWord();
		String str = "Chandra Moti Dhakite";
		String outputString = swapCharecterWord.swapWords(str);
		System.out.println("outputString -- " + outputString);

	}

	public String swapWords(String str) {

		char[] ch = str.toCharArray();
		int startword = 0;

		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch.length);

			if (ch[i] == ' ' || i == ch.length - 1) {
				char temp;
				temp = ch[startword];

				if (i != ch.length - 1) {
					ch[startword] = ch[i - 1];
					ch[i - 1] = temp;
					startword = i + 1;
					
				} else {
					ch[startword] = ch[i];
					ch[i] = temp;
				}

			}

		}
		str = new String(ch);

		return str;

	}
}
