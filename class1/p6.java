package class1;
import java.util.Scanner;
public class p6 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        float r=sc.nextFloat();
        double pi=3.142;
        double area=pi*(r*r);
        System.out.println(area);
        sc.close();
    }
}
