import java.util.*;

class Solution {

    static int[][] map;
    static int[] dx = {0, 0, -1, 1};
    static int[] dy = {-1, 1, 0, 0};

    public int solution(int[][] maps) {
        int finishedX = maps.length;
        int finishedY = maps[0].length;

        map = new int[finishedX][finishedY];

        for (int i = 0; i < finishedX; i++) {
            for (int j = 0; j < finishedY; j++) {
                map[i][j] = maps[i][j];
            }
        }

        return bfs(0, 0, finishedX, finishedY);
    }

    public int bfs(int startX, int startY, int finishedX, int finishedY) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{startX, startY, 1});

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int count = current[2];

            if (x == finishedX - 1 && y == finishedY - 1) {
                return count;
            }

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (isValid(nx, ny) && map[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny, count + 1});
                    map[nx][ny] = 0; // 방문한 곳은 다시 방문하지 않도록 표시
                }
            }
        }
        return -1; // 도착하지 못한 경우
    }

    private boolean isValid(int x, int y) {
        return x >= 0 && x < map.length && y >= 0 && y < map[0].length;
    }
}
