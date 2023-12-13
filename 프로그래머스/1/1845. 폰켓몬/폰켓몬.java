import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;
        
        HashMap<Integer, Integer> pocketmon = new HashMap<>();
        for (int num : nums) {
            if (!pocketmon.containsKey(num)) {
                pocketmon.put(num, 1);
                cnt++;
            } else {
                pocketmon.replace(num, pocketmon.get(num) + 1);
            }
        }
        
        if (nums.length / 2 > cnt) {
            return cnt;
        } else {
            return nums.length / 2;
        }
        
        
    }
}