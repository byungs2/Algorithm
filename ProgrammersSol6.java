package programmers;

public class ProgrammersSol6 {
	String m;
    public String solution(String s) {
    	int len = s.length();
    	
        if(len%2 == 0){
        	m = s.substring(len/2 -1 ,len/2+1);
        }
        if(len%2 == 1){
        	m = s.substring((len-1)/2, (len-1)/2 +1);
        }
        
        String answer = m;
        return answer;
    }
}
