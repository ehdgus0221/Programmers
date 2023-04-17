import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        boolean checkEmpty = true;
        
        int inputNum = sc.nextInt();
        sc.nextLine();
        String[] inputStr = new String[inputNum];
        
        for (int i = 0; i < inputNum; i++) {
            inputStr[i] = sc.nextLine();
        }

        int cnt = 0;
        while (cnt < inputNum) {
            for (String s : inputStr[cnt].split("")) {
                if (s.equals("(")) {
                    stack.push(s);
                } else {
                    if (stack.isEmpty()) {
                        checkEmpty = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
                }
            if (checkEmpty && stack.isEmpty()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            checkEmpty = true;
            stack.clear();
            cnt++;
        }
    }
}