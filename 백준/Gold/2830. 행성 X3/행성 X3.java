import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        int totalNum = 20;
        int[] diffNum = new int[totalNum];

        for (int i = 0; i < inputNum; i++) {
            int num = Integer.parseInt(br.readLine());
            for (int j = 0; j < totalNum; j++) {
                if ((num & (1 << j)) > 0) {
                    diffNum[j]++;
                }
            }
        }
            long answer = 0;
            for (int i = 0; i < totalNum; i++) {
                int zero = inputNum - diffNum[i];
                answer += (long) (1 << i) * zero * diffNum[i];
            }
        System.out.println(answer);
    }
}