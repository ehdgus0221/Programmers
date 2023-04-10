import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack1 = new Stack<Integer>();
        int k = 0;
        
        for (int i : arr) {
            if (stack1.empty() || stack1.peek() != i) {
                stack1.push(i);
            }
        }

        answer = new int[stack1.size()];
        for (int i : stack1) {
            answer[k++] = i;
        }

        return answer;
    }
}