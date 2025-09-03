//complex pattern
// hollow rectangle
// *****
// *   *
// *   *
// *****
package class6;
import java.util.Scanner;
public class p1 {
    public static void hollow_rectangle(int n,int m){
         for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1||i==n||j==1||j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                } 
            }
            System.out.println();
        }
    }
        
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        hollow_rectangle(4,5);

        sc.close();
    }
   
}
