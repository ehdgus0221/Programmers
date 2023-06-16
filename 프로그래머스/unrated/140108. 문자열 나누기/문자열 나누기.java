import java.util.*;

class Solution {
    public int solution(String s) {
        char x = s.charAt(0);
		int sChar = 0;
		int diff = 0;
		int answer = 0;
		for (int i = 0; i < s.length(); i++) {
			if (sChar == diff) {
				answer++;
				x = s.charAt(i);
			}
			if (s.charAt(i) == x) {
                sChar++;
            } else {
                diff++;
            }
		}
		return answer;
    }
}