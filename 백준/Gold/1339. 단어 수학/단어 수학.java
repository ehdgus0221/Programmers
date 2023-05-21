import java.util.*;

public class Main {
    static int[] alphbet = new int[26];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputNumCount = sc.nextInt();   // 입력될 문자의 개수
        sc.nextLine();
        String[] inputWord = new String[inputNumCount]; // 입력된 문자 저장

        for (int i = 0; i < inputNumCount; i++) {
            inputWord[i] = sc.nextLine();
            int word = inputWord[i].length() - 1;
            for (int j = 0; j < inputWord[i].length(); j++) {
                int idx = inputWord[i].charAt(j) - 'A';
                alphbet[idx] += (int)Math.pow(10, word);
                word--;
            }
        }
        Arrays.sort(alphbet);
        int maxNum = 9;
        int result = 0;
        int index = alphbet.length - 1;
        while (alphbet[index] > 0) {
            result += alphbet[index] * maxNum;
            maxNum--;
            index--;
        }
        System.out.println(result);
    }
}