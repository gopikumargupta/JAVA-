public class factorial {
    public static long fact(long n){
        
        if(n==0){
            return 1;
        }
        
          long  fact = n * fact(n-1);
          return fact;
        
    } 
    public static void main(String args[]){
       
System.out.print(fact(7));
    }
    
}
