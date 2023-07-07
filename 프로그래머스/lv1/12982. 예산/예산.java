import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int dSum = 0;
        for (int i = 0; i < d.length; i++) {
            if (dSum + d[i] <= budget) {
                answer ++;
                dSum += d[i];
            }
        }
        return answer;
    }
}