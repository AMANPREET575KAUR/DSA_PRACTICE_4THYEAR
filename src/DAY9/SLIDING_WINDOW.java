package DAY9;

import java.util.*;

public class SLIDING_WINDOW {

    static class Solution {

        public List<Integer> solve(int N, int[] arr, int target) {

            List<Integer> ans = new ArrayList<>();

            int start = 0;
            int sum = 0;

            for (int end = 0; end < N; end++) {

                sum += arr[end];

                while (sum > target && start <= end) {
                    sum -= arr[start];
                    start++;
                }

                if (sum == target) {
                    ans.add(start + 1);
                    ans.add(end + 1);
                    return ans;
                }
            }

            ans.add(-1);
            return ans;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();

        int[] arr = new int[N];


        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }


        int target = sc.nextInt();

        Solution sol = new Solution();

        List<Integer> result = sol.solve(N, arr, target);

        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
