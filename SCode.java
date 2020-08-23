package programmers;

public class SCode {
    public static String solution(String s, int n) {
        char lower_alpha[] = new char[26];
        char upper_alpha[] = new char[26];
        for(int i = 0; i<26; i++) {
        	lower_alpha[i] = (char)(97+i);
        	upper_alpha[i] = (char)(65+i);
        }
        char arr[] = s.toCharArray();
        for(int i = 0; i<arr.length;i++) {
        	for(int j = 0;j<26;j++) {
        		if(arr[i] == lower_alpha[j]) {
        			arr[i] = lower_alpha[(j+n)%26];
        			break;
        		}else if(arr[i] == upper_alpha[j]) {
        			arr[i] = upper_alpha[(j+n)%26];
        			break;
        		}
        	}
        }
        String answer = String.valueOf(arr);
    	return answer;
    }
}
