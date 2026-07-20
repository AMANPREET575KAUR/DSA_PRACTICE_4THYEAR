package DAY10;

import java.util.*;

public class LONGEST_SUBARRAY_DIV_BYK {

    static long subarraysDivByK(int[] arr, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);

        long ans = 0;
        long sum = 0;

        for (int x : arr) {
            sum += x;
            int rem = (int) ((sum % k + k) % k);

            ans += m.getOrDefault(rem, 0);
            m.put(rem, m.getOrDefault(rem, 0) + 1);
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();


        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        int k = sc.nextInt();


        System.out.println(subarraysDivByK(arr, k));

        sc.close();
    }
}