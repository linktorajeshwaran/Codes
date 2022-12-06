import java.util.stream.Stream;

public class Palindrome {

    public static void main(String[] args) {
        
        
        String A="madam";
        /* Enter your code here. Print output to STDOUT. */
        
        char[] revCharArr = new char[A.length()];
        char[] charArr = A.toCharArray();
        Stream.of(charArr).forEach(System.out::print);
        System.out.println();
        for (int i = charArr.length-1 ; i>=0;i--) {
            revCharArr[charArr.length-i-1] = charArr[i];
        }
        Stream.of(revCharArr).forEach(System.out::print);
        System.out.println();
        if(A.equalsIgnoreCase(String.valueOf(revCharArr))) {
        	System.out.println("Pal");
        }        
    }
}