package DAY5;

import java.util.*;

public class QUERIES {

    static class Solution {

        public List<Integer> specialXor(int N, int Q, int[] a, int[][] query) {


            int xr = 0;
            for (int x : a) {
                xr ^= x;
            }


            int[] pre = new int[N + 1];
            pre[0] = 0;

            for (int i = 1; i <= N; i++) {
                pre[i] = pre[i - 1] ^ a[i - 1];
            }

            List<Integer> ans = new ArrayList<>();


            for (int i = 0; i < Q; i++) {

                int l = query[i][0];
                int r = query[i][1];


                int inside = pre[r] ^ pre[l - 1];


                ans.add(xr ^ inside);
            }

            return ans;
        }
    }
}
