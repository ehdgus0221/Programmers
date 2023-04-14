import java.util.HashMap;
import java.util.Iterator;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String[] clothe : clothes) {
            String type = clothe[1];
            map.put(type, map.getOrDefault(type, 0) + 1);   // 키 값이 존재하면 키값, 존재하지 않으면 0반환
        }
        
        Iterator<Integer> it = map.values().iterator();
        int answer = 1;
        
        while(it.hasNext()) {
            answer *= it.next().intValue() + 1;
        }
        
        answer -= 1;    // 아무것도 입지 않았을 때
        
        return answer;
    }
}