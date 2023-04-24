import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();
        sc.nextLine();

        while (true) {
            String str = sc.nextLine();
            if (str.equals("+")) {
                answer += sc.nextInt();
                sc.nextLine();
            } else if (str.equals("-")) {
                answer -= sc.nextInt();
                sc.nextLine();
            } else if (str.equals("*")) {
                answer *= sc.nextInt();
                sc.nextLine();
            } else if (str.equals("/")) {
                answer /= sc.nextInt();
                sc.nextLine();
            } else if (str.equals("=")) {
                break;
            }
        }
        System.out.println(answer);
    }
}