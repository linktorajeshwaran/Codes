import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class CombinedPurchase {

	public static void main(String[] args) {

		int[] keyboards = new int[] {40,50,60};
		int[] drives = new int[] {5,8,12};
        Set<Integer> l = new TreeSet<Integer>();
        for (int x=0;x<keyboards.length;x++) {
            int kbPrice = keyboards[x];
            for (int y=0;y<drives.length;y++) {
                int dPrice = drives[y];
                //r[x] = kbPrice + dPrice;
                l.add(kbPrice+dPrice);
            }
        }
        System.out.println(l.stream().sorted(Comparator.naturalOrder()).max(Comparator.naturalOrder()).get());;
        
        
	}

}
