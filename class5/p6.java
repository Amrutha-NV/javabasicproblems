// binary to decimal using functions
package class5;
import java.util.Scanner;

public class p6 {
    public static int B_D(int num){
        int pow=0;
        int dec=0;
        while (num>0) {
           int lastDigit=num%10;
            dec=dec+(lastDigit*(int)(Math.pow(2,pow)));
            pow++;
            num=num/10;
        }
        return dec;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number in binary :");
      int num=sc.nextInt();
       int result=B_D(num);
        System.out.println(result);
        sc.close();
    }
}
