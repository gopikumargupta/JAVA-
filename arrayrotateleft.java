public class arrayrotateleft {
    

        public static void main(String args[]){
             int arr[]={24,6,8,8,6,3,8,5};
            int temp=arr[0];
            for(int i=1;i<arr.length;i++){
                arr[i-1]=arr[i];
                
            }
            arr[arr.length-1]=temp;
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
    
    
}
