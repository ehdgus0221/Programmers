import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test code

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] nums = new int[N];

        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }

        int p1 = 0;
        int p2 = 0;
        int sum = 0;
        int cnt = 0;

        while(true) {
            if (sum > M) {
                sum -= nums[p1++];
                if (sum == M) {
                    cnt++;
                }
            } else if (p2 == N) {
                break;
            } else {
                sum += nums[p2++];
                if (sum == M) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);

    }

}
