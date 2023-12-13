import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<Character> stack = new Stack<>();
        char[] c = s.toCharArray();

        for (int i = 0; i < c.length; i++) {
            if (c[i] == '(') {
                stack.push('(');
            } else if (c[i] == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false; // 스택이 비어있는데 ')'가 나왔다면 올바른 괄호가 아님
                }
            }
        }

        // 스택이 비어있어야 모든 괄호가 올바르게 짝을 이룸
        return stack.isEmpty();
    }
}
