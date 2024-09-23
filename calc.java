// In this we use Objects & Classes
import java.util.*;
class calculator{ //Defining the class
    int c; //Creating variables
    // Creating Methods
    public int add(int a ,int b)
    {
        int r = a + b;
        return r;
    }
}
public class calc {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of a");
    int a = sc. nextInt();
    System.out.println("Enter value of b");
    int b = sc. nextInt();
    calculator calcc = new calculator(); //Creating Object
    int result = calcc.add(a,b);
    // int result = a+b; 
    System.out.println("Sum of a & b is: " + result);
 }
}