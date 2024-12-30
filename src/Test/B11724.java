package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class B11724 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] stArr = br.readLine().split(" ");
        int N = Integer.parseInt(stArr[0]);
        int M = Integer.parseInt(stArr[1]);

        List<List<Integer>> myList = new ArrayList<>();
        boolean[] visited = new boolean[N+1];
        Queue<Integer> myQueue = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            myList.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            String[] inputs = br.readLine().split(" ");
            int a = Integer.parseInt(inputs[0]);
            int b = Integer.parseInt(inputs[1]);

            myList.get(a).add(b);
        }

        myQueue.add(2);
        visited[2] = true;

        while (!myQueue.isEmpty()) {
            int temp = myQueue.poll();
            System.out.println(temp);
            for (int target : myList.get(temp)) {
                if (visited[target] == false) {
                    myQueue.add(target);
                    visited[target] = true;
                }
            }
        }

    }
}
