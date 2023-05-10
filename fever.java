import java.util.*;
public class fever {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter temprature of your body");
        float f=s.nextFloat();
        if(f>100){
            System.out.println("you have fever");

        }
        else{
            System.out.println("you dont have fever");
        }
    }
    
}
