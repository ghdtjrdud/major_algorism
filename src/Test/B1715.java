package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B1715 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            int numbers = Integer.parseInt(br.readLine());
            pq.add(numbers);
        }
        int sum = 0;

        while (!pq.isEmpty()) {
            sum = sum + pq.poll();
            pq2.add(sum);
        }
        System.out.println(sum);


    }
}
