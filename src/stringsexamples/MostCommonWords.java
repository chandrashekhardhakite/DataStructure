package stringsexamples;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class MostCommonWords {

	public static void main(String[] args) {
		System.out.println("MostCommonWords");
		MostCommonWords mcw = new MostCommonWords();
		mcw.findMostCommonWords();
	}

	String str = "a.";

	public void findMostCommonWords() {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String bannedWord = "";
		HashSet<String> tempCommonWorld = new HashSet<String>();
		int maxValue = 0;
		String outputStr = "";

//		Pattern pat = Pattern.compile("\\s");
//		String temp[] = pat.split(str.toLowerCase());
		String temp[] = str.toLowerCase().split(" ");
		int count = 1;
		for (String str : temp) {
			String tr1 = str.replaceAll("[.]", "");
			String tr = tr1.replaceAll("[,]", "");
			if (hm.containsKey(tr)) {
				if (tr.equals(bannedWord)) {
					hm.remove(tr);
				} else {
					if (!tempCommonWorld.contains(tr)) {
						tempCommonWorld.add(tr);
					}
					int value = hm.get(tr);
					hm.put(tr, ++value);

				}
			} else
				hm.put(tr, count);
			System.out.println(hm);
			System.out.println(tempCommonWorld);

			Iterator iterator = tempCommonWorld.iterator();

			// check values
			
			if(!(hm.isEmpty() && hm.size()== 1)) {
			while (iterator.hasNext()) {
				String s = iterator.next().toString();

				if (maxValue < hm.get(s)) {

					maxValue = hm.get(s);
					outputStr = s;
				}

			}
			}else { 
				outputStr = tr;
				maxValue = 1;
			}
			
				

			System.out.println("Max Value: " + maxValue + " " + outputStr);

		}

	}

	// LeetCode
	public String mostCommonWord(String paragraph, String[] banned) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		String bannedWord = "ball";
		HashSet<String> tempCommonWorld = new HashSet<String>();
		int maxValue = 0;
		String outputStr = "";

//		Pattern pat = Pattern.compile("\\s");
//		String temp[] = pat.split(str.toLowerCase());
		String temp[] = paragraph.toLowerCase().split(" ");
		int count = 1;
		for (String str : temp) {
			String tr1 = str.replaceAll("[.]", "");
			String tr = tr1.replaceAll("[,]", "");
			if (hm.containsKey(tr)) {
				for (String temp1 : banned) {
					if (temp1.equals(tr)) {
						hm.remove(tr);
					} else {
						if (!tempCommonWorld.contains(tr)) {
							tempCommonWorld.add(tr);
						}
						int value = hm.get(tr);
						hm.put(tr, ++value);

					}
					break;

				}

			} else
				hm.put(tr, count);
			System.out.println(hm);
			System.out.println(tempCommonWorld);

			Iterator iterator = tempCommonWorld.iterator();

			// check values
			while (iterator.hasNext()) {
				String s = iterator.next().toString();

				if (maxValue < hm.get(s)) {

					maxValue = hm.get(s);
					outputStr = s;
				}

			}

			System.out.println("Max Value: " + maxValue + " " + outputStr);

		}
		return outputStr;
	}

}
