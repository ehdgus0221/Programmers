class Solution {
    public int solution(int storey) {
        return cal(storey);
    }
    private static int cal(int storey){
        int num = storey;
        int result = 0;
        while(num > 0){
            int temp = num % 10;
            if (temp < 5){
                result += temp;
            } else if (temp == 5){
                int tenCnt = (num % 100) / 10;
                if (tenCnt >= 5){
                    num += 10;
                }
                result += 5;
            } else {
                result += 10-temp;
                num += 10;
            }
            num /= 10;
        }
        return result;
    }
}