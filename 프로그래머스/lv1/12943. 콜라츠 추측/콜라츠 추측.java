class Solution {
    public int solution(int num) {
        int answer = 0;
        long cnt = num;
        
        while(cnt != 1) {
            if (cnt % 2 == 0) {
                cnt /= 2;
                answer++;
            } else if (cnt %2 != 0){
                cnt *= 3;
                cnt += 1;
                answer++;
            }
            if (answer == 500 && cnt != 1) {
                return -1;
            }
        }
        System.out.println(answer);
        
        return answer;
    }
}