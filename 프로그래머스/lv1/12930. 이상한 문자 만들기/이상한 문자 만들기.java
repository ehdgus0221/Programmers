import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        ArrayList<Character> a = new ArrayList<>();
        
        int idx = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ' && idx % 2 == 0) {       // 공백이 아니면서 짝수 인덱스에 존재하는 경우
                if (s.charAt(i) >= 97 && s.charAt(i) <= 122) {   // 짝수 인덱스 && 소문자
                a.add((char)(s.charAt(i) - 32));    
                } else {                                        // 짝수 인덱스 && 이미 대문자인 경우
                    a.add(s.charAt(i));
                }
                idx++;
            } else if (s.charAt(i) != ' ') {     // 공백이 아니면서 홀수 인덱스에 존재하는 경우
                if (s.charAt(i) >= 65 && s.charAt(i) <= 90) {  // 홀수 인덱스 && 대문자
                a.add((char)(s.charAt(i) + 32));
                } else {                                        
                    a.add(s.charAt(i));                         
                }
                idx++;
            } else {                            // 공백인 경우
                a.add(s.charAt(i));
                idx = 0;
            }
            
            answer += a.get(i);
        }
 
        
        return answer;
    }
}