import java.util.*;
// 기존 문자에 인덱스의 문자를 붙여줘서 오름차순 진행
// 이렇게 하면 사전순으로 오름차순 가능
class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        answer = new String[strings.length];
        
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        // 정렬
        Collections.sort(list);
        
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }             
        
        return answer;
    }
}