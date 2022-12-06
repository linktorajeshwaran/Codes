import java.util.stream.Stream;

public class SortingCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] c = new char[] {'s','v','b'};
		
				
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
		
	}
	

}
