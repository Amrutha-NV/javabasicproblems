package class2;
import java.util.Scanner;
// income tax calculator
public class p1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your income");
        int income=sc.nextInt();
        if(income < 500000){
            System.out.println("the tax percentage is:"+0);
        }
        else if(income>=500000 && income<=1000000){
            System.out.println("the tax percentage is:"+ (int)(income*0.2));
        }
        else{
            System.out.println("the tax percentage is:"+ (int)(income*0.3));
        }

        sc.close();
    }
}
