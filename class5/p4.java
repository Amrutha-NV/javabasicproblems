package class5;
//implementation of prime or not using functions
import java.util.Scanner;

public class p4 {
    public static void prime_not(int n){
        if(n==2){
            System.out.println("prime number");
        }
        else{
            boolean prime=true;
            for(int i=2 ;i<=Math.sqrt(n);i++){
            if(n%i==0){//n is a multiple of i where iis not 1 or n
                prime=false;
                break;
            }
            }
            if(prime==true){
            System.out.println("the number is prime");
            }
            else{
            System.out.println("the number is not prime");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime_not(n);
        
        sc.close();
    }
}
