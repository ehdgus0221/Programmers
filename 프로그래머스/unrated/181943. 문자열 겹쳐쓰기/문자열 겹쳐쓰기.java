class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer += my_string.substring(0,s);
        answer += overwrite_string;
        System.out.println(answer);
        if (my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length(),my_string.length());
        }
        return answer;
    }
}