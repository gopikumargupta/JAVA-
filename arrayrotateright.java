public class arrayrotateright {
    public static void main(String args[]){
        int arr[]={11,7,2,5,4,8,5,7,5};
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
