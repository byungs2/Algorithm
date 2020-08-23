package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class KthNum {
    public int[] solution(int[] array, int[][] commands) {
    	int index = 0;
		ArrayList<Integer> answerlist = new ArrayList<>();
    	for(int j = 0; j < commands.length; j++) {
        		int list = Arrays.stream(array, commands[j][0]-1, commands[j][1]).sorted().toArray()[commands[j][2]-1];
        		answerlist.add(list);
    	}
        int[] answer = new int[answerlist.size()];
        for(int i : answerlist) {
        	answer[index] = i;
        	index =+ 1;
        }
        return answer;
    }
}
