import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BinaryOperationsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> topic = new ArrayList<>();
		topic.add("111001000111001101101111100110100110011111000111111011010111111011111111010110011001111001100011101011110011111111110101100010100100001111101010110110110111110100111111001011100011111111000000101011111110110101111111101000111100010111111011111110101010110111010101010110111110110011010010011011101111");
		topic.add("111010111111111111111110110110011111111101011100011100010011101100111100110001010110111111110100101001111101110111111010111100010111110111101111000111100101011111111001100111111010111111111011111111101010101001000010111111000110010100101101111011111010111000111111010011111100011100101111001111011111");
		topic.add("111101000101101110010111110011111111110110110111011110111110101101111110110011110111011000101110101110010111010101010110100110011001010111001010101011111100100111011111101011111111000100111111110110101010101111111011011011101110111111011111111110111011101010010101110111011011011111100111111111001101");
		 Map<String, Integer> teamKnownTopicsMap = new HashMap<>();
	        for (int i=0;i<topic.size();i++) {
	            //Integer team1Topic = Integer.parseInt(topic.get(i),2);
	            char[] team1TopicArr = topic.get(i).toCharArray();
	            //int[] resultTopicsKnown = new int[team1TopicArr.length];
	           
	            for(int j=i+1;j<topic.size();j++) {                
	            	char[] team2TopicArr = topic.get(j).toCharArray();
	            	int count = 0;
	                for(int k=0;k<team1TopicArr.length;k++) {
	                	System.out.print(team1TopicArr[k]);
	                	System.out.print("|");
	                	System.out.println(team2TopicArr[k]);
	                    int elem = Character.getNumericValue(team1TopicArr[k])|Character.getNumericValue(team2TopicArr[k]);
	                    
	                   if(elem == 1)
	                	   count++;
	                    //System.out.println(resultTopicsKnown);
	                }  
	                teamKnownTopicsMap.put(i+","+j, count);
	                System.out.println(teamKnownTopicsMap);
	                count=0;         
	            }
	        }
	        List<Integer> result = new ArrayList<>();
	        int maxTopicsKnown = (int)teamKnownTopicsMap.values().stream().max(Comparator.naturalOrder()).get();
	        Integer numOfTeamsKnows = (int)teamKnownTopicsMap.values().stream().filter(v->v==maxTopicsKnown).count();
	        result.add(maxTopicsKnown);
	        result.add(numOfTeamsKnows);
	        System.out.println(result);;
	}

}
