package class3;
//factorial of a number
public class p8 {
    public static void main(String[] args) {
        int fact=1;
        int n=1;
        if(n==0||n==1){
            System.out.println("the factorial is 1");
        }
        else{
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            System.out.println("the factorial is:"+fact);
        }
    }
    
}
