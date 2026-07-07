import java.util.*;
public class MAXSUBARRAY_BRUTEFORCE {
    public static int subarray(int arr[]){
            int maxsum=Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                int currsum=0;
                for(int j=i;j<arr.length;j++){
                    currsum=arr[j]+currsum;
                    maxsum=Math.max(maxsum,currsum);
                }
            }
            return maxsum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=subarray(arr);
        System.out.println(ans);
    }
}
