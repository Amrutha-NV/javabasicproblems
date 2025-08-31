package class2;

public class p6 {
    public static void main(String[] args) {
        int x,y,z;
        x=y=z=2;
        x+=y;
        System.out.println(x);//4
        y-=z;
        System.out.println(y);//0
        z/=(x+y);
        System.out.println(z);//0(0.5)
    }
   
}
