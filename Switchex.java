// In this we printing the o/p using variable
import java.util.Scanner;

public class Switchex {
    public static void main(String[] args) {
     System.out.println("This is an alarm");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        String a = sc.nextLine();
         String result = "";
         switch(a)
         {
            case "Saturday","Sunday"-> result = "10:00AM";
            case "Monday"-> result = "06:00AM";
            default-> result = "07:00AM";
         }
         System.out.println(result);
    }
}