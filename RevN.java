package programmers;

import java.util.ArrayList;

public class RevN {
    public static int[] solution(long n) {
    	ArrayList<Integer> list = new ArrayList<>();
    	String arr [] = String.valueOf(n).split("");
    	for(String i : arr) {
    		list.add(Integer.parseInt(i));
    	}
    	int answer[] = new int[list.size()];
    	for(int i=0;i<list.size(); i++) {
    		answer[i] = list.get(list.size()-i-1);
    		System.out.println(answer[i]);
    	}
        return answer;
    }
}
