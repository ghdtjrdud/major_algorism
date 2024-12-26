package A3bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class A306숨바꼭질 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nk = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (nk[0]>=nk[1]) {
            System.out.println(nk[0]-nk[1]);
            return;
        }
        System.out.println(solution(nk[0], nk[1]));

    }
    public static int solution(int n, int k){
        int[] dp = new int[k+3];
        for (int i = 0; i<=k+2; i++) {
            dp[i] = Math.abs(i-n);
        }

        for (int i = n; i<k+2; i++){
            int min;
            if (i %2==0) min = dp[i/2]+1;
            else min = Math.min(dp[(i-1)/2], dp[(i+1)/2])+2;
            dp[i] = Math.min(dp[i],min);
        }
        return dp[k];
    }
}