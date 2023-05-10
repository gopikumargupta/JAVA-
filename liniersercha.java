public class liniersercha {
public static int foundkey(int arr[],int pi){
    for(int i=0;i<arr.length;i++){
        if(arr[i]==pi){
            return i;
        }
    }
    return -1;
}
    public static void main(String args[]){
        int arr[]={10,5,6,543,2,4,6,7,43,25,9,3,33,15,25,26,36};
       int key=26;
       
       
      int index=foundkey(arr,5);
       if(index==-1){
        System.out.print("not found");
       }
       else{
        System.out.println("the index of array is  "+index);
       }
    
}
}

