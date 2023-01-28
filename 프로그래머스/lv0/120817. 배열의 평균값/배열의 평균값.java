class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int sum = 0;
        
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        answer = (double)sum / (double)numbers.length;
            
        return answer;
    }
}

// 다른 사람 풀이

// import java.util.Arrays;

// class Solution {
//     public double solution(int[] numbers) {
//         return Arrays.stream(numbers).average().orElse(0);
//      21번쨰 줄 해석 : Array.stream(배열 이름).averge() -> 합을 구하는 문제라면 sum()
//     orElse(0); -> null 값이면 0을 반환
//     }
// }