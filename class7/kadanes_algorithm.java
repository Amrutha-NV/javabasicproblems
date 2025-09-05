package class7;
import java.util.Scanner;
public class kadanes_algorithm {
    public static void kadanes(int arr[]){
        int max_sum=Integer.MIN_VALUE;
         int curr_sum=0;
        for(int i=0;i<arr.length;i++){
            curr_sum+=arr[i];
            max_sum=Math.max(curr_sum, max_sum);
            if(curr_sum<0){
                curr_sum=0;
            }
           
        }
         System.out.println("the max sum of the subarray: "+max_sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={-1,-2,-6,-1,-3};
        kadanes(nums);
        sc.close();
    }
    
}
