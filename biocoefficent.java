import java.util.*;
public class biocoefficent {
    public static long fact(long x){
        long f=1;
        for(int i=1;i<=x;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String argu[]){
        Scanner s=new Scanner(System.in);
        long n= s.nextLong();
        long r= s.nextLong();
        long a=n-r;
        System.out.println("biocoff  " + fact(n)/(fact(r)*fact(a)));
        
    }
    
}
