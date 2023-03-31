class Solution {
    public int solution(int[] numbers) {
        
        int Total_Numbers = 45;
        
        for (int i = 0; i < numbers.length; i++) {
             Total_Numbers -= numbers[i];
        }
        
        int answer = Total_Numbers;
        return answer;
    }
}