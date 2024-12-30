package A7이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A0702수찾기 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] stArr = br.readLine().split(" ");
        int[] Arr = new int[stArr.length];
        for (int i = 0; i < N; i++) {
            Arr[i] = Integer.parseInt(stArr[i]);
        }
        int M = Integer.parseInt(br.readLine());
        String[] stArr2 = br.readLine().split(" ");
        int[] Arr2 = new int[stArr2.length];
        for (int i = 0; i < N; i++) {
            Arr2[i] = Integer.parseInt(stArr2[i]);
        }

        for (int i = 0; i < Arr2.length; i++) {
            int start = 0;
            int end = Arr.length - 1;
            int index = -1;
            while (start <= end) {
                int mid = (start + end) / 2;
                if (Arr[mid] == Arr2[i]) {
                    index = mid;
                    break;
                } else if (Arr[mid] > Arr2[i]) {
                    end = mid - 1;
                } else if (Arr[mid] < Arr[i]) {
                    start = mid +1;
                }
                if(index!=-1){
                    System.out.println(1);
                }else {
                    System.out.println(0);
                }
            }


        }




    }
}

