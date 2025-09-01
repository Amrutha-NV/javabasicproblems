//to check if a given number is plaindrome
package class5;
import java.util.Scanner;
public class p7 {
    public static int reverse(int num){
        int reverse=0;
        while(num>0){
            int lastDigit=num%10;
            reverse=(reverse*10)+lastDigit;
            num=num/10;
        }
        return reverse;
    }
    public static void palindrome(int num ,int reverse){
         if(reverse==num){
            System.out.println(num+"is a palindrome ");
        }
        else{
            System.out.println(num+"is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number you want to check");
        int num=sc.nextInt();
        int reverse=reverse(num);
        palindrome(num,reverse);
        sc.close();
    }
}
