public class hollowpattern {
    public static void hollo(int trow,int tcol){
        for(int i=1;i<=trow;i++){
            for(int j=1;j<=tcol;j++){
                if(i==1||i==trow||j==1||j==tcol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        } 
    }
    public static void main(String args[]){
hollo(5,4);
    }
    
}
