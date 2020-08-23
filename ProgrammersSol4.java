package programmers;

class ProgrammersSol4 {

	public int solution(int n, int[] lost, int[] reserve) {
		int c = n;
		int totalarry[] = new int[n + 2];
		for (int i = 0; i < totalarry.length; i++) {
			totalarry[i] = 1;
		}
		for (int i : lost) {
			totalarry[i] = totalarry[i] - 1;
		}
		for (int i : reserve) {
			totalarry[i] = totalarry[i] + 1;
		}
	
		totalarry[0] = 5;
		totalarry[n + 1] = 5;
		for (int i = 1; i < n + 1; i++) {
			if (totalarry[i] == 0 && totalarry[i - 1] == 2) {
				totalarry[i]++;
				totalarry[i - 1]--;
				if (totalarry[i - 1] == 2) {
					totalarry[i - 1] = 0;
				}
			} else if (totalarry[i] == 0 && totalarry[i + 1] == 2) {
				totalarry[i]++;
				totalarry[i + 1]--;
				if (totalarry[i + 1] == 2) {
					totalarry[i + 1] = 0;
				}
			}
		}
		for (int i : totalarry) {
			if (i == 0) {
				c--;
			}
		}

		int answer = c;
		return answer;
	}
}