package programmers;

public class HaNum {
    public static boolean solution(int x) {
        boolean answer = false;
        int y = x;
        int sum = 0;
        int len = Integer.toString(x).length();
        for(int i = 0; i < len; i++) {
        	sum = sum + x%10;
        	x = x/10;
        }
        if(y%sum == 0) {
        	answer = true;
        }
        return answer;
    }
}
