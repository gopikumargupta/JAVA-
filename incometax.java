import java.util.*;
public class incometax {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("enter your income");
        int income = s.nextInt();
        if(income<500000){
            System.out.println("your tax is 0");
        } 
        else if(income >= 500000 && income <= 100000){
            System.out.println("your tax is " + (income*20)/100);
            

        }
        else {
            System.out.println("your tax is" + (income*0.3));
        }

        }
    }
    

