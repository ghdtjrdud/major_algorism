package A6topointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A6TwopointerBasic {
    public static void main(String[] args) {

//      아래 배열에서 target 이 될 수 있는 두 수의 조건
//        배열에는 중복된 수는 없다고 가정
        int[] nums = {7, 8, 9, 2, 4, 5, 1, 3, 6};
        int target = 10;
        List<int[]> myList = new ArrayList<>();
        List<int[]> myList2 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    myList.add(new int[]{nums[i],nums[j]});
                }
            }
        }
        for (int[] a : myList) {
            System.out.println(Arrays.toString(a));
        }

//        투포인터를 활용한 조합찾기
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int start = 0;
        int end = nums.length;
        int total = nums[start] + nums[end];

        while (start < end) {
            if (total == target) {
                myList2.add(new int[]{nums[start], nums[end]});
                end--;
            } else if (total < target) {
                start++;
            } else {
                end--;
            }
        }
        for (int[] a : myList2) {
            System.out.println(Arrays.toString(a));
        }
    }
}
