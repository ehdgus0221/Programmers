import java.util.*;

class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        int[] divisor = new int[number];
        
        for (int i = 1; i <= number; i++) {
            int cnt = 0;
            int sqrt = (int) Math.sqrt(i);
            
            for (int j = 1; j <= sqrt; j++) {
                if (i % j == 0) {
                    cnt += 2; // 대칭적인 약수를 함께 계산
                }
            }
            
            if (sqrt * sqrt == i) {
                cnt--; // 제곱수인 경우 중복 계산된 약수를 제거
            }
            
            divisor[i - 1] = cnt;
        }
        
        for (int num : divisor) {
            if (num > limit) {
                answer += power;
            } else {
                answer += num;
            }
        }
        
        return answer;
    }
}
