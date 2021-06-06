package pk3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine().toUpperCase();
		Map<Character,Integer> cntMap = new HashMap<>();
		
		for(int i = 0; i<word.length() ; i++) {
			char splt = word.charAt(i);
			cntMap.put(splt, cntMap.getOrDefault(splt, 0)+1);
		}
		int maxValue = Collections.max(cntMap.values());
		
		String ans = getKey(cntMap,maxValue);
		if(ans.length() ==1)System.out.println(ans);
		else System.out.println("?");
		
		br.close();
	}
	public static <Key, Value> String getKey(Map<Key, Value> map, Value value) {
		 String getkey = ""; 
        for (Key key : map.keySet()) {
            if (value.equals(map.get(key))) {
                getkey += key;
            }
        }
        return getkey;
    }
}