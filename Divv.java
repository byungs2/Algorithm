package programmers;

//ArrayList를 쓰면 속도가 더 느려진다 ;
public class Divv {
	public int solution(int n) {
		int answer = 0;
		boolean[] list = new boolean[n + 1];
		for (int i = 2; i <= n; i++)
			list[i] = true;

		int root = (int) Math.sqrt(n);
		for (int i = 2; i <= root; i++) {
			if (list[i] == true) {
				for (int j = i * i; j <= n; j += i)
					list[j] = false;
			}
		}
		for (int i = 2; i <= n; i++) {
			if (list[i] == true)
				answer++;
		}
		return answer;
	}
}
