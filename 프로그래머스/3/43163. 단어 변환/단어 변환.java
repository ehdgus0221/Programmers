class Solution {
    static int result = Integer.MAX_VALUE;

    public int solution(String begin, String target, String[] words) {
        dfs(begin, target, words, 0, new boolean[words.length]);
        return result == Integer.MAX_VALUE ? 0 : result;
    }

    public void dfs(String current, String target, String[] words, int count, boolean[] visited) {
        if (current.equals(target)) {
            result = Math.min(result, count);
            return;
        }

        for (int i = 0; i < words.length; i++) {
            if (!visited[i] && canTransform(current, words[i])) {
                visited[i] = true;
                dfs(words[i], target, words, count + 1, visited);
                visited[i] = false; // 백트래킹
            }
        }
    }

    private boolean canTransform(String word1, String word2) {
        int diff = 0;
        for (int i = 0; i < word1.length(); i++) {
            if (word1.charAt(i) != word2.charAt(i)) {
                diff++;
            }
            if (diff > 1) {
                return false;
            }
        }
        return diff == 1;
    }
}
