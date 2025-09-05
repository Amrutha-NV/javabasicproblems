package class7;
import java.util.Scanner;
public class listofsubarray {
    public static void subarray(int arr[]){
       
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                 int currsum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    currsum+=arr[k];// calculating the sum of each sub array
                }
                System.out.println();
                System.out.println("the sum is:"+currsum);//printing that sum
                if(currsum>max_sum){// comparing with the largest value each and everytime and updating it
                    max_sum=currsum;
                }
                if(currsum<min_sum){// comparing the smallest value each and everytime and updating it
                    min_sum=currsum;
                }
                System.out.println();
            }
            System.out.println();
          
        }
          System.out.println("the smallest value is:"+" "+min_sum);
          System.out.println("the largest value is"+" "+max_sum);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]={2,4,6,8,10};
        subarray(numbers);
        sc.close();
    }

    
}
