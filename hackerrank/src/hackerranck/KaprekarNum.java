package hackerranck;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class KaprekarNum {

    /*
     * Complete the 'kaprekarNumbers' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER p
     *  2. INTEGER q
     */

	public static void main (String a[]) {
		kaprekarNumbers(1, 99999);
	}
	
    public static void kaprekarNumbers(int p, int q) {
    // Write your code here
    	
        List<String> list = new ArrayList<>();
        IntStream.range(p, q+1).forEach((k) -> {
        	 if(isKaprekarNumber((long)k)) {
                 list.add(k+"");
             }
    	});
        
        System.out.println(list);
        list.stream().forEach(t->System.out.print(t + " "));
    }
    
    private static boolean isKaprekarNumber(Long num) {
    	if(num==1) 
    		return true;
    	Long sqNum = (long) Math.pow(num, 2);
        String n = String.valueOf(num);
        System.out.println("n:" + num);
        String s = String.valueOf(sqNum);
        Integer r =0;
        Integer l=0;
        int diff=0;
        if(s.length()==1) {
        	return false;
        }
        if(s.length()>n.length())
          diff = s.length()-n.length();
        r = Integer.parseInt(s.substring(diff, s.length()));
        l = Integer.parseInt(s.substring(0, diff));
        Double sum = (double) (r+l);
        
        System.out.println("num:" + num +"  "+"sqnum: " + sqNum + " " +"l: " + l + "  " + "r:" + r + " Sum: " + sum ) ;
        return (Double.compare(sum, num)==0)?true:false;
    }

}
