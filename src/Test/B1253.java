package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1253 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] a = new int[N];
        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            a[i] = Integer.parseInt(inputs[i]);
        }
        Arrays.sort(a);

        int count = 0;
        for (int i = 0; i < N; i++) {
            int start = 0;
            int end = N - 1;
            while (start < end) {
                if (start == i) {
                    start++;
                    continue;
                } else if (end == i) {
                    end--;
                    continue;
                }
                int sum = a[start]+a[end];
                int target = a[i];
                if (target == sum) {
                    count++;
                    break;
                } else if (target > sum) {
                    start++;
                } else if (target < sum) {
                    end--;
                }
            }
        }
        System.out.println(count);
    }
}
