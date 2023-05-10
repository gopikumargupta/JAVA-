public class subarray{
    public static void subarr(int num[]){
for(int i=0;i<num.length;i++){
    int curr=i;
    for(int j=i;j<num.length;j++){
       int end=j;
       for(int k=curr;k<=end;k++){
        System.out.print(num[k]+ " ");bbbb
        
       }System.out.println();
    }System.out.println();
}
    }
    public static void main(String args[]){
int num[] = {2,4,6,8,10};
subarr(num);
    }
}