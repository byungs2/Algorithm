package programmers;

import java.util.Arrays;
//long으로 다 바꾸자
public class StringArray {
    public long solution(long n) {
    	int k = (int)n;
    	int len = Integer.toString((int)n).length();
        int arr[] = new int[len];
    	long answer = 0;
    	for(int i = 0; i < len; i++) {
    		arr[i] = (int) (k%10);
    		k = k/10;
    	}
    	Arrays.sort(arr);
    	for(int i = 0; i< len; i++) {
    		answer = (long) (answer + arr[i]*Math.pow(10, i));
    	}
        return answer;
    }
}
