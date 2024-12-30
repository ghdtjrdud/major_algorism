package Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1715copu {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int n = 1;

        int[] Arr = new int[N];

        for (int i = 0; i < N; i++) {
            int numbers = Integer.parseInt(br.readLine());
            Arr[i] = numbers;
        }
        Arrays.sort(Arr);

        sum(Arr, n, sum);
        System.out.println(sum);
    }
    public static void sum(int[] Arr, int n, int sum ){
        if (n == Arr.length) {
            return;
        }

        for (int i = 0; i <= Arr.length; i++) {
            if ((i + 1) < Arr.length) {
                sum = Arr[i] + Arr[i + 1];
                n++;
                sum(Arr, n, sum);
            }
        }
    }
}
