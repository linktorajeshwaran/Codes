
public class PrisonerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=7,m=19,s=2;
		int n=3,m=7,s=3;
		//int n=5,m=2,s=1;
//		int count=0,result=0;
//		int sweetNum = 0;
//		for (int x=s; x<=n;x++) {
//            sweetNum = sweetNum + 1;
//            System.out.println("sweetNum : " + sweetNum);
//            if(m == sweetNum) {
//                result = x;
//                break;
//             }
//            if(x==n) {
//            	System.out.println("before change x: " + x);
//                x=0;
//                System.out.println("changed x: " + x);
//            }
//
//            System.out.println("x: " + x);
//            
//        }
//		System.out.println("result: " + result);
//		int r=0;
//		if (n>m)
//			r = n%m;
//		else if (m>n)
//			r = n%m;
//		
//		System.out.println("r:" + r);
//		int x = 0;
//		for (x=s;x<=r;x++) {
//			
//		}
//		System.out.println(x);
		int res = 0;
		if(n>=m) {
			int swNum = 0;
			for (int x=s; x<=n;x++) {
				swNum++;
				if(m==swNum) {
					res = x;
					break;
				}
				if(x==n)
					x=0;
				
			}			
		} else if(m>n) {
			int k = m%n;
			int swNum = 0;
			for (int x=s;x<=n;x++) {
				swNum++;
				if(k==swNum) {
					res = x;
					break;
				}
				if(x==n)
					x=0;
			}
		}
		System.out.println(res);
	}

}
