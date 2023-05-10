import java.util.*;
public class stdpassorfail {
    public static void main (String args[]){
Scanner s = new Scanner(System.in);
System.out.println("enter marks of student");
int Marks=s.nextInt();
if(Marks>=33){
    System.out.println("student passed");
}
else{
    System.out.println("student fail");

    // Another type
    String result = Marks >= 33 ? "student pass" : "student fail";
    System.out.println(result);

}
    }
}
