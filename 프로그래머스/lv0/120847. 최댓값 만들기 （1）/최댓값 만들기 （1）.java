import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers); // 배열 원소를 작은 수 부터 나열
        
        answer = numbers[(numbers.length)-1] * numbers[(numbers.length)-2];
        
        return answer;
    }
}