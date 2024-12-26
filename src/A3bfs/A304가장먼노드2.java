package A3bfs;

import java.util.*;

public class A304가장먼노드2 {

    public static void main(String[] args) {
        int n = 6;
        int[][] edge = {{3,6}, {4,3}, {3,2}, {1,3}, {1,2}, {2,4}, {5,2}};
        List<List<Integer>> adjList = new ArrayList<>();
        for(int i=0; i<n+1; i++){
            adjList.add(new ArrayList());
        }
        for(int[] a : edge){
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }
        System.out.println(adjList);

        int[] distance = new int[n+1];
        Arrays.fill(distance, -1);
        distance[1]=0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        while (!queue.isEmpty()){
            int temp = queue.poll();
            for(int t : adjList.get(temp)){
                if(distance[t] == -1){
                    distance[t] = distance[temp]+1;
                    queue.add(t);
                }
            }
        }
        int max = Arrays.stream(distance).max().getAsInt();
        int count = (int)Arrays.stream(distance).filter(a->a==max).count();
    }
}
