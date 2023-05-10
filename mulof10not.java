import java.util.*;
public class mulof10not {
    public static void main(String args[]){
        Scanner s =new Scanner(System.in);
        do{
            System.out.println("enter number");
            int n=s.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println("your number" + n);
        }while(true);
    }
    
}
