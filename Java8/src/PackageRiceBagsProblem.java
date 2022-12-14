/*
 * Package Rice Bags
Provided that you have a given number of small rice bags (1 kilo each) and 
big rice bags (5 kilos each), write a method that returns true if it is possible to make a package with goal kilos of rice.
 * 
 */
public class PackageRiceBagsProblem {

	public static void main(String[] args) {
		Integer small = 1;
		Integer big = 2;
		Integer goal = 12;
		
		Integer totalBig = 5 * big ;
		Integer totalSmall = 1 * small;
		if(goal<=totalBig+totalSmall) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	}

}
