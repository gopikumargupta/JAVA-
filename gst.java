import java.util.*;
public class gst {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter cost of pencil");
        int pancil=s.nextInt();
        System.out.println("enter the value of pen");
        int pen=s.nextInt();
        System.out.println("enter cost of eraser");
        int eraser=s.nextInt();
        float bill=(pancil+pen+eraser);
        System.out.println(bill);
        float gstbill=bill+(bill*0.18f);
        System.out.println(gstbill);

    }
    
}
