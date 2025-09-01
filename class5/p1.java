package class5;
import java.util.Scanner;
public class p1 {
    public static int multiply(int a,int b){
        int result=a*b;
         System.out.println("the result is:"+result);
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number a");
        int a=sc.nextInt();
        System.out.println("enter a number b");
        int b=sc.nextInt();
        multiply(a,b);
       
        sc.close();
    }
}
