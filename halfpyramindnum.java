public class halfpyramindnum {
    public static void half(int n){
        for(int i=1;i<=n;i++){
            for (int j=1;j<=n+1-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
half(5);
    }
    
}
