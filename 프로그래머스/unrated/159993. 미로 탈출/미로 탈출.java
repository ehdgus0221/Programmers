import java.util.Queue;
import java.util.LinkedList;


class Solution {
    static String[][] miroMap;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    
    public int solution(String[] maps) {
        miroMap = new String[maps.length][maps[0].length()];

        int[] lever = new int[2];
        int[] start = new int[2];
        
        for(int i = 0; i < maps.length; i++) {
            for(int j = 0; j < maps[0].length(); j++) {
                miroMap[i][j] = maps[i].split("")[j];
                
                if (miroMap[i][j].equals("S")) {
                    start = new int[]{i, j};
                }
    
                if (miroMap[i][j].equals("L")) {
                    lever = new int[]{i, j};
                }
            }
        }
        
        int leverResult = bfs(start, "L");
        int finishResult = bfs(lever, "E");
        
        if (leverResult == -1 || finishResult == -1) {
            return -1;
        }

        return leverResult + finishResult;
    }
    
    public int bfs(int[] start, String target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start[0], start[1], 0});
        
        boolean[][] visited = new boolean[miroMap.length][miroMap[0].length];
        
        while (!queue.isEmpty()) {
            int x = queue.peek()[0];
            int y = queue.peek()[1];
            int count = queue.peek()[2];
            visited[x][y] = true;
            
            if (miroMap[x][y].equals(target)) {
                return count;
            }
            
            queue.poll();
            
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if (nx >= 0 && nx < miroMap.length && ny >= 0 && ny < miroMap[0].length && !visited[nx][ny]) {
                    if (!miroMap[nx][ny].equals("X")) {
                        visited[nx][ny] = true;
                        queue.add(new int[]{nx, ny, count + 1});
                    }
                }
            }
        }
        return -1;
    }
}