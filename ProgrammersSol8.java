package programmers;

import java.util.ArrayList;
import java.util.TreeSet;

public class ProgrammersSol8 {
    public int[] solution(int[] arr, int divisor) {
    	int count = 0;
    	int answer2 [] = {-1};
    	ArrayList<Integer> list = new ArrayList<>();
    	for(int i : arr) {
    		if(i%divisor == 0) {
    			list.add(i);
    		}
    	}
    	TreeSet<Integer> list2 = new TreeSet<>(list);
    	if(list.size() != 0) {
            int[] answer = new int [list.size()];
        	for(int i:list2) {
        		answer[count++] = i;
        	}
            return answer;
    	}
    	return answer2;
    }
}
