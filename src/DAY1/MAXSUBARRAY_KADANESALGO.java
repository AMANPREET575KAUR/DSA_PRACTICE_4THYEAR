package DAY1;

import java.util.*;
public class MAXSUBARRAY_KADANESALGO {
    public static int maxsub(int arr[]){
        int currsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++){
            currsum=Math.max(arr[i],arr[i]+currsum);
            maxsum=Math.max(maxsum,currsum);
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
        int ans=maxsub(arr);
        System.out.println(ans);
    }
}
