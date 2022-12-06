import java.math.BigInteger;
import java.util.stream.Stream;

public class LexicallySmallestAndLargest {

    public static void main(String a[]) {
    	String s="ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs";
    	int k = 30;
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        int r = s.length()%k;
        
        System.out.println("r: " + r);
        //String tStr = s.substring(0, (s.length()-r));
        
        String tStr = s;

        System.out.println("tStr: " + tStr);
        
        System.out.println("tStr.length(): " + tStr.length());
        int newLngth = (tStr.length()-k)+1;
        
        System.out.println("newLength:" + newLngth);
        
        String[] subStr = new String[newLngth];

        System.out.println("k=" + k);        
        System.out.println("subStr length: l :" + subStr.length);
        int count = 0;
        for(int i=0;i<tStr.length();i++) {        	
        	if((i+k) <= tStr.length()) {
                subStr[i] = tStr.substring(i,i+k);
                count++;
            }        	
        }
        
        
        
        System.out.println("count:" + count);
        
         System.out.println("subStr: new leg:" + subStr.length);
        Stream.of(subStr).forEach(i -> System.out.print(i + " "));
        
        for (int x=0;x<subStr.length-1;x++) {        	 
            for (int y=x+1;y<subStr.length;y++) {
                if(subStr[x].compareTo(subStr[y])>0) {
                    String temp = subStr[x];
                    subStr[x] = subStr[y];
                    subStr[y] = temp;
                }
            }
        }
        
        System.out.println();
        System.out.println("After sorting:");
        Stream.of(subStr).forEach(i -> System.out.print(i + " "));
        
        smallest = subStr[0];
        largest = subStr[subStr.length-1];
        System.out.println();
        System.out.println("smallest:" + smallest);
        System.out.println("largest:" + largest);
    }
    
    static Double factorial(Double n) {
    	if(n<=0) {
    		return 1D;
    	} else {
    		Double r = n * factorial(n-1);
    		//System.out.println(r);
    		return r;
    	}
    }

}