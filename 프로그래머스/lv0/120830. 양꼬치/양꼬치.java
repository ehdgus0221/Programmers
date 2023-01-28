class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        
        int discount = n / 10;  // 음료수 서비스 개수
        
        answer = (12000 * n) +(2000 * (k - discount));
        
        return answer;
    }
}