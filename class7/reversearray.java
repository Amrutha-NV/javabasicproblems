package class7;
import java.util.Scanner;
public class reversearray {
    public static void reverse(int arr[]){
        int start=0,end=arr.length-1;
        while (start<=end) {
            int temp=0;
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start+=1;
            end-=1;
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]={7,11,9,99,45,89};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        sc.close();

    }
}
