
public class NumberOfValleys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "UDDDUDUU";
        char[] pathArr = path.toCharArray();
        
        int sum = 0;
        boolean initialSum = true;
        int numOfValleys = 0;
        for (char p : pathArr) {
            if (p=='U') {
                sum = sum + 1;
            } else {
                sum = sum + (-1);
            }    
            System.out.println("Sum: " + sum);
            if(sum == 0 && p=='U') {
            	System.out.println("numV:" + numOfValleys + " sum:");
                numOfValleys++;
            }  
        }
        System.out.println(numOfValleys);
	}

}
