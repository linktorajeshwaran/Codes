import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeInWords {

	public static void main(String a[]) {
		Map<Integer, String> numtoWordsMap = new TreeMap<Integer, String>();
		int m = 00;
		int h = 12; 
		int i=1;
		numtoWordsMap.put(0, "o' clock");
		numtoWordsMap.put(i++, "one");
		numtoWordsMap.put(i++, "two");
		numtoWordsMap.put(i++, "three");
		numtoWordsMap.put(i++, "four");
		numtoWordsMap.put(i++, "five");
		numtoWordsMap.put(i++, "six");
		numtoWordsMap.put(i++, "seven");
		numtoWordsMap.put(i++, "eight");
		numtoWordsMap.put(i++, "nine");
		numtoWordsMap.put(i++, "ten");
		numtoWordsMap.put(i++, "eleven");
		numtoWordsMap.put(i++, "twelve");
		numtoWordsMap.put(i++, "thriteen");
		numtoWordsMap.put(i++, "fourteen");
		numtoWordsMap.put(i++, "fifteen");
		numtoWordsMap.put(i++, "sixteen");
		numtoWordsMap.put(i++, "seventeen");
		numtoWordsMap.put(i++, "eighteen");
		numtoWordsMap.put(i++, "nineteen");
		numtoWordsMap.put(i++, "twenty");
		numtoWordsMap.put(i++, "thirty");
		System.out.println(numtoWordsMap);
		String word = "";
		if(m==0) {
			word = numtoWordsMap.get(h) + " " + numtoWordsMap.get(m);
		} else if(m==1) {
			word = numtoWordsMap.get(m) + " minute past " + numtoWordsMap.get(h);
		} else if (m<=30) {
			word = numtoWordsMap.get(m) + " minutes to " + numtoWordsMap.get(h+1);
		} else if (m>30 && m<59) {
			word = numtoWordsMap.get(m) + " minutes to " + numtoWordsMap.get(h+1);
		} else if (m==59) {
			word = numtoWordsMap.get(m) + " minute to " + numtoWordsMap.get(h+1);
		}
		System.out.println(word);
	}
}
