package hackerranck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class QueensAttack {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		int r_q=4;
		int c_q=3; 
		List<List<Integer>> obstacles = new ArrayList<>();
		obstacles.add(Arrays.asList(new Integer[] {5,5}));
		obstacles.add(Arrays.asList(new Integer[] {4,2}));
		obstacles.add(Arrays.asList(new Integer[] {2,3}));
		
		if(obstacles.isEmpty()) {
			
		}
		
		List<String> posObsList = new ArrayList<>();
		obstacles.stream().forEach((List<Integer> list) -> {
			String va = list.get(0)+ "" + list.get(1);
			posObsList.add(va);
		});
		
		//Queen can traverse 8 directions.
		//Four straight directions 
		//moving up - that increasing row num from curr position
		
		int[] counter = new int[1];
		counter[0]=0;
		//---------------------------------------------------------------------------------------------
		try {
			Stream.iterate(r_q+1 , r -> r<=n, r -> r+1).forEach((row)->{
				String pos = String.valueOf(row)  + (String.valueOf(c_q));
				if(posObsList.contains(pos)) {
					throw new RuntimeException();
				} else {
					counter[0]++;
				}
			});
		  } catch (Exception e) {
			  
		  }
			System.out.println(" After moved up :" + counter[0]);
//			//Moving down
			try {
				Stream.iterate(r_q-1, r->r!=0 , r -> r-1 ).forEach((row)-> {
					String pos = String.valueOf(row) + (String.valueOf(c_q));
					if(posObsList.contains(pos)) {
						throw new RuntimeException();
					} else {
						counter[0]++;
					}
				});
			} catch (Exception e) {
				  
			}
			System.out.println(" After moved  odwn :" + counter[0]);
			
			//Moving left 
			try {
				Stream.iterate(c_q-1, c->c!=0 , c -> c-1 ).forEach((col)-> {
					String pos = String.valueOf(r_q) + (String.valueOf(col));
					if(posObsList.contains(pos)) {
						throw new RuntimeException();
					} else {
						counter[0]++;
					}
				});
			} catch (Exception e) {
				
			}
			
			System.out.println(" After moved left :" + counter[0]);
			//Moving right
			try {
				Stream.iterate(c_q+1, c -> c<=n , c -> c+1 ).forEach((col)-> {
					String pos = String.valueOf(r_q) + (String.valueOf(col));
					if(posObsList.contains(pos)) {
						throw new RuntimeException();
					} else {
						counter[0]++;
					}
				});
			} catch (Exception e) {
				
			}
			System.out.println(" After moved right :" + counter[0]);
			//---------------------------------------------------------------------------------------------
		 
		//Diagonals
		//From left to right - up side
		int startRowNum = r_q+1;
		int startColNum = c_q+1;

		counter[0] = counter[0] + traverseDiagonally(startRowNum, startColNum, n, posObsList, "l2rup");
		
		System.out.println(" After moved dia left to right up :" + counter[0]);
		
		//From right to left - up side
		startRowNum = r_q + 1;
		startColNum = c_q - 1;
		counter[0] = counter[0] + traverseDiagonally(startRowNum, startColNum, n, posObsList, "r2lup");
		
		System.out.println(" After moved dia right to left up :" + counter[0]);
		
		//Left to right - Down 
		startRowNum = r_q - 1;
		startColNum = c_q + 1;
		counter[0] = counter[0] + traverseDiagonally(startRowNum, startColNum, n, posObsList, "l2rdown");
		
		System.out.println(" After moved dia left to right down :" + counter[0]);
		
		//Right to left - Down
		startRowNum = r_q - 1;
		startColNum = c_q - 1;
		counter[0] = counter[0] + traverseDiagonally(startRowNum, startColNum, n, posObsList, "r2ldown");
		
		System.out.println(" After moved dia right to left down :" + counter[0]);
		
		System.out.println(counter[0]);
		
	}
	
	private static int traverseDiagonally(int startRowNum, int startColNum, int n, List<String> posObsList, String dir) {
		int counter = 0;
		while (true) {
			String pos = String.valueOf(startRowNum).concat(String.valueOf(startColNum));
			if(posObsList.contains(pos) || startRowNum==0 || startRowNum>n || startColNum==0 || startColNum>n) {
				break;
			} else {
				counter++;				
				if(dir.equals("l2rup")) {
					startRowNum++;
					startColNum++;
				}
				else if(dir.equals("r2lup")) {
					startRowNum++;
					startColNum--;
				}
				else if (dir.equals("l2rdown")) {
					startRowNum--;
					startColNum++;
				} else if(dir.equals("r2ldown")) {
					startRowNum--;
					startColNum--;
				}				
			}
		}
		return counter;
	}

}
