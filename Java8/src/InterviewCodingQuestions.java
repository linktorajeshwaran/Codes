import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class InterviewCodingQuestions {
	
	static Function<String,String> strRev = s -> {
		System.out.println(new StringBuilder(s).reverse().toString());
		return "";
	};
	
	

	static void stringReverse(String t) {
		strRev.apply(t);
	}
	
	static void swapWithoutTemp(int a , int b) {
		b = a+b;
		a=b-a;
		b=b-a;
		System.out.println(a +" "+ b);
	}
	
	static void allEvenNums(Set<Integer> input) {
		input.stream().forEach(s -> {
			if (s==0 || s==1) {
				System.out.println("Not even");
			}else if(s%2==0) {
				System.out.println(s);
			}
		});
	}
	
	
	static void printFirstNonRepeatingChar(String input) {
		//It is mandatory to use the linkedHashmap to maintain the insertion order, as we need to FIRST NON-repeating char
		Map<Character, Integer> charCountMap = new LinkedHashMap<Character, Integer>();
		
		for (Character c : input.toCharArray()) {
			if(charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c)+1);
			} else {
				charCountMap.put(c, 1);
			}			
		}
		
		System.out.println(charCountMap.entrySet().stream().filter(c -> c.getValue()==1).findFirst());
		
	}
	
	static void printFibonacci(int n) {
		int a = 0;
		int b = 1;
		int c = 1;
		
		for (int x=0;x<n;x++) {
			System.out.print(a + ", ");
			a = b;
			b = c;
			c = a+b;
		}
		
	}
	
	static int fibonacciNumberUsingRecursion(int n) {
		if (n<=1)
			return n;
		return fibonacciNumberUsingRecursion(n-1) + fibonacciNumberUsingRecursion(n-2);
	}
	
	
	static long factorial(long n) {
		if(n==1)
			return 1;
		else 
			return n * factorial(n-1);
	}
	
	static int findSecondHighest(Integer[] arr) {
		int firstHighest = Integer.MIN_VALUE;
		int secHighest = Integer.MIN_VALUE;
		
		for (int i : arr) {
			if (i>firstHighest) {
				secHighest = firstHighest;
				firstHighest = i;
			}else if (i>secHighest) {
				secHighest = i;
			}
		}
		return secHighest;
	}
	
	public static void main (String a[]) {
		//String reverse
		//stringReverse("America");		
		//swapWithoutTemp(3, 4);
		
		Set<Integer> in = new HashSet<>();
		in.add(1);
		in.add(4);
		in.add(0);
		//System.out.println(in);
		//allEvenNums(in);
		
		//Max element in set
		//System.out.println(in.stream().max(Comparator.naturalOrder()).get());
		
		//First non-repeating char
		//printFirstNonRepeatingChar("a frequency count of each ASCII character between 0 – 255");
		
		//Fibonacci Series 
		//Print fibonacci series
		//printFibonacci(10);
		//Get fibonacci number using recursion
		//System.out.print(fibonacciNumberUsingRecursion(10)+ " ");;
		
		//Check the list of integers contains only odd numbers
		Integer[] inputIntArr = new Integer[] {1,3,5,7};
		LinkedList<Integer> li = new LinkedList<Integer>();
		
		//System.out.println(li);
		//System.out.println(Stream.of(inputIntArr).allMatch(v -> v%2!=0));
		
		//Factorial of n
		//Logic: F(n) = F(1) * F(2) * F(3) *...*F(n-1)*F(n)
		//Note For factorial you have to use long datatype
		System.out.println(factorial(8));
		
		//Sum of all elements in an array
		System.out.println(Stream.of(inputIntArr).mapToInt(c->c).sum());
		
		//Find the second highest without using inbuilt sorting
		System.out.println(findSecondHighest(inputIntArr));;
	}
}
