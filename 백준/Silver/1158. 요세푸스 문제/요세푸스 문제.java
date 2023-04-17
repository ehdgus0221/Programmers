import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int result[] = new int[n];
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        ListIterator<Integer> iter = list.listIterator();

        while (!list.isEmpty()) {
            for (int i = 0; i < k; i++) {
                if (!iter.hasNext()) {
                    iter = list.listIterator();
                }

                if (i == k - 1) {
                    result[cnt++] = iter.next();
                } else {
                    iter.next();
                }
            }
                iter.remove();
            }
            System.out.print("<");

            for (int i = 0; i < n; i++) {
                if (i < n - 1) {
                    System.out.print(result[i] + ", ");
                } else {
                    System.out.print(result[i]);
                }
            }
        System.out.print(">");
        }
    }