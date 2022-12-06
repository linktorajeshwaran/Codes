
public class ChoclateFeast {

	public static void main(String a[]) {
		//54844 72 5442
		int n = 54844;
		int c = 72;
		int m = 5442;
		
//		int w = n/c;
//        int r = w%m;
//        int res = w;
//        while (w>=m) {
//            w = w/m;
//            if(w>m) 
//                r = r + w%m;
//            res = res + w;
//            if (r%m>=0) {
//              res = res+ r;;
//            }
//        }
		
		Integer w = n/c;
        Integer r = w%m;
        Integer res = w;
        while (w>=m) {
            w = w/m;
            res = res + w;
            r= r + w%m;
            if(r/m>0 && r%m>=0)
                res = res + r/m;
        }
        System.out.println(res);
	}
}
