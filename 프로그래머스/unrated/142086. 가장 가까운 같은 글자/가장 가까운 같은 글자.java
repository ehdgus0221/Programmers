class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        String[] s_split = s.split("");

        for (int i = 0; i < s.length(); i++) {
            answer[i] = -1; // 초기값은 -1로 초기화
            for (int j = 1; j <= i; j++) { // 각 글자의 앞부분들과 비교만 하기 때문에 j의 범위는 i까지
                if(s_split[i-j].equals(s_split[i])) {
                    answer[i] = j;
                    break;
                }
            }
        }     
        return answer;
    }
}