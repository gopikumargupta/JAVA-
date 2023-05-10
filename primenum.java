import java.util.*;
public class primenum {
    public static boolean isPrime(int a) {
        if(a==1){
            return true;
        }
        else if(a<1){
            return false;

        }
        boolean isprime=true;
        for(int i=2;i<=a-1;i++){
            if(a % i == 0){
                return false;
                
            }
            return true;
            
        }
        return isprime;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        int a=s.nextInt();
        System.out.println(isPrime(a));
    }
}
