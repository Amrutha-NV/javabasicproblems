package class2;
import java.util.Scanner;
//largest of three numbers
public class p2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b && a>c){
            System.out.println("the largest number is :"+a);
        }
        else if(b>a && b>c){
            System.out.println("the largest number is :"+b);
        }
        else{
            System.out.println("the largest number is :"+c);
        }
        sc.close();
    }
}
