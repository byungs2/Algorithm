package programmers;

public class AvgNum {
    public double solution(int[] arr) {
        double answer2 = 0;
        double answer = 0;
    	for(int i:arr) {
    		answer2 = answer2 + i;
    	}
    	answer = answer2/arr.length;
        return answer;
    }
}
