package A4greedy;

public class A402체육복 {
    public static void main(String[] args) {
        Solution s1 = new Solution();
        s1.solution(3, new int[]{3}, new int[]{1});

    }
}

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] count = new int[n+1];
        for (int i = 0; i < count.length; i++) {
            count[i] = 1;
        }

        for (int i = 0; i < lost.length; i++) {
            int a = lost[i];
            count[a] -= 1;
        }
//        System.out.println("lost했을 때"+Arrays.toString(count));
        for (int i = 0; i < reserve.length; i++) {
            int a = reserve[i];
            count[a] += 1;
        }
//        System.out.println("reserve했을 때"+Arrays.toString(count));
        for (int i = 0; i < count.length; i++) {
            if (count[i] >= 2) {
                if (count[i + 1] > count[i - 1]) {
                    count[i] -= 1;
                    count[i-1] += 1;
                } else if (count[i + 1] < count[i - 1]) {
                    count[i] -= 1;
                    count[i + 1] += 1;
                } else {
                    count[i] -= 1;
                    count[i-1] += 1;
                }
            }
        }
        int answer = 0;
        for (int a : count) {
            if (a >= 1) {
                answer++;
            }
        }
//        System.out.println(Arrays.toString(count));
//        System.out.println(answer-1);
        return answer;
    }
}
