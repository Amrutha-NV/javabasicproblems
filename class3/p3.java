package class3;
import java.util.Scanner;
// sum of n numbers
public class p3 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
         int sum=0;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.print(sum);
        sc.close();
    }
    
}
