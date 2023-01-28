class Solution {
    public int solution(int[] dot) {
        int answer = 0;
        
        int x = dot[0];
        int y = dot[1];
        
        if(x > 0)
        {
            if(y > 0){
                answer = 1;
            }
            else if(y < 0){
                answer = 4;
            }
            else{   // y축이 0일경우
                answer = 0;
            }
        }
        else if(x < 0){
            if(y > 0){
                answer = 2;
            }
            else if(y < 0){
                return 3;
            }
        }
        else{  // x축이 0일 경우
            answer = 0;
        }

        return answer;
    }
}