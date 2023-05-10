public class selectionsortttt {
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  
    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr.length;j++){
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                } 
            }
            int temp =arr[index];
            arr[index]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String args[]){
        int vrr[] = {56,98,63,98,9,22};
        selection(vrr);
        for(int i=0;i<vrr.length-1;i++){
            System.out.print(vrr[i]);
            System.out.println();
        }
        
        
    }
    
}
