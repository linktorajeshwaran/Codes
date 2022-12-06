import java.util.stream.Stream;

public class RepeatedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n = 10;
		String s = "abcd";
		int len = (int) n;
		
        char[] inputArr = new char[len];
        char[] strCharArr = s.toCharArray();
        int cnt = 0;
        if(len>s.length()) { 
            for (int x=0;x<strCharArr.length;x++) { 
                if(cnt+1!=len) {
                	System.out.println(strCharArr[x]);
                    inputArr[cnt] = strCharArr[x];
                    System.out.println(inputArr[cnt]);
                    cnt++;
                } 
                if(cnt+1==len) {
                    break;
                }
            	if(x==strCharArr.length)
                    x=0;                   
            }
        } else if(len<s.length()) {
            inputArr = s.substring(0,len+1).toCharArray();
        } else {
            inputArr = s.toCharArray();
        }
        //String vv = inputArr.toString();
        System.out.println("-----");
        for(char ccc: inputArr) {
        	System.out.println(ccc);
        }
        System.out.println(inputArr[5]);
        System.out.println(inputArr.toString().chars().filter(cc->(char)cc=='a').count()); 
        
	}

}
