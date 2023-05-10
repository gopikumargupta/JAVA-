public class cheakaarraysortedornot {
    public static boolean cheaksort(int arr[],int i){
       if(i==arr.length-1){
        return true;
       }
       if(arr[i]>arr[i+1]){
        return false;
       }
       return cheaksort(arr,i+1);
       
    }

    public static void main(String args[]){
        int arr[]={1,2,5,4,3};
        System.out.print(cheaksort(arr, 0));
    }
    
}
