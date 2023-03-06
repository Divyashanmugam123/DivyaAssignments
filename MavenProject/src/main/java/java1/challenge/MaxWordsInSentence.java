package java1.challenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxWordsInSentence {

	private static Set<Entry<String, Integer>> entrySet;

	public static void main(String[] args) {
		String sentences = "please wait, continue to fight, continue to win";
		
		String[] arrSen = sentences.split(",");
		
		int maxValue = 0;
		String key = "";
		
		Map<String, Integer> senMap = new HashMap<String, Integer>();
		
		for (int i=0;i<arrSen.length;i++)
		{
		
			String[] subSen = arrSen[i].split(" ");
			senMap.put(arrSen[i], subSen.length);
		}
		
		Set<Entry<String, Integer>> entrySet2 = senMap.entrySet();
		for (Entry<String, Integer> entry : entrySet2) {
		int value = entry.getValue();
		if(value > maxValue)
		{
			key = entry.getKey();
			maxValue = value;
		}
		}
		System.out.println("Maximum number of words = \""+key + "\" And it's occurences = "+maxValue);

	}

}
