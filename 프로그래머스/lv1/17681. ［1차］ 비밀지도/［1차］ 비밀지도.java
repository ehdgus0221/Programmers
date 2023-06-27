import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i =0; i < n; i++){
            String result = Integer.toBinaryString(arr1[i] | arr2[i]);
            result = String.format("%" + n + "s", result);
            result = result.replaceAll("1" , "#");
            result = result.replaceAll("0" , " ");
            answer[i] = result;
        }
        
        return answer;
    }
}