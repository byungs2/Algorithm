package programmers;

public class MrKim {
    public String solution(String[] seoul) {
    	int count = -1;
    	for (String i : seoul) {
    		count++;
    		if(i.equals("Kim")) {
    			break;
    		}
    	}
        String answer = "�輭���� " + Integer.toString(count) + "�� �ִ�";
        return answer;
    }
}
