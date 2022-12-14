import java.util.function.Function;
import java.util.stream.IntStream;

/*
Prime Number
A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.
Write a method that checks if a number is a prime number.
*/

public class PrimeNumberCheck {
	
	static Function<Integer,Boolean> isPrime = (num) -> {
		if(num<=1) {
			return false;
		} else {
			return !IntStream.range(2,num).anyMatch(i->num%i==0);
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPrime.apply(12));;
	}

}
