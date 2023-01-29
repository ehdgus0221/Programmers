// class Solution {
//     public String solution(String my_string) {
//         String answer = "";
        
//         return new answer(my_string).reverse().toString();
        
//         for(int i = 0; i < my_string.length(); i++){
//             answer = answer + my_string.charAt(my_string.length()-1-i);
//         }
        
//         return answer;
//    }
// }

class Solution {
    public String solution(String myString) {
        return new StringBuilder(myString).reverse().toString();
    }
}