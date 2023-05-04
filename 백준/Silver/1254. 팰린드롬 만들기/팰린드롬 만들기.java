
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(ArrayList str){ // 팰린드롬인지 확인
        if(str.size()==1) // 문자열의 길이가 1이라면
            return true; // true리턴
        for(int i=0; i<str.size()/2; i++){ // 처음문자와 마지막 문자가 같은지 확인
            if(str.get(i) != str.get(str.size()-1-i)) // 다르다면
                return false; // 팰린드롬이 아님
        }
        return true; // 다 같다면 팰린드롬임
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<Character> str2 = new ArrayList<>();
        for(int i=0; i<str.length(); i++){ // 입력받은 문자열을
            str2.add(str.charAt(i)); // ArrayList로 변환
        }
        int strLength = 0; // 삭제한 문자의 수
        while(true){
            if(isPalindrome(str2)){ // 문자열이 팰린드롬이라면
                System.out.println(str2.size()+strLength*2);
                return;
            }
            else{ // 아니라면
                str2.remove(0); // 0번을 제거하고 다시 팰린드롬인지 확인
                strLength++;
            }
        }
    }
}