//0-1 triangle

package javabasicproblems;
import java.util.*;
public class pattren9 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter the number of rows:");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if((i+j)%2==0){
                        System.out.print(1+" ");
                    }
                    else{
                        System.out.print(0+" ");
                    }
                }System.out.println();

            }
        }
    }
    
}
