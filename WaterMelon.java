package programmers;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class WaterMelon {
    public String solution(int n) {
        String wm = "¼ö¹Ú";
    	ArrayList<Character> list = new ArrayList<Character>();
    	for(int i = 0 ; i<n ; i++) {
    		list.add(i,wm.charAt(i%2));
    	}
        String answer = list.stream().map(c -> String.valueOf(c)).collect(Collectors.joining());
        return answer;
    }
}
