import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test code

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] nums = new int[N + 1][M + 1];

        for (int i = 1; i < N + 1; i++) {
            for (int j = 1; j < M + 1; j++) {
            nums[i][j] = sc.nextInt();
            }
        }
        int K = sc.nextInt();
        int[] answer = new int[K];
        for (int n = 0; n < K; n++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(i == x && j == y) {
                answer[n] = nums[i][j];
            } else if (i == x) {
                for (int m = 0; m <= y-j; m++) {
                    answer[n] += nums[i][j + m];
                }
            } else if (j == y) {
                for (int m = 0; m <= x-i; m++) {
                    answer[n] += nums[i + m][j];
                }
            } else {
                for (int m = i; m <= x; m++) {
                    for (int v = j; v <= y; v++) {
                        answer[n] += nums[m][v];
                    }
                }
            }
        }
        for (int i = 0; i < K; i++) {
            System.out.println(answer[i]);
        }

    }

}
