import java.util.*;

class Solution {
    private static ArrayList<Edge>[] edgeList;
    private static int[] distance; // 1번 도시와 다른 도시 간 최단 경로
    
    private static void dijkstra() {
        PriorityQueue<Edge> queue = new PriorityQueue<>();
        queue.add(new Edge(1, 0));  // 1에서 1로 가는 경우니깐 0
        
        while (!queue.isEmpty()) {
            Edge edge = queue.poll();
            int vertex = edge.vertex;
            int weight = edge.weight;
            if (distance[vertex] < weight) {
                continue;
            }
            
            // 현재 도시와 연결되어 있는 도시 탐색
            for (int i = 0; i < edgeList[vertex].size(); i++) {
                int vertex2 = edgeList[vertex].get(i).vertex;
                int weight2 = edgeList[vertex].get(i).weight + weight;
                // 최단 경로
                if (distance[vertex2] > weight2) {
                    distance[vertex2] = weight2;
                    queue.add(new Edge(vertex2, weight2));
                }
            }
        }
    }
    
    
    public int solution(int N, int[][] road, int K) {
        int answer = 0;

        edgeList = new ArrayList[N + 1];
        distance = new int[N + 1];
        Arrays.fill(distance, Integer.MAX_VALUE);
        
        for (int i = 1; i <= N; i++) {
            edgeList[i] = new ArrayList<>();
        }
        for (int i = 0; i < road.length; i++) {
            edgeList[road[i][0]].add(new Edge(road[i][1], road[i][2]));
            edgeList[road[i][1]].add(new Edge(road[i][0], road[i][2]));
        }
    
        distance[1] = 0;
        dijkstra();
        
        for (int cost : distance) {
            if (cost <= K) {
                answer++;
            }
        }
        return answer;
    }
    
    private static class Edge implements Comparable<Edge> {
        int vertex;
        int weight;
        
        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
        
        @Override
        public int compareTo(Edge o) {
            return weight - o.weight;
        }
    }
}