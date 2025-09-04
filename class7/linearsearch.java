package class7;
//linear search
import java.util.Scanner;
public class linearsearch {
    public static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[]={7,11,9,99,45};
        System.out.println("enter the value to find");
        int key=sc.nextInt();
        int index=linear(numbers,key);
        if(index==-1){
            System.out.println(key+"not found");
        }
        else{
            System.out.println(key+"found at index"+index);
        }
        sc.close();

    }
    
}
