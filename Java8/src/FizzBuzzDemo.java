import java.util.function.Function;
import java.util.function.Predicate;

/*
 * Fizz Buzz
Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
For numbers which are multiples of both three and five return 'FizzBuzz'.
For numbers that are neither, return the input number.
*/
public class FizzBuzzDemo {
	
	
	static Function<Integer,String> fizzOrBuzz = (i) -> {
		String result = "";
		if(i%3==0) {
			result += "fizz";
		}
		if(i%5==0) {
			result+="buzz";
		}
		return result;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fizzOrBuzz.apply(15));;
	}

}
