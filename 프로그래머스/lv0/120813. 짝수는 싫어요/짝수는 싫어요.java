class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int k = 0;
        
        if(n%2 ==0){
            k = n / 2;
        }
        else{
            k = (n / 2) + 1;
        }
        
        answer = new int[k];
        
        for(int i = 0; i < k; i++) {
                answer[i] = (2 * i) + 1;
            }
        
        return answer;
    }
}