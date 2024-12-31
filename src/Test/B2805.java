package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;

public class B2805 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int target = Integer.parseInt(input[1]);
        String[] input2 = br.readLine().split(" ");
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(input2[i]);
        }
        Arrays.sort(numbers);

        int start = 0;
        int end = numbers[numbers.length-1];
        int max = 0;

        while (start <= end) {
            int sum = 0;
            int mid = (start + end) / 2;
            for (int i = 0; i < numbers.length ; i++) {
                if (numbers[i] - mid > 0) {
                    sum = sum + (numbers[i] - mid);
                }
            }
                if (sum == target) {
                    break;
                } else if (sum < target) {
                    start = mid +1;
                } else if (sum > target) {
                    end = mid -1;
                }

        }
        System.out.println(sum);
    }
}
