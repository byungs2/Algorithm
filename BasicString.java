package programmers;
//정규 표현식!
public class BasicString {
    public boolean solution(String s) {
        boolean answer = false;
        	if(s.matches("^[0-9]*$") && s.length() == 4 || s.length() == 6 ) {
        		answer = true;
        	}
        return answer;
    }
}
