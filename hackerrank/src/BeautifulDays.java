
public class BeautifulDays {

	public static void main (String a[]) {
		int i = 20;
		int j = 23;
		int k = 6;
		int numOfBdays = 0;
        for (int x=i;x<=j;x++) {
            
            int diff = 1;
            diff = Math.abs(x-((x<10)?i:rev(String.valueOf(x))));
            
            int mod = diff%k;
            
            if (mod==0) {
                numOfBdays++;
            } 
        }
        System.out.println(numOfBdays);
    }
    
    private static int rev(String num) {
    	System.out.println("intput nuim rev:" + num);
        StringBuffer s = new StringBuffer(num);
        int c = Integer.parseInt(s.reverse().toString());
        System.out.println("rev:" + c);
        return c;
    }
}
