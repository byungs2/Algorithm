package programmers;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        int answer = d.length;
        int sum = 0;
        for(int i : d) {
        	sum = sum +i;
        }
        Arrays.sort(d);
        for(int i = 0; i<d.length; i++) {
        	if (sum > budget) {
        		sum = sum - d[d.length-1-i];
        		answer = answer-1;
        	}        	
        }
        return answer;
    }
}
