import java.math.BigInteger;

public class FactorialDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger y = 0;
		
	}
	
	static BigInteger factorial (BigInteger n) {
		if (n.equals(1)) {
			return BigInteger.ONE;
		} else {
			return n * factorial(n-1);
		}		
	}

}
