/*
 * Two Sum (Pair with a Given Sum)
Write a method that checks if there is at least on pair of numbers which sum equals target.
arr=[1, 3, 4] and target=5 result is true because the pair (1,4) sums to five.
public Boolean sumsToTarget(Integer[] arr, Integer target) {
public Boolean sumsToTarget(Integer[] arr, Integer target) {
 */
public class TwoSumToTargetDemo {

	private static Boolean sumsToTarget(Integer[] arr, Integer target) {
		Boolean result = false;
		for(int x=0;x<arr.length;x++) {
		  int elem = arr[x];
		  for(int y=x;y<arr.length;y++) {
		    int elem1 = arr[y];
		    if(target==elem+elem1) {
		      result = true;
		      break;
		    }
		  }
		  if(result) {
		    break;
		  }
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = new Integer[] {-1, 4, 2, 1};
		System.out.println(sumsToTarget(arr,0));;
	}

}
