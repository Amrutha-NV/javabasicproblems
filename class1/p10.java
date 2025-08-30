package class1;
import java.util.Scanner;
public class p10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float pencilPrice=sc.nextFloat();
        float penPrice=sc.nextFloat();
        float EraserPrice=sc.nextFloat();
        float bill=pencilPrice+penPrice+EraserPrice;
        System.out.println(bill);
        int $=24;//special characters as variable name
        System.out.println($);
        sc.close();
    }
    
}
