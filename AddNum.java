package programmers;

public class AddNum {
	static int answer = 0;
	static int n = 9345;
	static int k;
	
	public static int solution(int n) {
		k = Integer.toString(n).length();
		return func(n,k);
	}

    public static int func(int n, int k) {
    	int pow = (int) Math.pow(10, k);
    	int n2 = (int) (n%pow);
    	k = k-1;
    	answer = answer + n/pow;
    	if(k == -1) {
    		return answer;
    	}
    	return func(n2, k);
    }
}
