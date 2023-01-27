class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(angle > 0 && angle < 90){
            answer = 1;
        }
        else if(angle == 90){
            answer = 2;
        }
        else if(angle > 90 && angle < 180){
            answer = 3;
        }
        else if(angle == 180){
            answer = 4;
        }
        return answer;
    }
}

// 삼항연산자로 계산하는 경우 
//return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;