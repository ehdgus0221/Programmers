import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        HashMap<Integer, Integer> hm = new HashMap<>();

        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        sc.nextLine();
        String nums = sc.nextLine();
        int findNum = sc.nextInt();
        int cnt = 0;

        for (int i = 0; i < inputNum; i++) {
            hm.put(i, Integer.parseInt(nums.split(" ")[i]));
            if(findNum == hm.get(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);

    }
}