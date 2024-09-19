import java.util.*;
public class Lpyr {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        int a = sc. nextInt();
        if (a%4==0) {
            System.out.println("Leap Year " +a);
        } 
        else
        System.out.println("Not a Leap Year " +a);
    }    
}
