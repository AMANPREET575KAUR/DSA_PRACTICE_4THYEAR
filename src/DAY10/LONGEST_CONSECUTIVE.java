package DAY10;

import java.util.*;

public class LONGEST_CONSECUTIVE {

    public static int longestConsecutive(int[] nums) {
        HashSet<Integer> s = new HashSet<>();


        for (int x : nums) {
            s.add(x);
        }

        int ans = 0;


        for (int x : s) {
            if (!s.contains(x - 1)) {
                int y = x;
                while (s.contains(y)) {
                    y++;
                }
                ans = Math.max(ans, y - x);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println(longestConsecutive(nums));

        sc.close();
    }
}
