package class3;
import java.util.Scanner;
public class p7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number values you want to enter");
        int count=sc.nextInt();
        int even_sum=0;
        int odd_sum=0;
        for(int i=1;i<=count;i++){
            System.out.println("enter the number:");
            int num=sc.nextInt();
            if(num%2==0){
                even_sum+=num;
            }
            else{
                odd_sum+=num;
            }
        }
        System.out.println("the sum of even numbers is:"+even_sum);
        System.out.println("the sum of odd numbers is:"+odd_sum);
        sc.close();
    }
    
}
