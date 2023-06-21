import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        
        for (String str : callings) {
            int cur = map.get(str);
            map.put(str, cur - 1);
            map.put(players[cur - 1], cur);
            players[cur] = players[cur - 1];
            players[cur - 1] = str;
        }
        
        return players;
    }
}