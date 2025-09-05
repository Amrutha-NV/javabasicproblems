package class7;
import java.util.Scanner;
public class max_subarray_optimized {
    public static void max_sum(int arr[]){
           int largest=Integer.MIN_VALUE;
           for(int i=0;i<arr.length;i++){
                    int curr_sum=0;
               for(int j=i;j<arr.length;j++){
                    curr_sum+=arr[j];
                    System.out.println(curr_sum);
               }
               largest=Math.max(curr_sum,largest);
           }
           System.out.println("largest sum:"+largest);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={1,-2,6,-1,3};
        max_sum(nums);
        sc.close();
    }
}
