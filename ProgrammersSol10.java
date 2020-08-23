package programmers;

import java.util.HashMap;

public class ProgrammersSol10 {
    public String[] solution(String[] strings, int n) {
    	HashMap<String,Character> s = new HashMap<String,Character>();
    	for(String i : strings) {
    		s.put(i,i.charAt(n-1));
    	}
    	
        String[] answer = {};
        return answer;
    }
}
