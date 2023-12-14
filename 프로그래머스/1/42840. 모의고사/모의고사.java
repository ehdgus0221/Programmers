import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4 ,4 ,5 ,5};
        
        int scoreA = 0;
        int scoreB = 0;
        int scoreC = 0;
        
        for (int i = 0; i < answers.length; i++) {
            if (one[i % one.length] == answers[i]) {
                scoreA++;
            }
            if (two[i % two.length] == answers[i]) {
                scoreB++;
            }
            if (three[i % three.length] == answers[i]) {
                scoreC++;
            }
        }
        
        int maxNum = Math.max(scoreC, Math.max(scoreA, scoreB));
        
        List<Integer> resultList = new ArrayList<>();
        if (scoreA == maxNum) resultList.add(1);
        if (scoreB == maxNum) resultList.add(2);
        if (scoreC == maxNum) resultList.add(3);
        
        answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }
        
        
        return answer;
    }
}