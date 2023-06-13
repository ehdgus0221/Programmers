import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = enemy.length;
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int mySoldier = n;
        int card = k;
        for (int i = 0; i < enemy.length; i++) {
            mySoldier -= enemy[i];
            pq.add(enemy[i]);

            if (mySoldier < 0) {
                if (card > 0 && !pq.isEmpty()) {
                    mySoldier += pq.poll();
                    card--;
                } else {
                    answer = i;
                    break;
                }
            }
        }

        return answer;
    }
}