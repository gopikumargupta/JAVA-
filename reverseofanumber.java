public class reverseofanumber{
    public static void main(String args[]){
        int n=50499747;
        while(n>0){
            int lastnumber = n % 10;
            System.out.print(lastnumber);
           n=n/10;
        }
        
    }
}