package programmers;

import java.util.HashMap;
import java.util.Map;

class ProgrammersSol2 {
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

/*
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
*/