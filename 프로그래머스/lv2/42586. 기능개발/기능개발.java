import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int[] answerResult = new int[progresses.length];
        int result = 0;
        Queue<Integer> progressesQueue = new LinkedList<>();
        Queue<Integer> speedsQueue = new LinkedList<>();
        ArrayList<Integer> processArray = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            progressesQueue.add(progresses[i]);
            speedsQueue.add(speeds[i]);
        }
        while (progressesQueue.size() > 0) {
            int i = progressesQueue.poll();
            int dayCount = 0;
            int j = speedsQueue.poll();
            while (i < 100) {
                i += j;
                dayCount += 1;
            }
            answerResult[result++] = dayCount;
        }
        int idx = 0;
        int idxTotal = 0;
        int delay = 1;
        int idxComparison = 1;
        
        while (idx < answerResult.length) {
            if (idx + idxComparison == answerResult.length) {
                processArray.add(delay);
                break;
            }
            if(answerResult[idx] >= answerResult[idx + idxComparison]) {
                delay++;
                idxComparison++;
            } else {
                processArray.add(delay);
                idx += delay;
                delay = 1;
                idxComparison = 1;
            }
            idxTotal++;
        }
        answer = new int[processArray.size()];
        for(int i = 0; i < processArray.size(); i++) {
            answer[i] = processArray.get(i);
        }
        
        return answer;
    }
}