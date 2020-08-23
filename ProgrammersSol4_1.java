package programmers;

public class ProgrammersSol4_1 {
	
	public int solution(int n, int[] lost, int[] reserve) {
		int totalarry[] = new int[n];
		int count = n;
		for (int i = 0; i < totalarry.length; i++) {
			totalarry[i] = 1;
		}
		for (int i : lost) {
			totalarry[i-1] = totalarry[i] - 1;
		}
		for (int i : reserve) {
			totalarry[i-1] = totalarry[i] + 1;
		}
		
		//lost 양쪽에 Reserve
		for(int i = 1; i < n-1; i++) {
			if(i == 0) {
				if(totalarry[i+1] == 2 && totalarry[i-1] == 2) {
					count++;
				}
			}
		}
		
		//reserve 양쪽에 lost
		for(int i = 1; i < n-1; i++) {
			if(i == 2) {
				if(totalarry[i+1] == 0 && totalarry[i-1] == 0) {
					count--;
				}
			}
		}
		
		// lost 양쪽에 normal or lost
		for(int i = 1; i < n-1; i++) {
			if(i == 0) {
				if((totalarry[i+1] == 1 || totalarry[i+1] == 0) && (totalarry[i-1] == 1 || totalarry[i-1] == 0)) {
					count--;
				}
			}
		}
		// 양 끝에 lost 앞뒤에 normal or lost
		if(totalarry[0] == 0 && (totalarry[1] == 1 || totalarry[1] == 0)) {
			count--;
		}
		if(totalarry[n-1] == 0 && (totalarry[n-2] == 1 || totalarry[n-2] == 0)) {
			count--;
		}
		
		int answer = Math.min(n,count);
		return answer;
	}
}	
