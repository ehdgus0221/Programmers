import java.util.*;
class node {
    int pri;
    int loc;
    node(int pri, int loc) {
        this.pri = pri;
        this.loc = loc;
    }
}

class Solution {
    public int solution(int[] priorities, int location) {
        LinkedList<node> pri = new LinkedList<>();
        int answer = 0;
        int cnt = 0;
        
        for (int i = 0; i < priorities.length; i++) {
            pri.add(new node(priorities[i], i));
        }
        
        while (!pri.isEmpty()) {
            node fir = pri.getFirst();
            int k = 0;
            for (k = 0; k < pri.size(); k++) {
                node find = pri.get(k);
                if(find.pri > fir.pri) {
                    pri.poll();
                    pri.addLast(fir);
                    break;
                }
            }
            if (k == pri.size()) {
                pri.poll();
                cnt++;
                if(fir.loc == location) {
                    answer = cnt;
                    return answer;
                }
            }
        }     
        return answer;
    }
}