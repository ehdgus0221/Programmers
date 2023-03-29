class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        // 보유중인 빈 병이 a개 미만이면 콜라를 받을 수 없으므로 n이 a보다 크거나 같을 때까지 반복
        while (n >= a) {    
            answer += b * (n / a);
            n = b * (n / a) + (n % a);
        }
        
        return answer;
    }
}