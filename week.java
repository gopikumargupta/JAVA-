import java.util.*;
public class week {
    public static void main(String arug[]){
        Scanner s = new Scanner(System.in);
        System.out.print("enter day 1-7");
        int day =s.nextInt();
        switch(day){
            case 1: System.out.print("MONDAY");
            break;
            case 2: System.out.println("TUESDAY");
            break;
            case 3: System.out.println("WEDNESDAY");
            break;
            case 4: System.out.println("THRUSDAY");
            break;
            case 5: System.out.println("FRIDAY");
            break;
            case 6: System.out.println("SATURDAY");
            break;
            case 7: System.out.println("SUNDAY");
            break;
            default: System.out.println("WRONG INPUT");

        }
    }
    
}
