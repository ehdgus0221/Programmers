import java.util.*;
class Solution {
    static class Edge {
        int start;
        int end;
        int cost;
        public Edge() {
            this(0,0,0);
        }

        public Edge(int s,int e,int c) {
            this.start = s;
            this.end = e;
            this.cost = c;
        }
    }

    public static int solution(int n, int[][] costs) {
        int answer = 0;

        int[] p = new int[n+1];     // 초기 값
        for (int i=0; i<=n; i++) {
            p[i] = i;
        }

        ArrayList<Edge> a = new ArrayList<>();
        for( int[] cost : costs ) {
            a.add( new Edge(cost[0],cost[1],cost[2]));
        }
        a.sort((e1,e2) -> e1.cost - e2.cost);   // 가중치 오름차순

        for( Edge e : a ) {
            int x = find(p,e.start);
            int y = find(p,e.end);

            if( x != y ) {
                union(p,x,y);
                answer += e.cost;
            }
        }

        return answer;
    }

    // 찾기
    static int find(int[] p, int a) {
        if( a == p[a] )
            return a;

        return p[a] = find(p,p[a]);
    }

    // 연결
    static void union(int[] p, int a, int b) {
        a = find(p,a);
        b = find(p,b);
        p[a] = b;
    }
}