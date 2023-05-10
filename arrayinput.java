import java.util.*;


public class arrayinput {
    public static void main(String args[]){
        
        Scanner s =new Scanner(System.in);
        
        int arr[]=new int[5];
        System.out.println("element in the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("array elements are");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }





    }
    
}
