public class decresingorder{
    public static int dec(int n){
        if(n==1){
            return 1;

        }
        
             System.out.println(n);
             return dec(n-1);

        
    }
    public static void main(String args[]){
System.out.println(dec(10));

    } 
}