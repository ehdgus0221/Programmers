import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        HashMap<String, Integer> phone = new HashMap<>();
        for (String phone_book_one : phone_book) {
            phone.put(phone_book_one, 1);
        }
        
        for (String phone_book_one : phone_book) {
            for (int i = 1; i < phone_book_one.length(); i++) {
                if (phone.containsKey(phone_book_one.substring(0,i))) {
                return false;
                }    
            }
        }
        
        return answer;
    }
}