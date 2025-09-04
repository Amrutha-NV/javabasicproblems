package class7;
import java.util.Scanner;
public class largestvalue {
    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
     public static int smallest(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,4,7,34,11};
        int largest=largest(arr);
        System.out.println("the largest value in the array is:"+largest);
         int smallest=smallest(arr);
        System.out.println("the largest value in the array is:"+smallest);
        sc.close();
    }
    
}
