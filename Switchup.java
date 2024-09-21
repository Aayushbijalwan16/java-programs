// In this we assing a variable to switch statement for gatting o/p
import java.util.Scanner;

public class Switchup {
    public static void main(String[] args){
        System.out.println("This is an alarm");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String a = sc.nextLine();
        String result = "";
         
        result = switch(a)
         {
            case "Saturday","Sunday"-> "10:00AM";
            case "Monday"-> "06:00AM";
            default-> "07:00AM";
         };
         System.out.println(result);
    }
}