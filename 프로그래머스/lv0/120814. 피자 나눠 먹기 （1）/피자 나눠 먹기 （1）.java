class Solution {
    public int solution(int n) {
        int answer = 0;
        int k = 0;
        
        for(int i = 1; i <= n; i++) {
            if(((7*k) + 1) <= n && n <= (7*(k+1))) {
                answer = k+1;
            }
            else{
                k += 1;
            }
        }
        
        return answer;
    }
}