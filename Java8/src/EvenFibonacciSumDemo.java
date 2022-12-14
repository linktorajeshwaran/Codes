import java.util.function.Function;

public class EvenFibonacciSumDemo {
	
	static Function<Integer,Integer> evenSum = (n) -> {
		Integer prev = 1;
		Integer curr = 2;
		Integer result = 0;
		do {
			if(curr%2==0) {
				result += curr;
			}
			int newFibo = curr + prev;
			prev = curr;
			curr = newFibo;
		} while(curr<n) ;
 			
		return result;
	};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evenSum.apply(50));
		System.out.println(evenSum.apply(1000));
		System.out.println(evenSum.apply(450));
	}

}
