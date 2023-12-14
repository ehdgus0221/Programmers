class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int temp = 0;
            if (sizes[i][1] > sizes[i][0]) {
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
        }
        
        int maxRow = 0;
        int maxCol = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            maxRow = Math.max(sizes[i][0], maxRow);
            maxCol = Math.max(sizes[i][1], maxCol);

        }
        answer = maxRow * maxCol;
        
        return answer;
    }
}