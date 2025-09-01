// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1

//inverted number pattern

package class4;
import java.util.Scanner;
public class p5 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want a inverted number pattern for:");
        int line=sc.nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=(line-i+1);j++){
               System.out.print(j+" ");
                
            }
            System.out.println();
        }
        sc.close();
        
    }
    
}
