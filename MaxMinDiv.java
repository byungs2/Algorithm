package programmers;

public class MaxMinDiv {
	
	
    public int[] solution(int n, int m) {
    	int maxdiv = n;
    	while (true) {
    		if(n%maxdiv == 0 && m%maxdiv == 0) {
    			break;
    		}
    		maxdiv = maxdiv - 1;
    	}
        int[] answer = {maxdiv, m*n/maxdiv};
        return answer;
    }
}
//class Solution {
//    public int[] solution(int a, int b) {
//        int[] answer = new int[2];
//
//          answer[0] = gcd(a,b);
//        answer[1] = (a*b)/answer[0];
//        return answer;
//    }
//
//   public static int gcd(int p, int q)
//   {
//    if (q == 0) return p;
//    return gcd(q, p%q);
//   }
//
