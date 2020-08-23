package programmers;

public class ProgrammersSol9 {
	public long solution(int a, int b) {
		long c = ((a + b) * (Math.abs(a - b) + 1)) / 2;
		long answer = c;
		return answer;
	}
}
