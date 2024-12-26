package A3bfs;

import java.util.*;

public class A301BfsBasic1 {
    public static void main(String[] args) {
//        방문할 수 있는 정점이 여러개인경우 정점번호가 작은것을 먼저 방문
//        dfs 알고리즘 형식의 방문순서를 출력, 출발은 0부터

        int[][] edge = {{0, 1}, {0, 2}, {1, 3}, {2, 3}, {2, 4}};
//        bfs 로 방문 시 0-1-2-3-4

//        인접리스트에 담기(양방향)
        List<List<Integer>> myList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            myList.add(new ArrayList<>());
        }
        for (int[] a : edge) {
            myList.get(a[0]).add(a[1]);
            myList.get(a[1]).add(a[0]);

        }
        System.out.println(myList);
        for (List<Integer> a : myList) {
            a.sort(Comparator.naturalOrder());

        }
        boolean[] visited = new boolean[5];
//        bfs 알고리즘을 구현하기 위한 Queue 생성
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(0);
        visited[0] = true;
//        queue 가 비워질 때까지 ,방문을 지속
//        queue 가 비워진다는 것은 더이상 갈곳이 없을 때를 의미. 이때 코드 종료
        while (!myQueue.isEmpty()) {
            int temp = myQueue.poll();
            System.out.println(temp);
            for (int target : myList.get(temp)) {
                if (visited[target] == false) {
                    myQueue.add(target);
//                    queue 에 add 하는 시점에 boolean  값 세팅
                    visited[target] = true;
                }
            }
        }

    }
}
