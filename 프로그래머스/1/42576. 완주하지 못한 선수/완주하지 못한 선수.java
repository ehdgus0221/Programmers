import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String, Integer> finishers = new HashMap<>();

        for(String finisher : completion) {
            if(!finishers.containsKey(finisher)) {
                finishers.put(finisher, 1);    
            } else {
                finishers.replace(finisher, finishers.get(finisher) + 1);
            }
        }

        for(String runner : participant) {
            if(finishers.containsKey(runner) && finishers.get(runner) != 0) {
                finishers.replace(runner, finishers.get(runner) - 1);
                continue;
            } else {
                answer = runner;
                break;
            }
        }

        return answer;
    }
}