package stringsexamples;

public class RandomExamples {

	public static void main(String[] args) {
		System.out.println("main");
		String haystack = "Chandra", needle =
				"nd";

//		int index = getAvailableIndex(haystack, needle);
//		int index =  strStr(haystack, needle);
		int index1 =  strStr1(haystack, needle);
		System.out.println("Result " + index1);
	}

	private static int strStr1(String haystack, String needle) {
		if(needle.length() == 0) return 0;
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if(haystack.substring(i,i+needle.length()).equals(needle))
				return i;
			
		}
		return -1;
	}

	private static int getAvailableIndex(String haystack, String needle) {

		char mainCh[] = haystack.toCharArray();
		char searchCh[] = needle.toCharArray();
		
		System.out.println(mainCh.length);
		System.out.println(searchCh.length);
        if(haystack.isEmpty() && needle.isEmpty())
			return haystack.length();
        else if(mainCh.length< searchCh.length ||mainCh.length ==0 && searchCh.length  ==1) 
			return -1;
        else if(mainCh.length ==1 && searchCh.length  ==0 )
            return 0;
        
		for (int i = 0; i <= mainCh.length - 1; i++) {

			for (int j = 0, k = i; j < searchCh.length;) {
				if (mainCh[k] == searchCh[j]) {
					if (j == searchCh.length - 1)
						return k - j;
					j++;
					if(k < mainCh.length -1){
	                       k++; 
	                    }else break;
				} else
					break;

			}
		}
        
        
		return -1;
        
    }
	
	public static int strStr(String haystack, String needle) {
        
	      if(needle.length()==0) return 0;
	        for(int i=0; i<=haystack.length()-needle.length(); i++) {
	            if(haystack.substring(i, i+needle.length()).equals(needle)) return i;
	        }
	        return -1;
	    } 
	
	
	
	
	
}
