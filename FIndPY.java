package programmers;

public class FIndPY {
    boolean solution(String s) {
    	String s_new = s.toLowerCase();
    	int county = 0;
    	int countp = 0;
    	boolean answer = false;
    	for(int i = 0 ; i < s_new.length(); i++) {
    		if(s_new.charAt(i) == 'y') {
    			county++;
    		}
    		if(s_new.charAt(i) == 'p') {
    			countp++;
    		}
    	}
    	if(countp == county) {
    		answer = true;
    	}
    	return answer;
    }
    //s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();
}	
