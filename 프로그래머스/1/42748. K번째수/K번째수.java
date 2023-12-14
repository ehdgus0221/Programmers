import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            answer[i] = result(array, commands[i]);
        }

        return answer;
    }

    public int result(int[] array, int[] command) {
        int i = command[0];
        int j = command[1];
        int k = command[2];

        // 배열 복사
        int[] result = Arrays.copyOfRange(array, i - 1, j);

        // 배열 정렬
        Arrays.sort(result);

        return result[k - 1];
    }
}
