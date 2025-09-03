package class3;
// reverse a number
public class p5 {
    public static void main(String[] args) {
        int n=10899;
        int reverse=0;
        while(n>0){
            int lastDigit=n%10;
            System.out.println(lastDigit);
            reverse=(reverse*10)+lastDigit;//to create a reverse number
            n=n/10;
    }
    System.out.println(reverse);

    }
   
    
}
