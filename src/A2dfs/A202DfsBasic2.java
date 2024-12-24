package A2dfs;

import java.util.ArrayList;
import java.util.List;

public class A202DfsBasic2 {

    static List<List<Integer>> adjList;
    static List<List<Integer>> answer;

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {1, 3}, {2, 4}, {2, 5}, {3, 6}, {3, 7}, {4, 8}, {4, 9}, {5, 10}};
        adjList = new ArrayList<>();
        boolean[] visited = new boolean[10];
        for (int i = 0; i < 11; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] a : arr) {
            adjList.get(a[0]).add(a[1]);
            adjList.get(a[1]).add(a[0]);
        }
//        {1,2,4,8},{1,2,4,9},{1,2,5,10},{1,3,6},{1,3,7}
        answer = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        dfs(1, visited, adjList, temp);
    }
    static void dfs(int start, boolean[] visited, List<List<Integer>> adjList, List<Integer> temp) {

        if (adjList.get(start).isEmpty()) {
            answer.add(new ArrayList<>(temp));
        }
        for (int target : adjList.get(start)) {
            temp.add(target);
            dfs(target, visited, adjList, temp);
            temp.remove(temp.size()-1);

        }

    }
}
