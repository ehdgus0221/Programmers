import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int solution(int[][] jobs) {
        int size = jobs.length;
        int totalTime = 0;

        Arrays.sort(jobs, (Comparator.comparingInt(o -> o[0])));
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(o -> o[1]));

        int i = 0;
        int curTime = 0;
        while (size > 0) {
            while (i < jobs.length && jobs[i][0] <= curTime) {
                queue.offer(jobs[i++]);
            }

            if (queue.isEmpty()) {
                curTime = jobs[i][0];
            } else {
                int[] request = queue.poll();
                totalTime += curTime - request[0] + request[1];
                curTime += request[1];
                size--;
            }

        }
        return (int) Math.floor(totalTime/jobs.length);
    }
}