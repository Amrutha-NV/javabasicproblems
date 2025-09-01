// to print prime numbers in the given range
package class5;
import java.util.Scanner;

public class p5 {
    public static void prime_not(int n){  
            boolean prime=true;
            for(int i=2 ;i<=Math.sqrt(n);i++){
            if(n%i==0){//n is a multiple of i where iis not 1 or n
                prime=false;
                break;
            }
            }
        if(prime==true||(n==2)){
            System.out.print(n+" ");
        }
          
            
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int range=sc.nextInt();
        for(int i=2;i<=range;i++){
           prime_not(i);
        }
       
        
        sc.close();
    }
}
