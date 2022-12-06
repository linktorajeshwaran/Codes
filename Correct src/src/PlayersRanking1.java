import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PlayersRanking1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//100 100 50 40 40 20 10
		List<Integer> ranked = new ArrayList<>();
		ranked.add(100);
		ranked.add(100);
		ranked.add(50);
		ranked.add(40);
		ranked.add(40);
		ranked.add(20);
		ranked.add(10);
		
//		ranked.add(100);
//		ranked.add(90);
//		ranked.add(90);
//		ranked.add(80);
		
		//ranked.add(1);
		
		//5 25 50 120
		List<Integer> playersList = new ArrayList<>();
		playersList.add(5);
		playersList.add(25);
		playersList.add(50);
		playersList.add(120);
		
//		playersList.add(70);
//		playersList.add(80);
//		playersList.add(105);
		
		//playersList.add(1);
		
		List<Integer> unique = ranked.stream().distinct().sorted().collect(Collectors.toList());
		Collections.sort(unique, Collections.reverseOrder());
		Map<Integer, Integer> map = new LinkedHashMap<Integer,Integer>();
		for (int g=0;g<unique.size();g++) {
			map.put(unique.get(g), g+1);
		}
		Stream.of(map).forEach(System.out::println);
		//Set<Integer> keySet = (TreeSet<Integer>) tm.keySet();
		
		List<Integer> keyRankList = new ArrayList<>(unique);
		List<Integer> result = new ArrayList<>();
		for (int i=0;i<playersList.size();i++) {
			System.out.println("----------------------------------");
			Integer playerScore = playersList.get(i);		
			Integer rankScoreElem = 0;
			Integer nectRankScoreElem = 0;
			System.out.println("Player score:" + playerScore);
			if (keyRankList.size()>1) { 
				for (int j=0;j<keyRankList.size();j++) {
					rankScoreElem = keyRankList.get(j);
					if (j != keyRankList.size()-1)
						nectRankScoreElem = keyRankList.get(j+1);
					
					System.out.println("rankScoreElem : " + rankScoreElem);
					System.out.println("nectRankScoreElem: " + nectRankScoreElem);
					
					if(j==0 && playerScore > rankScoreElem) {
						//tm.get(key)
						result.add(1);
						System.out.println("Rank :" + 1);
						break;
					} else if(j != keyRankList.size()-1 && playerScore <= rankScoreElem && playerScore >= nectRankScoreElem) {
						result.add(map.get(nectRankScoreElem));
						System.out.println("Rank elf 1 : " + map.get(nectRankScoreElem));
						break;					
					} else if (j == keyRankList.size()-1 && playerScore < rankScoreElem) {
						result.add(keyRankList.size()+1);
						System.out.println("Rank elf 2 : " + map.get(rankScoreElem));
						break;
					}
					
				}
			} else {
				 result.add(map.get(playerScore));
			}
			System.out.println("----------------------------------");
			
			
			
		}
		System.out.println(result);
	}
			
}
