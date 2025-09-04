package class7;
import java.util.Scanner;
public class pairsinarray {
    public static void array_pairs(int arr[]){
        int tp=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")");
                tp++;
            }
             System.out.println(" ");
        }
        System.out.println("total pairs "+tp);
       
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]={1,2,3,4,5,6};
        array_pairs(numbers);
        sc.close();

    }
}
