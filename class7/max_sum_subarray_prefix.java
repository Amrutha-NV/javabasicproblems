package class7;
//maximum of a subarray using prefix array optimization
import java.util.Scanner;
public class max_sum_subarray_prefix {
    public static void max_sum_prefix(int arr[]){
        // calculating the prefix array
        int largest=Integer.MIN_VALUE;
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int cur_sum=0;
            for(int j=i;j<arr.length;j++){
                cur_sum= i==0? prefix[j]:prefix[j]-prefix[i-1];
                largest=Math.max(cur_sum,largest);
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={-1,-2,-6,-1,-3};
        max_sum_prefix(nums);
        sc.close();
    }
}
