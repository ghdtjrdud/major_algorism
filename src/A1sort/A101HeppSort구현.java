package A1sort;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class A101HeppSort구현 {
    public static void main(String[] args) {
        int[] arr = {7, 6, 5, 8, 3, 5, 9, 1, 6};
//        최초힙구성 : n*log(n)

        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            heepify(arr,i, arr.length);
        }
//        System.out.println(Arrays.toString(arr));

//        pq를 통한 정렬방법
        int[] newArr = new int[arr.length];
        Queue<Integer> pq = new PriorityQueue<>();
        for (int a : arr) {
            pq.add(a);
        }
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = pq.poll();
        }
        System.out.println(Arrays.toString(newArr));

//        루트노드와 최하위노드를 change 하면서 heepify
//        최하위노드는 change가 될 때 마다 자리수가 -1
        for (int i = arr.length-1; i >= 0 ; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            heepify(arr,0, i);
        }
    }

    static void heepify(int[] arr, int parent, int leng) {
        int left = parent*2+1;
        int right = parent*2+2;
//        check1 : 왼쪽, 오른쪽 노드가 배열의 길이보다 짧아야함
//        check2 : left, right 둘 중에 parent 의 값보다 적은 값이 있을경우 자리 바꿈 후 재귀호출.
        if (left >= leng) {
            return;
        }
        if (right >= leng) {
//            left 만 존재
            if (arr[parent] < arr[left]){
                int temp = arr[parent];
                arr[parent] = arr[left];
                arr[left] = temp;
                heepify(arr, left, leng);
            }
        } else {
//            left, right 둘다 존재
            int index = 0;
            if (arr[parent] < arr[left] || arr[parent] < arr[right]) {
                if (arr[left] < arr[right]) {
                    index = right;
                } else {
                    index = left;
                }
                int temp = arr[parent];
                arr[parent] = arr[index];
                arr[index] = temp;
                heepify(arr, index, leng);
            }
        }

    }
}
