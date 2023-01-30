class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        int k = 0;
        int j = 0;
        
        if(n%2 ==0){
            k = n / 2;
        }
        else{
            k = (n / 2) + 1;
        }
        
        answer = new int[k];
        
        for(int i = 1; i <= n; i++) {
            if(i%2 != 0){
                answer[j] = i;
                j++;
            }
        }
        
        
        return answer;
    }
}