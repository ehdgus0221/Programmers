import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test code

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] coins = new int[N];

        for (int i = 0; i < N; i++) {
            coins[i] = sc.nextInt();
        }

        int change = K;
        int cnt = 0;

        for (int i = coins.length - 1; i >= 0; i--) {
            if (change < coins[i]) {
                continue;
            }
            int q = change / coins[i];

            change %= coins[i];
            cnt += q;
        }
        System.out.println(cnt);

    }

}
