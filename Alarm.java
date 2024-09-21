// In this we use update of switch statement
import java.util.*;
public class Alarm {
      public static void main (String args[]){
        System.out.println("This is an alarm");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String a = sc.nextLine();
         
         switch(a)
         {
            case "Saturday" ,"Sunday"->
            System.out.println("10:00AM");
            case "Monday"->
            System.out.println("06:00AM");
            default->
            System.out.println("07:00AM");
         }
      }   
}