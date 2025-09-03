package class6;
//solid rhombus
public class p6 {
    public static void rhombus(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" "+" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*"+" ");
            }
            // for(int j=n;j>=1;j--){
            //     System.out.print(" "+" ");
            // }// doesnt matter
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rhombus(5);
    }
}
