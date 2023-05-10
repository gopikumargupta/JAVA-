public class fibonachi {
    public static int fab(int n){
        if(n==0||n==1){
            return n;
        }
        
        int f1=fab(n-1);
        int f2=fab(n-2);
        int fab=f1+f2;
        return fab;
    }
    public static void main(String args[]){
        System.out.print(fab(7));

    }
    
}
