package DAY9;

import java.util.*;

public class MAX_SUBARRAY_SUM {

    public static long maximumSumSubarray(long[] nums, long k) {

        int n = nums.length;

        if (k > n) {
            return 0;
        }

        long windowSum = 0;


        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }

        long maxSum = windowSum;


        for (int i = (int) k; i < n; i++) {


            windowSum += nums[i];


            windowSum -= nums[i - (int) k];


            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();

        long[] nums = new long[n];


        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextLong();
        }


        long k = sc.nextLong();

        System.out.println(maximumSumSubarray(nums, k));

        sc.close();
    }
}
