import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdentifyingDuplicateWords {

	public static void main (String a[]) {
		
		String input = "The the String string temp string stringing temp";
		
		String reg = "\\b(\\w+)(\\s+\\1\\b)+";
	  //String reg = "[\\w\\W]*?\\s+\\b([\\w\\W]+)?\\s+[\\w\\W]*?(\\1)\\b+\\s*[\\w\\W]*?";
	  //String reg = "[\\w\\W]*?\\s+\\b([\\w\\W]+)?\\s+[\\w\\W]*?(\\1)\\b+\\s*[\\w\\W]*?";
		
		Pattern p = Pattern.compile(reg, Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(input);
		System.out.println(input);
		while(m.find()) {
			System.out.println("------------------------------------------------");
			System.out.println("m.groutp():" + m.group());
			System.out.println("m.groutp(0):" + m.group(0));
			System.out.println("dupolicate exists:" + m.group(1));
			System.out.println(m.group(2));
			input = input.replaceAll(m.group(), m.group(1));
			//System.out.println(m.group(3));
			System.out.println("------------------------------------------------");
		}
		
		System.out.println(input);
	}
	
}
