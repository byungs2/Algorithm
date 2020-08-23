package programmers;

public class ProgrammersSol3 {

	    private int answer1[] = {1,2,3,4,5};
	    private int answer2[] = {2,1,2,3,2,4,2,5};
	    private int answer3[] = {3,3,1,1,2,2,4,4,5,5};
	    private int count1;
	    private int count2;
	    private int count3;
	    private int count4;
	    private int answer4[] = new int [3];
	    public int[] solution(int[] answers) {
	        
	        for(int i = 0; i < answers.length; i++) {
	        	if(answers[i] == answer1[i%5]) {
	        		count1++;
	        	}
	        	if(answers[i] == answer2[i%8]) {
	        		count2++;
	        	}
	        	if(answers[i] == answer3[i%10]) {
	        		count3++;
	        	}
	        }
	        if(Math.max(Math.max(count1, count2),count3) == count1) {
	        	answer4[0] = 1;
	        }
	        if(Math.max(Math.max(count1, count2),count3) == count2) {
	        	answer4[1] = 2;
	        }
	        if(Math.max(Math.max(count1, count2),count3) == count3) {
	        	answer4[2] = 3;
	        }
	        for(int i = 0;i < 3; i++) {
	        	if(answer4[i] != 0) {
	        		count4++;
	        	}
	        }
	        int answer[] = new int [count4];
	        for(int i = 0; i < count4; i++) {
	        	for(int j = 0; j < 3; j++) {
	        		if(answer4[j] != 0) {
	        			answer[i] = answer4[j];
	        			answer4[j] = 0;
	        			break;
	        		}
	        	}
	        }
	        
	        
	        return answer;
	    
	}
}
////class Solution {
//public int[] solution(int[] answer) {
//    int[] a = {1, 2, 3, 4, 5};
//    int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
//    int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
//    int[] score = new int[3];
//    for(int i=0; i<answer.length; i++) {
//        if(answer[i] == a[i%a.length]) {score[0]++;}
//        if(answer[i] == b[i%b.length]) {score[1]++;}
//        if(answer[i] == c[i%c.length]) {score[2]++;}
//    }
//    int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
//    ArrayList<Integer> list = new ArrayList<>();
//    if(maxScore == score[0]) {list.add(1);}
//    if(maxScore == score[1]) {list.add(2);}
//    if(maxScore == score[2]) {list.add(3);}
//    return list.stream().mapToInt(i->i.intValue()).toArray();
//}
//} 
//ArrayList 사용법 숙지해보자
