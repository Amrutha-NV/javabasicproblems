package class2;
import java.util.Scanner;
//leap year and not a leap year
public class p5 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int year=sc.nextInt();
    boolean x=(year%4)==0; //leap
    boolean y=(year%100)!=0;//leap
    boolean z=(year%100)==0 && (year%400)==0; //leap
    if(x && (y||z) ){
        System.out.println("this is a leap year:"+year);
    }
    else{
        System.out.println("this is a non  leap year:"+year);
    }
    sc.close();
    }
}
