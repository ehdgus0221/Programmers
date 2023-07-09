class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int diff = x;
        int sum = 0;
        
        while (diff >= 1) {
			sum += diff % 10;
			diff /= 10;
		}

		if (x % sum == 0) {
			return true;
		} else {
			return false;
        }
    }
}