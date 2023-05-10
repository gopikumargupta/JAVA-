import java.util.*;
public class amulbfun {
    public static int mul(int x,int y){
int mul=x*y;
return mul;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter no 1");
        int a=s.nextInt();
        System.out.println("enter no 2");
        int b=s.nextInt();
        mul(a,b);
        System.out.println("Total ="+mul(a,b));

    }
    
}
