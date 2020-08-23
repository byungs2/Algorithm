package programmers;

public class PhoneNum {
	   public static String solution(String phone_number) {
	    	String[] list = phone_number.split("");
	    	for(int i = 0; i<list.length-4 ;i++) {
	    		list[i] = "*";
	    	}
	    	String answer = String.join("", list);
	        return answer;
	    }
}
