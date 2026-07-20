package DAY10;
public class LONGEST_CONSECUTIVE_BRUTE_FORCE {

    public static boolean contains(int[] nums, int target) {

        for (int num : nums) {
            if (num == target) {
                return true;
            }
        }

        return false;
    }

    public static int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int longest = 1;

        for (int i = 0; i < nums.length; i++) {

            int current = nums[i];
            int count = 1;

            while (contains(nums, current + 1)) {
                current++;
                count++;
            }

            longest = Math.max(longest, count);
        }

        return longest;
    }

    public static void main(String[] args) {

        int[] nums = {100, 4, 200, 1, 3, 2};

        int ans = longestConsecutive(nums);

        System.out.println("Longest Consecutive Sequence Length = " + ans);
    }
}