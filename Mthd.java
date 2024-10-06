import java.util.*;
class Computer // Creating Class
{
    public void playvideo()
    {
        // defining the behaviour of the method
        System.out.println("Playing video..");
    }
    public String getMeAPen( int cost)
    {
        if (cost >= 10)
             return "Pen";

        return "Nothing";
    }
}
public class Mthd {

    public static void main(String[] args) 
    {
       Computer obj = new Computer();  //Creating Object
       obj.playvideo();
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter cost of pen:");
       int cost = sc. nextInt(); //Getting user I/P
       String result = obj.getMeAPen(cost);
       System.out.println("Result:" + result);
    }
}
