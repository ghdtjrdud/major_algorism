package A5dp;

import java.util.ArrayList;
import java.util.List;

public class A502멀리뛰기 {
    public static void main(String[] args) {

        int n = 4;
        int[] arr = new int[n + 1];
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }


    }
}


