public class binaryserch {
    public static int binary(int num[],int key ){
        int start=0,end=num.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]<key){
                end=mid-1;
             
            }else{
                start=mid+1;
            }
            
        }
        return -1;

    }
    public static void main(String args[]){
        //for binary search we always need sorted array
        int num[]={10,9,8,7,6,5,4,3,2,1};
        int key = 3;
        System.out.println("THE INDEX WHERE KEY IS   " + binary(num,key));
        

    }
    
}
