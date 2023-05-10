public class sumofnatural {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int k=sum(n-1);
        int na=n+k;
        return na;
    }

    public static void main(String args[]){
System.out.print(sum(5));
    }
    
}
