package programmers;

class ProgrammersSol1 {
	private int column[] = new int[1000];
	private int index;
	private int answer;

	public int solution(int[][] board, int[] moves) {

		for (int i = 0; i < moves.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[j][moves[i] - 1] != 0) {
					column[index] = board[j][moves[i] - 1];
					board[j][moves[i] - 1] = 0;
					index++;
					if (index >= 2 && column[index - 1] == column[index - 2]) {
						column[index - 1] = 0;
						column[index - 2] = 0;
						index = index - 2;
						answer = answer + 2;
					}
					break;
				}
			}
		}
		return answer;
	}
}