package class7;
import java.util.Scanner;
public class binarysearch {
    public static int binary(int arr[],int key){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(arr[mid]>key){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]={1,2,3,4,5,7,11,12};
        System.out.println("enter the value to find");
        int key=sc.nextInt();
        int index=binary(numbers,key);
        if(index==-1){
            System.out.println(key+"not found");
        }
        else{
            System.out.println(key+"found at index"+index);
        }
        sc.close();

    }
    
}
