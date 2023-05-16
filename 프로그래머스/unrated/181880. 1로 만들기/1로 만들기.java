class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        for(int i = 0; i < num_list.length; i++) {
            int sum = num_list[i];
            while (sum != 1) {
                if (sum % 2 == 0) {
                    sum = sum / 2;
                } else {
                    sum = (sum - 1) / 2;
                }
                count++;
            }
        }
        return count;
    }
}