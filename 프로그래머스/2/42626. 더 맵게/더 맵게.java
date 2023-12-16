import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int scv : scoville) {
            queue.add(scv);
        }
        
        while (queue.peek() < K && queue.size() > 1) {
            answer++;
            int a = queue.poll();
            int b = queue.poll();
            int temp = a + (2 * b);
            queue.add(temp);
        }
        
        if (queue.peek() < K ) {
            return -1;
        }
        
        return answer;
    }
}