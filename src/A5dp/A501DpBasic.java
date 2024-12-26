package A5dp;

import java.util.Arrays;

public class A501DpBasic {
    public static void main(String[] args) {
//        1,4,5로 13을 만들 수 있는 조합 중에 가장 작은 조합의 개수
//        greedy 로 풀경우 : 5개 (5*2 + 1*3)
//        dfs, bfs로 풀경우 일반적으로 시간초과 나도록 설계

//        dp로 풀경우 : 3개(4*2 + 5*1)
//        Min(f(n-1), f(n-2)...) +1
        int target = 9;
        int[] numbers = {1,4,5};

        int[] temp = new int[3];

        for (int i = 0; i < numbers.length; i++) {
//            if ()
            temp[i] = (target/numbers[i]) + (target%numbers[i]);
        }
        Arrays.sort(temp);
        System.out.println(temp[0]);
    }
}
