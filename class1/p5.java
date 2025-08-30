package class1;
import java.util.Scanner;

public class p5 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int a=sc.nextInt();
        System.out.println("enter a number");
        int b=sc.nextInt();
        int mul=a*b;
        System.out.println(mul);
        sc.close();
    }
}
