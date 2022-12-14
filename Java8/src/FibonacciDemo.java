import java.util.function.Consumer;
import java.util.function.Function;

/*
 * Fibonacci Number
Write a method that returns the nth element of the Fibonacci Sequence
The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,...
The next number is found by adding up the two numbers before it.
Assume that indexes start at zero, e.g., fib(0) = 0, fib(1) = 1, ..
 */
public class FibonacciDemo {

	static Consumer<Integer> printFibo = (num) -> {
		Integer a =0;
		Integer b=1;
		Integer c=0;
		System.out.print(a + " " + b);
		for (int i = 2; i<num;i++) {
			c=a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
		}
	};
	
	static Integer printFiboRecursion (Integer num) {
		if(num == 1)
			return 1;
		else if(num == 0)
			return 0;
		
		return printFiboRecursion(num-1) +  printFiboRecursion(num-2);
	};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//printFibo.accept(10);
		System.out.println(printFiboRecursion(10));;
	}

}
