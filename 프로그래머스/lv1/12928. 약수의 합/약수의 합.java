class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int sqrt = (int) Math.sqrt(n);
        
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                answer += i;
                int divisor = n / i;
                if (divisor != i) {
                    answer += divisor;
                }
            }
        }
        
        return answer;
    }
}