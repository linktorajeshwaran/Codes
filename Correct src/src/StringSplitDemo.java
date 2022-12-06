import java.util.StringTokenizer;

public class StringSplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "He is a very very good boy, isn't he?";
		 // Write your code here.
		StringTokenizer st = new StringTokenizer(s, "[ |\\'|\\,|\\!|\\?|\\.|\\_|\\@]+");
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
	}

}
