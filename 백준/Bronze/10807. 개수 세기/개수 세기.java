import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
       Scanner sc = new Scanner(System.in);
       int inputNum = sc.nextInt();
       sc.nextLine();
       int[] nums = new int[inputNum];
       String num = sc.nextLine();
       for(int i = 0; i < inputNum; i++) {
           nums[i] = Integer.parseInt(num.split(" ")[i]);
       }
       int findNum = sc.nextInt();
       int cnt = 0;
       for (int i = 0; i < inputNum; i++) {
           if (nums[i] == findNum) {
               cnt++;
           }
       }
        System.out.println(cnt);
    }
}