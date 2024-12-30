package A7이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class A703과자막대 {
    public static void main(String[] args) throws IOException {

//        조카의 수 M 과자의 수 N
//        과자 N개의 길이
//        최대길이 구하기.
//        같은 길이의 막대과자 나눠주기.
//        쪼갤 수는 있지만 합치지는 못함

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] starr = br.readLine().split(" ");
        int N = Integer.parseInt(starr[0]);
        int M = Integer.parseInt(starr[1]);
        String[] starr2 = br.readLine().split(" ");
        int[] arr = new int[starr2.length];
        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(starr2[i]);
        }

        int start = arr[0];
        int end = arr[arr.length-1];
        int max = 0;

        while (start <= end) {
            int count = 0;
            int mid = (start+end)/2;
            int total = 0;
            for (int a : arr) {
                if ((a / mid) >= 1) {
                    count++;
                }
            }
            if (count >= N) {
                max = mid;
            }
            start = mid +1;
        }
        System.out.println(max);
    }
}

