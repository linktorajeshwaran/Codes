import java.util.stream.Stream;

public class CompareCharCountIn2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c1 = new char[] {'s','v','b'};
		char[] c2 = new char[] {'s','l','v'};
		
		if(c1.length != c2.length) {
			System.out.println("length not equal");
		}
		
		char[] d1 = sorted(c1); 
		char[] d2 = sorted(c2);

		if(new String(d1).equalsIgnoreCase(new String(d2))) {
			System.out.println("same count");
		}
		
	}
	
	static char[] sorted(char[] c) {	
		
		
		for (int x=0;x<c.length;x++) {
			
			for (int y = x+1;y<c.length;y++) {
				if(c[x]>c[y]) {
					char t = c[x];
					c[x] = c[y];
					c[y] = t;
				}
			}
		}
		
		Stream.of(c).forEach(System.out::print);
		System.out.println();
		return c;
		
	}

}
