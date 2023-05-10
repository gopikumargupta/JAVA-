import java.util.*;
public class mulof10 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("enter your number");
            int n=s.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
