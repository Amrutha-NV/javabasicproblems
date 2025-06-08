//inverted half pyramid rotated by 180deg
//     *
//    **
//   ***
//  ****
// *****
package javabasicproblems;
import java.util.*;
public interface pattren5 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
              System.out.println("enter the number of rows:");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                 System.out.println();
            }
           
        }
    }
    
}
