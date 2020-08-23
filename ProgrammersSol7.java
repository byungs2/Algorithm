package programmers;

import java.util.*;

public class ProgrammersSol7 {
	public int[] solution(int[] arr) {
		int count = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				list.add(arr[i]);
			}
		}
		list.add(arr[arr.length - 1]);

		int[] answer = new int[list.size()];
		for (int i : list) {
			answer[count++] = i;
		}
		return answer;
	}
}