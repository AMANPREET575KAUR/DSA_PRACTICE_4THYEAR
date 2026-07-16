package DAY7;

import java.util.*;

public class MIN_REMOVALS {

    static class Solution {

        public int minRemovals(int n, int m, int[] arrN, int[] arrM) {

            int[] k = arrM;

            int[] cnt = new int[m + 1];

            int sum = 0;
            for (int x : k) {
                sum += x;
            }

            int preSat = 0;
            for (int i = 0; i < m; i++) {
                if (k[i] == 0) {
                    preSat++;
                }
            }

            int left = 0;
            int satisfied = preSat;
            int minLen = Integer.MAX_VALUE;

            for (int right = 0; right < n; right++) {

                int c = arrN[right];
                cnt[c]++;

                if (cnt[c] <= k[c - 1]) {
                    satisfied++;
                }

                while (satisfied == m) {

                    minLen = Math.min(minLen, right - left + 1);

                    int lc = arrN[left];
                    cnt[lc]--;

                    if (cnt[lc] < k[lc - 1]) {
                        satisfied--;
                    }

                    left++;
                }
            }

            return (minLen == Integer.MAX_VALUE) ? -1 : (minLen - sum);
        }
    }
}
