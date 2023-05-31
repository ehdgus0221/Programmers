class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        for (int i = 0; i < queries.length; i++) {
            int first = queries[i][0];
            int last = queries[i][1];
            for (int j = first; j <= (first + last) / 2; j++) {
                char tmp = arr[j];
                arr[j] = arr[first + last - j];
                arr[first + last - j] = tmp;
            }
        }
        for (char c : arr) {
            answer += c;
        }
        return answer;
    }
}