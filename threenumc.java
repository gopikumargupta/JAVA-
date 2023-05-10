import java.util.*;
public class threenumc {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a=s.nextInt();
        System.out.println("enter secand number");
        int b=s.nextInt();
        System.out.println("enter third number");
        int c=s.nextInt();
        if(a>=b && a>=c){
            System.out.println("first is grestest");
        }
        else if(b>=c){
            System.out.println("2nd  is grestest");
        
        }
        else{
            System.out.println("third is gretest");
        }
    }
}
