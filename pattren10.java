//print thhe pattren
package javabasicproblems;

import java.util.Scanner;

public class pattren10 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
              System.out.println("enter the number of rows:");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(i+" ");
                }System.out.println();
            }
        }
    }
    
}
