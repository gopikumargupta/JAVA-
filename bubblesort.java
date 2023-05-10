public class bubblesort {
    public static void bubblesort(int arr[]){

       
        for(int i=0;i<arr.length-1;i++){
            int swop=0;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int swap;
                    swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                    swop++;


        
                }

            }
            System.out.println("swop after every itration  " + swop);
        }
    }
    public static void main(String args[]){
       int arr[]={8,9,0,6,4,3,2};
       bubblesort(arr);
       for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);

        System.out.println();
       } 
       
       
    }
    
}
