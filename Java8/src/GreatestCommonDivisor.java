
public class GreatestCommonDivisor {

	public static Integer gcd(Integer p, Integer q) {
		if(q==0) {
			return p;
		}
		return gcd(q,p%q);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(gcd(40,50));
	}

}
