package A3bfs;

import java.util.*;

public class A301BfsBasic2 {
    public static void main(String[] args) {

        int[][] edge = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};


        List<List<Integer>> myList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            myList.add(new ArrayList<>());
        }
        for (int[] a : edge) {
            myList.get(a[0]).add(a[1]);
            myList.get(a[1]).add(a[0]);

        }
        for (List<Integer> a : myList) {
            a.sort(Comparator.naturalOrder());

        }
        boolean[] visited = new boolean[5];
        int[] distance = new int[5];
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(0);
        visited[0] = true;

        while (!myQueue.isEmpty()) {
            int temp = myQueue.poll();
            System.out.println(temp);
            for (int target : myList.get(temp)) {
                if (visited[target] == false) {
                    myQueue.add(target);
                    visited[target] = true;
                    distance[target] += distance[temp]+1;
                }
            }
        }
        System.out.println(Arrays.toString(distance));

    }
}
