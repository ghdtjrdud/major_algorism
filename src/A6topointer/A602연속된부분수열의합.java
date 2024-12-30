package A6topointer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class A602연속된부분수열의합 {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 5};
        int start = 0;
        int end = 0;
        int target = 7;
        int total = sequence[0];
        List<int[]> list = new ArrayList<>();
        while (start <= end  && end < sequence.length) {
            if (total == target) {
                list.add(new int[]{start, end});
                total -= sequence[start];
                start++;
            } else if (total > target) {
                total -= sequence[start];
                start++;
            } else if (total < target && end < sequence.length-1) {
                end++;
                total += sequence[end];
            }
        }
        list.sort(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return 0;
            }
        });
    }
}
