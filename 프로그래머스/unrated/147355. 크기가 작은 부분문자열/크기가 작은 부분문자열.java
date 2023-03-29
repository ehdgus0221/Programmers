class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        long p_num = Long.parseLong(p); // p 숫자로 변환
        
        for(int i = 0; i < t.length() - p.length() + 1; i++) {
        long t_num = Long.parseLong(t.substring(i, i + p.length()));
            if( t_num <= p_num ) {
                answer += 1;
            }
       }
        return answer;
    }
}