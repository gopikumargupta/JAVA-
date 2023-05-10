public class addarray {
    public static void main(String argas[]){
        int arr[]={4,5,3,9,5,7,0};
        int sum=0;
        int key=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
         if(arr[i]>max){
            max=arr[i];

         }



            sum+=arr[i];
            if(key>arr[i]){
                key=arr[i];
                System.out.println(arr[i]);
            }
            
        }
        System.out.println(sum);
        System.out.print(max);
    }
    
}
