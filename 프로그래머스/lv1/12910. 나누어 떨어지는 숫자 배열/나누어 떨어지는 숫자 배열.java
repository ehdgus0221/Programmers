class Solution {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        int[] arrSize = new int[arr.length];
        int j = 0;

        for (int i : arr) {
            if (i % divisor == 0) {
                arrSize[j] = i;
                j++;
            }
        }
        if (j == 0) {
            answer = new int[1];
            answer[0] = -1;
        } else {
            answer = new int[j];
            for (int i = 0; i < j; i++) {
                answer[i] = arrSize[i];
            }
            int temp;
            for (int i = 0; i < answer.length; i++) {
                for (int k = i + 1; k < answer.length; k++) {
                    if (answer[i] > answer[k]) {
                        temp = answer[i];
                        answer[i] = answer[k];
                        answer[k] = temp;
                    }
                }
            }
        }
        return answer;
    }
}