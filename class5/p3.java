// binomial coefficient
package class5;
import java.util.Scanner;
public class p3 {
    public static int factorial(int num){
         int fact=1;
        if(num==0||num==1){
            return fact;
        }
        else{
             for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
        }
       
        
    }
    public static int binomial(int n,int r,int diff){
        int binomial=((n)/(r*(diff)));
        return binomial;
    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a value of n ");
        int n=sc.nextInt();
        System.out.println("enter a value of r ");
        int r=sc.nextInt();
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int n_rfact=factorial(n-r);
        int binomial_coefficent=binomial(n_fact,r_fact,n_rfact);
        System.out.println(binomial_coefficent);
        
        sc.close();
     }
}
