class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++){
            answer = answer + my_string.charAt(my_string.length()-1-i);
        }
        
        return answer;
   }
}

// StringBuilder 를 사용한 코드
//
// class Solution {
//     public String solution(String my_string) {
        
//         return new StringBuilder(my_string).reverse().toString();
//     }
// }