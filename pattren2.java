//hollow rectangle
// *****
// *   *
// *   *
// *   *
// *****
package javabasicproblems;
import java.util.*;
public class pattren2 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            System.out.println("enter the number of rows:");
            int n=sc.nextInt();
            System.out.println("enter the number of columns");
            int m=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    //stars
                    if(i==1||i==n||j==1||j==m){
                        System.out.print("*");
                    }
                    //spaces
                    else{
                        System.out.print(" ");
                    }
                    //new line
                }System.out.println();
            }

        }
        
    }
}
