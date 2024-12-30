package A7이분탐색;

import java.util.Arrays;

public class A701BinaryBasic2 {
    public static void main(String[] args) {

//        이분탐색은 사전에 데이터가 오름차순 정렬이 되어 있어야 가능한 알고리즘
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
//          target이 arr에 있다면 index값 return
//          target이 arr에 없다면 있어야할 자리의 index를 return
        int target = 2;
        int answer = -1;

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int middle = (start+end)/2;
            if (target == middle) {
                answer = middle;
                break;
            } else if (target > arr[middle]) {
                start = middle +1;
            } else if (target < arr[middle]) {
                end = middle -1;
            }
        }
        int answer2 = Arrays.binarySearch(arr, 19);
        if (answer2 < 0) {
            System.out.println(Math.abs(answer2) - 1);
        } else {
            System.out.println(answer2);
        }
    }
}
