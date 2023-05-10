import java.util.*;
public class calcullater {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter first number");
        int a = s.nextInt();
        System.out.println("enter second number");
        int b=s.nextInt();
        System.out.println("enter operation");
        char o=s.next().charAt(0);
        switch(o){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.print(a%b);
            break;
            default : System.out.println("wrong input");
            break;


        } 

    }
    
}
