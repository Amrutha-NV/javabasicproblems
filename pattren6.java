// numbers half pyramid
// 1
// 1 2
// 1 2 3 
// 1 2 3 4
// 1 2 3 4 5
package javabasicproblems;
import java.util.*;
public class pattren6 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
              System.out.println("enter the number of rows:");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }System.out.println();
            }
        }
    }
    
}

