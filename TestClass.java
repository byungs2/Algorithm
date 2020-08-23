package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {
	static String arr1 []  = {"mislav", "stanko", "mislav", "ana"};	
	static String arr2 []  = {"stanko", "ana", "mislav"};	
	public static String solution(String[] participant, String[] completion) {
		List<String> list = new ArrayList<>(Arrays.asList(completion));
		String answer = null;
		for(String i : participant) {
			if(!list.remove(i)) {
				answer = i;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		solution(arr1,arr2);
	}
}
/*import java.util.*;

class Solution {
   public String solution(String[] participant, String[] completion) {
       Map<String, Integer> hash = new HashMap<>();
       for (String arg : participant) hash.put(arg, hash.getOrDefault(arg, 0) + 1);
       for (String arg : completion) hash.put(arg, hash.get(arg) - 1);

       for (String key : hash.keySet()) {
           if (hash.get(key) != 0) return key;
       }

       return null;
   }
}
*/
