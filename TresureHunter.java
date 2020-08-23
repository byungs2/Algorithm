package programmers;

public class TresureHunter {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
        int map1[][] = new int[n][n];
        int map2[][] = new int[n][n];
        String list[][] = new String[n][n];
        String answer[] = new String[n];
        for(int i = 0; i<n ;i++) {
        	for(int j = 0; j<n; j++) {
        		map1[i][n-1-j] = arr1[i]%2;
        		map2[i][n-1-j] = arr2[i]%2;
        		arr1[i] = arr1[i]/2;
        		arr2[i] = arr2[i]/2;
        	}
        }
        for(int i = 0; i<n ;i++) {
        	for(int j = 0; j<n; j++) {
        		if(map1[i][j] == 1 || map2[i][j] == 1) {
        			list[i][j] = "#";
        		}else {
        			list[i][j] = " ";
        		}
        	}
        }
        for(int i = 0; i<n; i++) {
        	answer[i] = String.join("", list[i]);
        }
        return answer;
    }
}
