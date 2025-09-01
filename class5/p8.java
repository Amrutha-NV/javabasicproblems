// sum of digits in a number
package class5;
import java.util.Scanner;
public class p8 {
    public static int digit_sum(int num){
        int sum=0;
        while(num>0){
            int lastDigit=num%10;
            sum+=lastDigit;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        int num=sc.nextInt();
        int sum=digit_sum(num);
        System.out.println(sum);
        sc.close();


    }
}
