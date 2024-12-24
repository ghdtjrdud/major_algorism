package A3bfs;

import java.util.*;

public class A304가장먼노드 {
    public static void main(String[] args) {
        int[][] edge = {{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        int n = 6;
        List<Integer> tempList = new ArrayList<>();

        List<List<Integer>> myList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            myList.add(new ArrayList<>());
        }
        for (int[] a : edge) {
            myList.get(a[0]).add(a[1]);
            myList.get(a[1]).add(a[0]);
        }
        boolean[] visited = new boolean[n];
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1);
        visited[1] = true;
        int[] distance = new int[n];

        while (!myQueue.isEmpty()) {
            int temp = myQueue.poll();
            for (int tartget : myList.get(temp))
                if (!visited[tartget]) {
                    myQueue.add(tartget);
                    visited[tartget] = true;
                    distance[tartget] += distance[temp]+1;

                }
            }
    }
}
