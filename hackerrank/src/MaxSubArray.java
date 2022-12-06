import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MaxSubArray {

    /*
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void main(String as[]) {
    	
    	Integer[] a1 = {1,1,2,2,4,4,5,5,5};
    	List<Integer> a = Arrays.asList(a1);
    	
    	
    	
        List<List> result = new ArrayList<>();
        // Write your code here
        Collections.sort(a);
        for (int x=0;x<a.size();x++) {
             int xValue = a.get(x);
             List l = new ArrayList<>();
             l.add(xValue);
             for (int y=x+1;y<a.size();y++) {
                 int yValue = a.get(y);
                 if(Math.abs(xValue - yValue)<=1) {
                     l.add(yValue);
                 } else {
                	 break;
                 }
             }
             result.add(l);       
        }
        
        System.out.println(result);
        int c = result.stream().mapToInt(s->s.size()).max().getAsInt();
        System.out.println(c);
        //return 0;
    }
}
