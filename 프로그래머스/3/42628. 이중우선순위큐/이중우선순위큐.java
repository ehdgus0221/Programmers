import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for (String operation : operations) {
            String[] parts = operation.split(" ");
            String command = parts[0];
            int value = Integer.parseInt(parts[1]);

            if (command.equals("I")) {
                queue.offer(value);
            } else if (value == -1) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            } else {
                if (!queue.isEmpty()) {
                    int max = Collections.max(queue);
                    queue.remove(max);
                }
            }
        }

        if (queue.isEmpty()) {
            answer[0] = 0;
            answer[1] = 0;
        } else {
            answer[0] = Collections.max(queue); // 최대값
            answer[1] = queue.poll(); // 최소값
        }

        return answer;
    }
}
