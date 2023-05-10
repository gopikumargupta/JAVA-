import java.util.*;
public class factfun {
    public static long fact(long x){
        long f=1;
for(int i=1;i<=x;i++){
    f=f*i;
}
return f;


}
    
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter number");
        long a=s.nextLong();
        System.out.println("fact ="+fact(a));



    }
    
}
