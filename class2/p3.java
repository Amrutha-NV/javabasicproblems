package class2;
import java.util.Scanner;
// poisitive negative
public class p3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        String result=number>0?"positive":"negative";
        System.out.println(result);
        sc.close();
    }
}
