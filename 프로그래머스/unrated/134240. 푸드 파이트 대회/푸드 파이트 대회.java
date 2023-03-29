class Solution {
    public String solution(int[] food) {
        String answer = "";
        String answer_reverse = "";
        
        food[0] = 0;    // 0번 음식은 물
        
        // 물 기준 왼쪽 음식 배치
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                answer += Integer.toString(i);
            }
        }
        
        // 물 기준 오른쪽 음식 배치
        String[] answer_split = answer.split("");
        
        for (int i = (answer_split.length - 1); i >= 0; i --) {
            answer_reverse += answer_split[i];
        }
        
        // 왼쪽 음식 + 물 + 오른쪽 음식
        answer = answer + food[0] + answer_reverse;
        
        return answer;
    }
}