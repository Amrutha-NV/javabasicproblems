//solid rectangle
// ****
// ****
// ****
// ****
// ****
package javabasicproblems;
import java.util.*;
class Pattern1{
public static void main(String[] args) {
    try(Scanner sc=new Scanner(System.in)){
    System.out.println("enter the number of rows");
    int n=sc.nextInt();
    System.out.println("enter the number of columns");
    int m=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<m;j++){
            System.out.print("*");
        }
         System.out.println();

    }
   
    }
    
}
}