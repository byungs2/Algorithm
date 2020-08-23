package programmers;

public class XN {
    public long[] solution(int x, int n) {
    	long count = 0;
    	long a[] = new long[n];
    	for(int i = 0 ; i < n ; i++) {
    		count = count + x;
    		a[i] = count;
    	}
        long[] answer = a ;
        return answer;
    }
}
