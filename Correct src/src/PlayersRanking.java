import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PlayersRanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//100 100 50 40 40 20 10
		List<Integer> ranked = new ArrayList<>();
//		ranked.add(100);
//		ranked.add(100);
//		ranked.add(50);
//		ranked.add(40);
//		ranked.add(40);
//		ranked.add(20);
//		ranked.add(10);
		
		ranked.add(1);
		
		//5 25 50 120
		List<Integer> playersList = new ArrayList<>();
//		playersList.add(5);
//		playersList.add(25);
//		playersList.add(50);
//		playersList.add(120);
		
		playersList.add(1);
		
		List<Integer> unique = ranked.stream().distinct().sorted().collect(Collectors.toList());
		Collections.sort(unique, Collections.reverseOrder());
		List<Integer> result = new ArrayList<>();
		System.out.println("ranked: " + unique);
		System.out.println("Scores:" + playersList);
		for (int r=0;r<playersList.size();r++) {
			
			int playerScore = playersList.get(r);
			int rr= 0;
			System.out.println("--------------------------");
			System.out.println("For player score:" + playerScore);
			  for (int t=unique.size()-1;t>0;t--) {
				  
				  int rank = unique.get(t);
				  System.out.println("rank: " + rank);
				  //if(t+1 != unique.size()) {
					  int nextRank = unique.get(t-1);
					  System.out.println("next rank: " + nextRank);
					  if (playerScore >= rank && playerScore < nextRank) 
					  {
						  rr = t+1;
						  System.out.println("rr set: p>=r && p<=n:" + rr);
						  break;
					  } else if (playerScore < rank) {
						  rr = unique.size()+1;
						  System.out.println("rr set: p<r:" + rr);
						  break;
					  } else if (playerScore > rank && t==1) {//only for last elem
						  rr = 1;
						  System.out.println("rr set: p>r:" + rr);
						  break;
					  }
				  //} else { 
					  //rr = t+1;
					  //System.out.println("rr set: t+1:" + rr);
					  //break;
				  //}
					 
			  }
			  System.out.println("--------------------------");
			  result.add(rr);
			}
		System.out.println(result);
				/*TreeMap<Integer,Integer> rankedTreeMap = new TreeMap<>();
		        int c=1;
		        //ranked.stream().forEach(i->rankedTreeMap.put(i, c++));
		        for (Integer r : unique) {
		        	rankedTreeMap.putIfAbsent(r, c++);
		        }
		        
		        Set<Integer> keyList = rankedTreeMap.keySet();
		        List valu = null;
		        for (Integer score : playersList) {
		        	valu = keyList.stream().filter(item -> score<=item).collect(Collectors.toList());
		        	System.out.println(valu.get(0));
		        }
		        
		        System.out.println(rankedTreeMap);*/
			}
			
}
