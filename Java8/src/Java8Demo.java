import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Java8Demo {
	public static void main (String a[]) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(10);
		
		//get the numbers that are divisible by 5
		
		list.stream().filter(i->i%5==0).forEach(System.out::println);
		
		System.out.println("-----------------");
		//multiply all elements by 2
		list.stream().map(e -> e*2).forEach(System.out::println);
		
		
		
		//Get all the empty elements
		
	}
}