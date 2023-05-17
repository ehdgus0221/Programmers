class Solution {
    static int[] board;
    static int cnt;
    public int solution(int n) {
        board = new int[n];

        // BackTracking 호출
        bt(n ,0);

        return cnt;
    }
        // 백트래킹 재귀함수
    static void bt(int n, int row) {
        // 마지막까지 배치가 완료 되었다면 방법의 수 + 1
        if(n == row) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            board[row] = i;
            // 중복되지 않게 배치되어 있으면 재귀를 통해 계속해서 진행
            if(check(row)) {
                bt(n ,row + 1);
            }
        }
    }

    // 위치 중복 여부 체크
    static boolean check(int row) {
        for (int i = 0; i < row; i++) {
            // 같은 열에 있는지 확인
            if(board[i] == board[row]) {
                return false;
            }

            // 대각선에 존재하는 경우 false
            if(Math.abs(row - i) == Math.abs(board[row] - board[i])) {
                return false;
            }
        }
        return true;
    }
}