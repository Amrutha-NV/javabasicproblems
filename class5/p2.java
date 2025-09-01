package class5;
import java.util.Scanner;
public class p2 {
    public static int factorial(int num){
         int fact=1;
        if(num==0||num==1){
            return fact;
        }
        else{
             for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
        }
       
        
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number to the factorial ");
        int num=sc.nextInt();
        int fact=factorial(num);
        System.out.println(fact);
        sc.close();
     }
}
