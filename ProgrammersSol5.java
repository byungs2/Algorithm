package programmers;

public class ProgrammersSol5 {
	String date;
    public String solution(int a, int b) {
    	int datesum = 0;

    	int monthydate[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    	for(int i = 0 ; i < a-1 ; i++ ) {
    		datesum = datesum + monthydate[i];
    	}
    	if((datesum + b)%7 == 1) {
    		date = "SAT";
    	}
    	if((datesum + b)%7 == 2) {
    		date = "SUN";
    	}
    	if((datesum + b)%7 == 3) {
    		date = "MON";
    	}
    	if((datesum + b)%7 == 4) {
    		date = "TUE";
    	}
    	if((datesum + b)%7 == 5) {
    		date = "WED";
    	}
    	if((datesum + b)%7 == 6) {
    		date = "THU";
    	}
    	if((datesum + b)%7 == 0) {
    		date = "FRI";
    	}
        String answer = date;
        return answer;
    }
}
