package programmers;

import java.util.ArrayList;

public class SumDivisor {
    public int solution(int n) {
    	ArrayList<Integer> integerlist = new ArrayList<Integer>();
    	for(int i = 1; i < n+1 ; i ++) {
    		if (n%i == 0) {
    			integerlist.add(i);
    		}
    	}
        int answer = 0;
        for(int i : integerlist) {
        	answer = answer + i;
        }
        return answer;
    }
}
