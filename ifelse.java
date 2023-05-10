import java.util.*;
public class ifelse {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter age");
        int age=s.nextInt();
        if(age>=18){
            System.out.println("adult");
            System.out.println("he can drive");
            System.out.println("to date girls");
            System.out.println("to vote");
            System.out.println("Thank you");
        }
         else if(age>13 && age<18){
            System.out.println("teenager");
            System.out.println("Thank you");
        }
        else{
            System.out.println("not Adult");
            System.out.println("Thank you");
        
        
        }

    }
    
}
