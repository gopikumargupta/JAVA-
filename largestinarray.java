import java.util.*;
public class largestinarray {
    public static int getlargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(largest<arr[i]){
            largest=arr[i];
           }
        }
        return largest;
    }
    public static void main(String args[]){
        int arr[]={1,7,9,10,5,-12,12,2};

        System.out.print(getlargest(arr));
        

    }
    
}
