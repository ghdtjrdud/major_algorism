package A5dp;

import java.util.Arrays;

public class A504땅따먹기 {

    public class A0504땅따먹기 {
        public static void main(String[] args) {
            int[][] land = {{1, 2, 3, 5},
                    {5, 6, 7, 8},
                    {4, 3, 2, 1}};

            for (int i = 1; i < land.length; i++) {
                for (int j = 0; j < 4; j++) {
                    int max = land[i][j];
                    for (int k = 0; k < 4; k++) {
                        if (j != k && (land[i - 1][k] + land[i][j]) > max) {
                            max = (land[i - 1][k] + land[i][j]);
                        }
                    }
                    land[i][j] = max;
                }
            }
            System.out.println(Arrays.deepToString(land));

        }
    }
}
